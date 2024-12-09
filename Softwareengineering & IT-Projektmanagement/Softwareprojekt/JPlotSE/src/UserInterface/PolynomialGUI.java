package src.UserInterface;

import src.DataStructure.Polynomial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PolynomialGUI {
    public static void main(String[] args) {

        // Create the main frame
        JFrame frame = new JFrame("Polynomial Parser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create input field and label
        JTextField polynomialInput = new JTextField();
        JLabel inputLabel = new JLabel("Enter Polynomial:");
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(inputLabel, BorderLayout.NORTH);
        inputPanel.add(polynomialInput, BorderLayout.CENTER);

        // Create parse button and result label
        JButton parseButton = new JButton("Parse Polynomial");
        JLabel resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add action listener to the parse button
        parseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = polynomialInput.getText();
                try {
                    // Create a Polynomial object from the input
                    Polynomial polynomial = new Polynomial(input);
                    resultLabel.setText(polynomial.toString());
                } catch (Exception ex) {
                    resultLabel.setText("Error parsing polynomial: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        // Add components to the frame
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(parseButton, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}