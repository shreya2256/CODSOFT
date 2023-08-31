import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UniqueCurrencyConverter {

    // Function to convert from rupees
    // to the dollar and vice-versa
    // using Java Swing
    public static void createConverter() {

        // Creating a new frame using JFrame
        JFrame frame = new JFrame("Unique Currency Converter");

        // Creating labels
        JLabel rupeesLabel, dollarsLabel;

        // Creating text fields.
        JTextField rupeesField, dollarsField;

        // Creating buttons
        JButton inrButton, usdButton, closeButton;

        // Setting label texts and bounds
        rupeesLabel = new JLabel("Rupees:");
        rupeesLabel.setBounds(20, 40, 60, 30);
        dollarsLabel = new JLabel("Dollars:");
        dollarsLabel.setBounds(170, 40, 60, 30);

        // Initializing text fields and setting bounds
        rupeesField = new JTextField("0");
        rupeesField.setBounds(80, 40, 50, 30);
        dollarsField = new JTextField("0");
        dollarsField.setBounds(240, 40, 50, 30);

        // Creating buttons and setting bounds
        inrButton = new JButton("INR");
        inrButton.setBounds(50, 80, 60, 15);
        usdButton = new JButton("USD");
        usdButton.setBounds(190, 80, 60, 15);
        closeButton = new JButton("Close");
        closeButton.setBounds(150, 150, 60, 30);

        // Adding action listener for INR button
        inrButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double rupees = Double.parseDouble(rupeesField.getText());
                double dollars = rupees / 82.67;
                dollarsField.setText(String.valueOf(dollars));
            }
        });

        // Adding action listener for USD button
        usdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double dollars = Double.parseDouble(dollarsField.getText());
                double rupees = dollars * 82.67;
                rupeesField.setText(String.valueOf(rupees));
            }
        });

        // Adding action listener to close the form
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        // Default method for closing the frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Adding components to the form
        frame.add(rupeesLabel);
        frame.add(rupeesField);
        frame.add(dollarsLabel);
        frame.add(dollarsField);
        frame.add(inrButton);
        frame.add(usdButton);
        frame.add(closeButton);

        frame.setLayout(null);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // Driver code
    public static void main(String args[]) {
        createConverter();
    }
}
