package BilletAutomat;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class BilletMenuMain {


    public static void main(String[] args) throws IOException
    {

       BilletAutomatKlasse bt = new BilletAutomatKlasse(20, 20);




        int get = bt.getVoksenpris();

        System.out.println(get);



//        String linjestr = new String(Files.readAllBytes(Paths.get("Transaktion.txt")));
//        System.out.println(linjestr);
    }
}




