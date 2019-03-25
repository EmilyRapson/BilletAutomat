package BilletAutomat;

import java.util.Scanner;

public class priser {


    public int setVoksenpris(int Voksenpris) {
            if (Voksenpris > 0) {
            Scanner consol = new Scanner(System.in);
            Voksenpris = consol.nextInt();

        }
            return Voksenpris;
    }

        public int setBornepris(int Bornepris) {
                if (Bornepris > 0) {
                Scanner consol = new Scanner(System.in);
                Bornepris = consol.nextInt();
            }
                return Bornepris;
        }
        public int setTillagpris(int Tillagpris) {
             if (Tillagpris > 0) {
                Scanner consol = new Scanner(System.in);
                Tillagpris = consol.nextInt();
        }
                return Tillagpris;
    }
         public int setHundepris(int Hundepris) {
            if (Hundepris > 0) {
            Scanner consol = new Scanner(System.in);
            Hundepris = consol.nextInt();
        }
            return Hundepris;
    }

}
