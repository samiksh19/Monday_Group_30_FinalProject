package Business.DB4OUtil;

import Business.Business;
import Business.ConfigureASystem;
import java.nio.file.Paths;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

/**
 * s
 *
 * @author prac
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(Business.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public Business retrieveSystem() {
        ObjectContainer conn = createConnection();

        if (conn == null) {
            System.err.println("Error: Database connection is null.");
            return null; // Handle the error gracefully in your application
        }

        try {
            // Query the system and fetch it safely
            ObjectSet<Business> systems = conn.query(Business.class);

            Business system;
            if (systems.isEmpty()) {
                system = ConfigureASystem.configure();  // If no system in db, create a new one
            } else {
                system = systems.get(systems.size() - 1); // Get the last system object in the db
            }

            return system;
        } 
        catch (Exception ex) {
            System.err.println("Error retrieving system: " + ex.getMessage());
            ex.printStackTrace(); // Log the exception stack trace for debugging
            return null;  // Return null if an error occurs
        } finally {
            conn.close();  // Ensure that the connection is closed even if there's an error
        }
    }

    
}
