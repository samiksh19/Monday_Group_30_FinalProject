/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Dashboard;
import javax.swing.*;
import Business.DB4OUtil.DB4OUtil;
import Business.Business;
import Business.Patients.Patient;
import Business.Patients.PatientDirectory;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author anzal
 */
public class Dashboard extends JFrame {
    private JLabel lblCritical;
    private JLabel lblSevere;
    private JLabel lblMild;
    private JLabel lblModerate;
    private JLabel lblStable;
    private JLabel lblOrders;
    private Business business;
    
    public Dashboard() {
        DB4OUtil db4OUtil = DB4OUtil.getInstance();
        
        business = db4OUtil.retrieveSystem();
        
        //window
        setTitle("Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int Critical=0;
        int Severe=0;
        int Mild=0;
        int Moderate=0;
        int Stable=0;
        
        PatientDirectory patientDirectory = business.getPatientDirectory();
        for (Patient patient : patientDirectory.getPatientList()) {
         if(patient.getSeverity().equals("High")){
             Critical=Critical+1;
          }
         else if(patient.getSeverity().equals("Severe")){
             Severe=Severe+1;
          }
         else if(patient.getSeverity().equals("Mild")){
             Mild=Mild+1;
          }
         else if(patient.getSeverity().equals("Moderate")){
             Moderate=Moderate+1;
          }
         else{
             Stable=Stable+1;
         }

        
         
        
        }
        
        System.out.println("Critcal:"+Critical);
        lblCritical = new JLabel("Critical Patients: " + Critical);
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Critical", Critical);
        dataset.setValue("Severe", Critical); 
        dataset.setValue("Mild", Critical);
        dataset.setValue("Moderate", Critical);
        dataset.setValue("Stable", Critical);

         
        
         JFreeChart chart = ChartFactory.createPieChart("Dashboard", dataset, true, false, false);
         PiePlot plot = (PiePlot) chart.getPlot();
         plot.setSectionPaint("Critical", new Color(79, 129, 189)); // blue color
         plot.setSectionPaint("Severe", new Color(155, 187, 89)); // green color
         plot.setSectionPaint("Mild", new Color(192, 80, 77)); // red color
         plot.setSectionPaint("Moderate", new Color(128, 100, 162)); // purple color
         plot.setSectionPaint("Stable", new Color(108,75 , 102)); // purple color
         ChartPanel chartPanel = new ChartPanel(chart);
         chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
         
       JPanel panel = new JPanel();
        panel.add(lblCritical);
        panel.add(lblSevere);
        panel.add(lblMild);
        panel.add(lblModerate);
        panel.add(lblStable);
        
        
        add(panel);
        panel.add(chartPanel);
        
        //display
        setVisible(true);
         
        
        System.out.println("End of dashboard");
        //swing_comp
//        lblUsers = new JLabel("States: " + system.getStateList().size());
//        lblOrganizations = new JLabel("Manufactureres: " + system.getManufacturerDirectory().getManufacturerDirectory().size());
//        lblEmployees = new JLabel("Diseases: " + system.getDiseaseDirectory().getdiseaseDirectory().size());
//        lblCustomers = new JLabel("Drugs: " + system.getVaccineDirectory().getVaccineCatalog().size());
//        
//        
//        //pie_chart
//        DefaultPieDataset dataset = new DefaultPieDataset();
//    dataset.setValue("States", system.getStateList().size());
//    dataset.setValue("Manufacturers", system.getManufacturerDirectory().getManufacturerDirectory().size());
//    dataset.setValue("Diseases", system.getDiseaseDirectory().getdiseaseDirectory().size());
//    dataset.setValue("Drugs", system.getVaccineDirectory().getVaccineCatalog().size());
//    
//    // Create the pie chart
//    JFreeChart chart = ChartFactory.createPieChart("Dashboard", dataset, true, false, false);
//    PiePlot plot = (PiePlot) chart.getPlot();
//plot.setSectionPaint("States", new Color(79, 129, 189)); // blue color
//plot.setSectionPaint("Manufacturers", new Color(155, 187, 89)); // green color
//plot.setSectionPaint("Diseases", new Color(192, 80, 77)); // red color
//plot.setSectionPaint("Drugs", new Color(128, 100, 162)); // purple color
//       // Create a chart panel and add it to the panelx
//    ChartPanel chartPanel = new ChartPanel(chart);
//    chartPanel.setPreferredSize(new java.awt.Dimension(500, 300));
//    
//       
//        
//        JButton btnViewUsers = new JButton("View States");
//        JButton btnViewOrganizations = new JButton("View Manufactureres");
//        JButton btnViewEmployees = new JButton("View Diseases");
//        JButton btnViewCustomers = new JButton("View Drugs");
//        
//        //event listeners
//        //btnViewUsers.addActionListener(e -> new UsersView(system));
//       // btnViewOrganizations.addActionListener(e -> new OrganizationsView(system));
//       // btnViewEmployees.addActionListener(e -> new EmployeesView(system));
//       // btnViewCustomers.addActionListener(e -> new CustomersView(system));
//        
//        JPanel panel = new JPanel();
//        panel.add(lblUsers);
//        panel.add(lblOrganizations);
//        panel.add(lblEmployees);
//        panel.add(lblCustomers);
//        add(panel);
//        panel.add(chartPanel);
//        
//        //display
//        setVisible(true);
 }
    
    public static void main(String[] args) {
        new Dashboard();
    }
}
