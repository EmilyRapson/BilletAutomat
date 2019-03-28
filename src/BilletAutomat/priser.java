package BilletAutomat;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class priser{



    public HashMap<String, Integer> transaktioner = new HashMap<String, Integer>();

    BilletAutomatKlasse bt = new BilletAutomatKlasse();



    public void Voksen()
    {

        if (bt.getVoksenpris() > 0)
        {
            transaktioner.put(new Date() + " " + "Voken billet", bt.getBornepris());
        }
    }

    public void Borne()
    {
        if (bt.getBornepris() > 0)
        {
            transaktioner.put(new Date() + " Børne billet", bt.getBornepris());
        }

    }




    public void setTransaktionsListe() throws IOException
    {
        Voksen();
        Borne();

        java.io.FileWriter fil = new java.io.FileWriter(" Transaktion.txt");
        PrintWriter ud = new PrintWriter(fil);

        ud.println("========== transaktioner pr " + new Date());

        for (String liste : transaktioner.keySet())
        {
            ud.println(liste);
        }
        ud.println("==========");

        ud.close();
    }


}


