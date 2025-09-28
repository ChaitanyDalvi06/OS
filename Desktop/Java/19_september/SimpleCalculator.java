import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField number1Field = new JTextField(10);
        JTextField number2Field = new JTextField(10);

        JLabel resultLabel = new JLabel("Result will be displayed here");

        JButton addButton = new JButton("ADD");
        JButton subtractButton = new JButton("Subtract");
        JButton resetButton = new JButton("Reset");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int result = num1 + num2;
                    resultLabel.setText("Sum: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(number1Field.getText());
                    int num2 = Integer.parseInt(number2Field.getText());
                    int result = num1 - num2;
                    resultLabel.setText("Difference: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers");
                }
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1Field.setText("");
                number2Field.setText("");
                resultLabel.setText("Result will be displayed here");
            }
        });

        frame.getContentPane().add(new JLabel("Enter First Number"));
        frame.getContentPane().add(number1Field);
        frame.getContentPane().add(new JLabel("Enter Second Number"));
        frame.getContentPane().add(number2Field);
        frame.getContentPane().add(addButton);
        frame.getContentPane().add(subtractButton);
        frame.getContentPane().add(resetButton);
        frame.getContentPane().add(resultLabel);

        frame.setVisible(true);
        
    }
}
