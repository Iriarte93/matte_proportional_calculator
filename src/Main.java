/* 
 # Matte Proportions Calculator #
 A Java-based (Java 17) utility for estimating the real size of distant objects
 from camera frame proportions using similar triangles, 
 useful for photography, matte painting, and previsualization.
 Author: Aitor Iriarte
 2023
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::buildGUI);
    }

    private static void buildGUI() {
    	//Window initialization
        JFrame frame = new JFrame("Matte proportions calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 250);
        frame.setLocationRelativeTo(null);
        
        // Form
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel labelAuthor = new JLabel("Author: Aitor Iriarte");
        
        JLabel labelD = new JLabel("Distance to objects in meters (D):");
        JTextField fieldD = new JTextField("0");

        JLabel labelHObjeto = new JLabel("Object height on scale (h Objeto):");
        JTextField fieldHObjeto = new JTextField("0");

        JLabel labelHTotal = new JLabel("Total scale height (h Total):");
        JTextField fieldHTotal = new JTextField("0");

        JLabel labelResultado = new JLabel("Estimated real height:");
        JLabel resultado = new JLabel("0");

        JButton botonCalcular = new JButton("Calculate");
        JButton botonLimpiar = new JButton("Clear");

        botonCalcular.addActionListener((ActionEvent e) -> {
            try {
                double D = Double.parseDouble(fieldD.getText());
                double hObjeto = Double.parseDouble(fieldHObjeto.getText());
                double hTotal = Double.parseDouble(fieldHTotal.getText());

                if (hTotal == 0) {
                    resultado.setText("Error: h total = 0");
                } else {
                    double H = D * (hObjeto / hTotal);
                    resultado.setText(String.format("%.2f", H));
                }

            } catch (NumberFormatException ex) {
                resultado.setText("Invalid input");
            }
        });

        botonLimpiar.addActionListener(e -> {
            fieldD.setText("0");
            fieldHObjeto.setText("0");
            fieldHTotal.setText("0");
            resultado.setText("0");
        });

        panel.add(labelD);
        panel.add(fieldD);

        panel.add(labelHObjeto);
        panel.add(fieldHObjeto);

        panel.add(labelHTotal);
        panel.add(fieldHTotal);

        panel.add(labelResultado);
        panel.add(resultado);

        panel.add(botonCalcular);
        panel.add(botonLimpiar);
        
        panel.add(labelAuthor);

        frame.add(panel);
        frame.setVisible(true);
    }
}