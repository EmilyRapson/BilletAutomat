/*
 * Created by JFormDesigner on Sun Mar 24 15:25:34 CET 2019
 */
package GUI;

import javax.swing.plaf.*;
import BilletAutomat.*;
import BilletAutomat.BilletAutomatKlasse;

import java.awt.*;
import javax.swing.*;

import net.miginfocom.swing.*;

/**
 * @author unknown
 */
public class BilletKundeGUI extends JPanel {

    BilletAutomatKlasse bt = new BilletAutomatKlasse();

/*
    BilletAutomatKlasse voksenBillet = new BilletAutomatKlasse("VoksenBillet", bt.getPris());
    BilletAutomatKlasse børneBillet = new BilletAutomatKlasse("BørneBillet", 12);
    BilletAutomatKlasse cykelBillet = new BilletAutomatKlasse("CykelBillet", 12);
    BilletAutomatKlasse hundeBillet = new BilletAutomatKlasse("HundeBillet", 12);
    BilletAutomatKlasse tillægsbillet = new BilletAutomatKlasse("TillægsBillet", 12);
*/

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
        labelVoksen = new JLabel();
        spinnerVoksen = new JSpinner();
        voksenPriser = new JTextField();
        labelBarn = new JLabel();
        spinnerBarn = new JSpinner();
        barnePriser = new JTextField();
        labelTotal2 = new JLabel();
        totalPriser2 = new JTextField();
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
                "[fill]" +
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
            mainPanel.add(voksenPriser, "cell 4 2");

            //---- labelBarn ----
            labelBarn.setText("Barn");
            labelBarn.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelBarn.setForeground(Color.black);
            mainPanel.add(labelBarn, "cell 2 3");

            //---- spinnerBarn ----
            spinnerBarn.setModel(new SpinnerNumberModel(0, 0, 10, 1));
            spinnerBarn.setBackground(Color.white);
            mainPanel.add(spinnerBarn, "cell 3 3");
            mainPanel.add(barnePriser, "cell 4 3");

            //---- labelTotal2 ----
            labelTotal2.setText("                 Total: ");
            labelTotal2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
            labelTotal2.setForeground(Color.black);
            mainPanel.add(labelTotal2, "cell 3 7");
            mainPanel.add(totalPriser2, "cell 4 7");

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
    private JLabel labelVoksen;
    private JSpinner spinnerVoksen;
    private JTextField voksenPriser;
    private JLabel labelBarn;
    private JSpinner spinnerBarn;
    private JTextField barnePriser;
    private JLabel labelTotal2;
    private JTextField totalPriser2;
    private JButton kortKnap2;
    private JButton møntKnap2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


}