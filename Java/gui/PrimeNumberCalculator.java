package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class PrimeNumberCalculator extends JFrame {
    private JButton startButton;
    private JProgressBar progressBar;
    private JTextArea primeNumbersTextArea;

    public PrimeNumberCalculator() {
        setTitle("Prime Number Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        startButton = new JButton("Start Calculation");
        progressBar = new JProgressBar();
        primeNumbersTextArea = new JTextArea(10, 20);
        primeNumbersTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(primeNumbersTextArea);

        panel.add(startButton, BorderLayout.NORTH);
        panel.add(progressBar, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.SOUTH);

        add(panel);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                startPrimeNumberCalculation();
            }
        });
    }

    private void startPrimeNumberCalculation() {
        SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
            @Override
            protected Void doInBackground() throws Exception {
                int progress = 0;
                for (int i = 2; i <= 1000; i++) {
                    if (isPrime(i)) {
                        publish(i);
                    }
                    progress = (int) ((double) i / 1000 * 100);
                    setProgress(progress);
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                for (int prime : chunks) {
                    primeNumbersTextArea.append(prime + "\n");
                }
            }
        };

        worker.addPropertyChangeListener(new PropertyChangeListener()) {
            public void propertyChange(PropertyChangeEvent evt) {
                if ("progress".equals(evt.getPropertyName())) {
                    progressBar.setValue((Integer) evt.getNewValue());
                }
            }
        });

        worker.execute();
    }

    private boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PrimeNumberCalculator calculator = new PrimeNumberCalculator();
            calculator.setVisible(true);
        });
    }
}