package BilletAutomat;

import java.util.Scanner;

public class priser {


    public int setVoksenpris(int voksenpris) {
            if (voksenpris > 0) {
            Scanner consol = new Scanner(System.in);
            voksenpris = consol.nextInt();

        }
            return voksenpris;
    }

        public int setBornepris(int bornepris) {
                if (bornepris > 0) {
                Scanner consol = new Scanner(System.in);
                bornepris = consol.nextInt();
            }
                return bornepris;
        }

        public int setTillagpris(int tillagpris) {
             if (tillagpris > 0) {
                Scanner consol = new Scanner(System.in);
                tillagpris = consol.nextInt();
        }
                return tillagpris;
    }

         public int setHundepris(int hundepris) {
            if (hundepris > 0) {
            Scanner consol = new Scanner(System.in);
            hundepris = consol.nextInt();
        }
            return hundepris;
    }

}
