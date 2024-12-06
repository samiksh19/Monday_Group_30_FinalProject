/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.DBO4OUtil;

import Business.ConfigureASystem;
import Business.Business;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
/**
 *
 * @author samik
 */
public class DB4OUtil {
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    public synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    public ObjectContainer createConnection() {
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
            if (db != null) {
            System.out.println("Database connected successfully.");
            } else {
                System.err.println("Database connection failed.");
            }
            return db;
        } catch (Exception ex) {
            System.err.println("Error during DB4O connection: " + ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(Business system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public Business retrieveSystem(){
        ObjectContainer conn = createConnection();
        
        if (conn == null) {
        System.err.println("Error: Database connection is null.");
        return null; // Handle the error gracefully in your application
    }
        
        ObjectSet<Business> systems = conn.query(Business.class); // Change to the object you want to save
        Business system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size()-1);
        }
        conn.close();
        return system;
    }
}
