package hw7;

import javax.swing.*;
import java.awt.event.*;

/**
 * @Author: Matthew Mauger
 * Calculator that performs simple calculations. Has separate class to handle calculations
 * outside of user interface.
 */
class Calculator {

    JFrame f;
    JTextField t;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclr;
    JButton brecip, bsquare, bsqrt;

    static double a = 0, b = 0, result = 0;
    static String operator;
    String[] resultArray;

    /**
     * Constructor sets up the calculator with it's frame and buttons.
     * Added action listeners to buttons via Anonymous classes.
     */
    Calculator() {
        f = new JFrame("Calculator");
        t = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdiv = new JButton("/");
        bmul = new JButton("*");
        bsub = new JButton("-");
        badd = new JButton("+");
        bdec = new JButton(".");
        beq = new JButton("=");
        bdel = new JButton("Delete");
        bclr = new JButton("Clear");

        //New Buttons
        brecip = new JButton("1/x");
        bsquare = new JButton("x^2");
        bsqrt = new JButton("sqrt(x)");

        t.setEditable(false);
        t.setBounds(30, 40, 280, 30);
        b7.setBounds(40, 100, 50, 40);
        b8.setBounds(110, 100, 50, 40);
        b9.setBounds(180, 100, 50, 40);
        bdiv.setBounds(250, 100, 50, 40);

        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bmul.setBounds(250, 170, 50, 40);

        b1.setBounds(40, 240, 50, 40);
        b2.setBounds(110, 240, 50, 40);
        b3.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);

        bdec.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);

        bdel.setBounds(60, 460, 100, 40);
        bclr.setBounds(180, 460, 100, 40);

        brecip.setBounds(40, 380, 80, 40);
        bsquare.setBounds(130, 380, 80, 40);
        bsqrt.setBounds(220, 380, 80, 40);

        f.add(t);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclr);

        f.add(brecip);
        f.add(bsquare);
        f.add(bsqrt);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(350, 550);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLocationRelativeTo(null);

        //Numeric Buttons

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("1"));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("2"));
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("3"));
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("4"));
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("5"));
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("6"));
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("7"));
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("8"));
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("9"));
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("0"));
            }
        });

        //Add, Divide, Multiply, Subtract

        badd.addActionListener(new ActionListener() {
            @Override
            /**
             * Set the operator to a string to later pass to the "PerformCalculationBasedOnOperationMethod"
             * Sett all of the operation buttons to false so that the user can't continue to press them.
             */
            public void actionPerformed(ActionEvent actionEvent) {
                operator = "add";
                t.setText(t.getText().concat("+"));

                badd.setEnabled(false);
                bsub.setEnabled(false);
                bmul.setEnabled(false);
                bdiv.setEnabled(false);
                brecip.setEnabled(false);
                bsquare.setEnabled(false);
                bsqrt.setEnabled(false);
            }
        });
        bdiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator = "divide";
                t.setText(t.getText().concat("/"));

                badd.setEnabled(false);
                bsub.setEnabled(false);
                bmul.setEnabled(false);
                bdiv.setEnabled(false);
                brecip.setEnabled(false);
                bsquare.setEnabled(false);
                bsqrt.setEnabled(false);
            }
        });
        bmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator = "multiply";
                t.setText(t.getText().concat("*"));

                badd.setEnabled(false);
                bsub.setEnabled(false);
                bmul.setEnabled(false);
                bdiv.setEnabled(false);
                brecip.setEnabled(false);
                bsquare.setEnabled(false);
                bsqrt.setEnabled(false);
            }
        });
        bsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                operator = "subtract";
                t.setText(t.getText().concat("-"));

                badd.setEnabled(false);
                bsub.setEnabled(false);
                bmul.setEnabled(false);
                bdiv.setEnabled(false);
                brecip.setEnabled(false);
                bsquare.setEnabled(false);
                bsqrt.setEnabled(false);
            }
        });

        //Reciprocal, Square, Square Root

        brecip.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    operator = "reciprocal";
                    a = Double.parseDouble(t.getText());
                    result = PerformCalculation.PerformCalculationBasedOnOperation(operator, a, 0);
                    t.setText("" + result);
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(f, "There was an error performing the calculation. \nPlease make sure the input field is correct.", "Error In Calculation", JOptionPane.ERROR_MESSAGE);
                    t.setText("");
                }
            }
        });

        bsquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    operator = "square";
                    a = Double.parseDouble(t.getText());
                    result = PerformCalculation.PerformCalculationBasedOnOperation(operator, a, 0);
                    t.setText("" + result);
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(f, "There was an error performing the calculation. \nPlease make sure the input field is correct.", "Error In Calculation", JOptionPane.ERROR_MESSAGE);
                    t.setText("");
                }
            }
        });

        bsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    operator = "sqrt";
                    a = Double.parseDouble(t.getText());
                    result = PerformCalculation.PerformCalculationBasedOnOperation(operator, a, 0);
                    t.setText("" + result);
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(f, "There was an error performing the calculation. \nPlease make sure the input field is correct.", "Error In Calculation", JOptionPane.ERROR_MESSAGE);
                    t.setText("");
                }
            }
        });

        //Perform Calculation

        beq.addActionListener(new ActionListener() {
            @Override
            /**
             * When the user presses the equal button, it splits the text into two elements.
             * We split by the operation symbol to get the two numbers. We set 'a' and 'b' to the first and second elements in the array.
             * We then pass the operator the user choose along with the two numbers to the Static Method to separate the calculation from the UI.
             * If the calculation goes through, we print the result. If an error is thrown, we catch it and display an error message in a message box.
             * Finally, re-enable all of the buttons.
             */
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    resultArray = t.getText().split("[^0-9 .]");
                    a = Double.parseDouble(resultArray[0]);
                    b = Double.parseDouble(resultArray[1]);
                    result = PerformCalculation.PerformCalculationBasedOnOperation(operator, a, b);
                    t.setText("" + result);
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(f, "There was an error performing the calculation. \nPlease make sure the input field is correct.", "Error In Calculation", JOptionPane.ERROR_MESSAGE);
                    t.setText("");
                }
                finally {
                    badd.setEnabled(true);
                    bsub.setEnabled(true);
                    bmul.setEnabled(true);
                    bdiv.setEnabled(true);
                    brecip.setEnabled(true);
                    bsquare.setEnabled(true);
                    bsqrt.setEnabled(true);
                }
            }
        });

        //Decimal Point

        bdec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText(t.getText().concat("."));
            }
        });

        //Clear Numbers

        bclr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                t.setText("");

                badd.setEnabled(true);
                bsub.setEnabled(true);
                bmul.setEnabled(true);
                bdiv.setEnabled(true);
                brecip.setEnabled(true);
                bsquare.setEnabled(true);
                bsqrt.setEnabled(true);
            }
        });

        //Delete a Character

        bdel.addActionListener(new ActionListener() {
            @Override
            /**
             * Every time the user deletes a character, we check to see if the operation character is still there.
             * If the character is still there, leave all of the operation buttons as false. Otherwise, re-enable them.
             */
            public void actionPerformed(ActionEvent actionEvent) {
                String s = t.getText();
                t.setText("");
                for (int i = 0; i < s.length() - 1; i++) {
                    t.setText(t.getText() + s.charAt(i));
                }

                if(t.getText().contains("+") || t.getText().contains("-") ||
                   t.getText().contains("*") || t.getText().contains("/")){
                    badd.setEnabled(false);
                    bsub.setEnabled(false);
                    bmul.setEnabled(false);
                    bdiv.setEnabled(false);
                    brecip.setEnabled(false);
                    bsquare.setEnabled(false);
                    bsqrt.setEnabled(false);
                }
                else{
                    badd.setEnabled(true);
                    bsub.setEnabled(true);
                    bmul.setEnabled(true);
                    bdiv.setEnabled(true);
                    brecip.setEnabled(true);
                    bsquare.setEnabled(true);
                    bsqrt.setEnabled(true);
                }
            }
        });

    }

    public static void main(String[] args) {

        new Calculator();
    }
}
