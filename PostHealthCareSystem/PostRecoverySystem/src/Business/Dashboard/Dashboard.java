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
        setTitle("Severity Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int Critical = 0;
        int Severe = 0;
        int Mild = 0;
        int Moderate = 0;
        int Stable = 0;

        PatientDirectory patientDirectory = business.getPatientDirectory();
        for (Patient patient : patientDirectory.getPatientList()) {
            if (patient.getSeverity().equals("Critical")) {
                Critical = Critical + 1;
            } else if (patient.getSeverity().equals("Severe")) {
                Severe = Severe + 1;
            } else if (patient.getSeverity().equals("Mild")) {
                Mild = Mild + 1;
            } else if (patient.getSeverity().equals("Moderate")) {
                Moderate = Moderate + 1;
            } else {
                Stable = Stable + 1;
            }

        }

        System.out.println("Critcal:" + Critical);
        lblCritical = new JLabel("Critical: " + Critical);
        lblSevere = new JLabel("Severe: " + Severe);
        lblMild = new JLabel("Mild: " + Mild);
        lblModerate = new JLabel("Moderate: " + Moderate);
        lblStable=new JLabel("Stable: "+Stable);
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Critical", Critical);
        dataset.setValue("Severe", Severe);
        dataset.setValue("Mild", Mild);
        dataset.setValue("Moderate", Moderate);
        dataset.setValue("Stable", Stable);

        JFreeChart chart = ChartFactory.createPieChart("Severity Patient Dashboard", dataset, true, false, false);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionPaint("Critical", new Color(79, 129, 189)); // blue color
        plot.setSectionPaint("Severe", new Color(155, 187, 89)); // green color
        plot.setSectionPaint("Mild", new Color(192, 80, 77)); // red color
        plot.setSectionPaint("Moderate", new Color(128, 100, 162)); // purple color
        plot.setSectionPaint("Stable", new Color(108, 75, 102)); // purple color
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
    }

    public static void main(String[] args) {
        new Dashboard();
    }
}