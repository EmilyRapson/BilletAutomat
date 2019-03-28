package BilletAutomat;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class Transaktioner {

    BilletAutomatKlasse bt = new BilletAutomatKlasse();
    public HashMap<String, Integer> transaktioner = new HashMap<String, Integer>();


    public void indsætpenge()
    {

    }


    public void returPenge()
    {

    }


    public void kvitering()
    {

    }

    public void Voksen(int input)
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




//    public void setTransaktionsListe() throws IOException
////    {
////        priser.Voksen();
////        priser.Borne();
////        priser.Tillag();
////        priser.Hunde();
////
////        java.io.FileWriter fil = new java.io.FileWriter(" Transaktion.txt");
////        PrintWriter ud = new PrintWriter(fil);
////
////        ud.println("========== transaktioner pr " + new Date());
////
////        for (String liste : priser.transaktioner.keySet())
////        {
////            ud.println(liste);
////        }
////        ud.println("==========");
////
////        ud.close();
////    }


}
