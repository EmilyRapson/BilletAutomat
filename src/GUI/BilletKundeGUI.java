/*
 * Created by JFormDesigner on Sun Mar 24 15:25:34 CET 2019
 */

package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.*;
import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class BilletKundeGUI extends JPanel {

    public static void main(String[] args)
    {
        BilletKundeGUI gui = new BilletKundeGUI();

        JFrame frame = new JFrame("Borgen Trafik A/S");
        frame.setContentPane(new BilletKundeGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public BilletKundeGUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Farid Haiba
        mainPanel = new JPanel();
        cykelPriser = new JTextField();
        labelVoksen = new JLabel();
        spinnerVoksen = new JSpinner();
        labelBarn = new JLabel();
        spinnerBarn = new JSpinner();
        hundePriser = new JTextField();
        labelCykel = new JLabel();
        spinnerCykel = new JSpinner();
        barnePriser = new JTextField();
        labelHund = new JLabel();
        spinnerHund = new JSpinner();
        voksenPriser = new JTextField();
        labelTillæg = new JLabel();
        spinnerTillæg2 = new JSpinner();
        totalPriser2 = new JTextField();
        labelTotal2 = new JLabel();
        tillægsPriser2 = new JTextField();
        kortKnap2 = new JButton();
        møntKnap2 = new JButton();

        //======== mainPanel ========
        {
            mainPanel.setBackground(new Color(238, 238, 238));

            // JFormDesigner evaluation mark
            mainPanel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), mainPanel.getBorder())); mainPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            mainPanel.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));
            mainPanel.add(cykelPriser, "cell 4 2");

            //---- labelVoksen ----
            labelVoksen.setText("Voksen");
            labelVoksen.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelVoksen.setForeground(Color.black);
            mainPanel.add(labelVoksen, "cell 2 2");

            //---- spinnerVoksen ----
            spinnerVoksen.setModel(new SpinnerNumberModel(0, 0, 10, 1));
            spinnerVoksen.setForeground(Color.darkGray);
            spinnerVoksen.setBackground(Color.white);
            mainPanel.add(spinnerVoksen, "cell 3 2");

            //---- labelBarn ----
            labelBarn.setText("Barn");
            labelBarn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelBarn.setForeground(Color.black);
            mainPanel.add(labelBarn, "cell 2 3");

            //---- spinnerBarn ----
            spinnerBarn.setModel(new SpinnerNumberModel(0, 0, 10, 1));
            spinnerBarn.setBackground(Color.white);
            mainPanel.add(spinnerBarn, "cell 3 3");
            mainPanel.add(hundePriser, "cell 4 3");

            //---- labelCykel ----
            labelCykel.setText("Cykel");
            labelCykel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelCykel.setForeground(Color.black);
            mainPanel.add(labelCykel, "cell 2 4");

            //---- spinnerCykel ----
            spinnerCykel.setModel(new SpinnerNumberModel(0, 0, 10, 1));
            spinnerCykel.setBackground(Color.white);
            mainPanel.add(spinnerCykel, "cell 3 4");
            mainPanel.add(barnePriser, "cell 4 4");

            //---- labelHund ----
            labelHund.setText("Hund");
            labelHund.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelHund.setForeground(Color.black);
            mainPanel.add(labelHund, "cell 2 5");

            //---- spinnerHund ----
            spinnerHund.setModel(new SpinnerNumberModel(0, 0, 10, 1));
            spinnerHund.setBackground(Color.white);
            mainPanel.add(spinnerHund, "cell 3 5");
            mainPanel.add(voksenPriser, "cell 4 5");

            //---- labelTillæg ----
            labelTillæg.setText("Till\u00e6g");
            labelTillæg.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelTillæg.setForeground(Color.black);
            mainPanel.add(labelTillæg, "cell 2 6");

            //---- spinnerTillæg2 ----
            spinnerTillæg2.setModel(new SpinnerNumberModel(0, 0, 8, 1));
            spinnerTillæg2.setBackground(Color.white);
            spinnerTillæg2.setForeground(Color.white);
            mainPanel.add(spinnerTillæg2, "cell 3 6");
            mainPanel.add(totalPriser2, "cell 4 6");

            //---- labelTotal2 ----
            labelTotal2.setText("                 Total: ");
            labelTotal2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelTotal2.setForeground(Color.black);
            mainPanel.add(labelTotal2, "cell 3 7");
            mainPanel.add(tillægsPriser2, "cell 4 7");

            //---- kortKnap2 ----
            kortKnap2.setText("Kort Betaling");
            kortKnap2.setForeground(Color.black);
            mainPanel.add(kortKnap2, "cell 3 12");

            //---- møntKnap2 ----
            møntKnap2.setText("M\u00f8nt Betal");
            møntKnap2.setForeground(Color.black);
            mainPanel.add(møntKnap2, "cell 4 12");
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Farid Haiba
    private JPanel mainPanel;
    private JTextField cykelPriser;
    private JLabel labelVoksen;
    private JSpinner spinnerVoksen;
    private JLabel labelBarn;
    private JSpinner spinnerBarn;
    private JTextField hundePriser;
    private JLabel labelCykel;
    private JSpinner spinnerCykel;
    private JTextField barnePriser;
    private JLabel labelHund;
    private JSpinner spinnerHund;
    private JTextField voksenPriser;
    private JLabel labelTillæg;
    private JSpinner spinnerTillæg2;
    private JTextField totalPriser2;
    private JLabel labelTotal2;
    private JTextField tillægsPriser2;
    private JButton kortKnap2;
    private JButton møntKnap2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}
