package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FibonacciGUI extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;

    public FibonacciGUI() {
        setTitle("Fibonacci Number Generator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel inputLabel = new JLabel("Enter the number of Fibonacci numbers:");
        inputField = new JTextField(10);

        JButton generateButton = new JButton("Generate");
        generateButton.addActionListener(this);

        outputArea = new JTextArea(10, 20);
        outputArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(outputArea);

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(generateButton);

        add(panel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int count = Integer.parseInt(inputField.getText());
            generateFibonacciNumbers(count);
        } catch (NumberFormatException ex) {
            outputArea.setText("Invalid input. Please enter a valid integer.");
        }
    }

    private void generateFibonacciNumbers(int count) {
        long a = 0, b = 1;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append(a).append(", ");
            long temp = a + b;
            a = b;
            b = temp;
        }

        outputArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FibonacciGUI gui = new FibonacciGUI();
            gui.setVisible(true);
        });
    }
}
