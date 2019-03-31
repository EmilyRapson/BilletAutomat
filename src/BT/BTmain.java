package BT;

import GUI.GUIMenu;

import javax.swing.*;
import java.util.Scanner;

public class BTmain {



    public static void main(String[] arg)
    {


        GUIMenu panel = new GUIMenu();      // opret panelet

        JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue på skærmen
        vindue.add( panel );                          // vis panelet i vinduet

        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagér på luk
        vindue.setSize(350,70);                       // sæt vinduets størrelse
        vindue.pack();
        vindue.setVisible(true);                      // åbn vinduet

        System.out.println("Vinduet blev åbnet");


    }

}


