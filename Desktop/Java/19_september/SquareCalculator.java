import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareCalculator extends JFrame {

    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public SquareCalculator() {

        inputField = new JTextField(10);
        calculateButton = new JButton("Calculate Square");
        resultLabel = new JLabel("Result: ");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double number = Double.parseDouble(inputField.getText());

                    double square = number * number;

                    resultLabel.setText("Result: " + square);
                } catch (NumberFormatException ex) {

                    resultLabel.setText("Please enter a valid number!");
                }
            }
        });

        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Enter a number:"));
        add(inputField);
        add(calculateButton);
        add(resultLabel);

        setTitle("Square Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SquareCalculator();

    }
}
