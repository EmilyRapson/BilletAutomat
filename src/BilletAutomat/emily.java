package BilletAutomat;

public class emily {
    package billetautomatfælles;

    /**
     * Model af en simpel billetautomat til enkeltbilletter med en fast pris.
     */
    public class Billetautomat {

        private int voksenpris;    // Prisen for én voksenbillet.
        private int børnepris;      //prisen for èn børnebillet
        private int balance; // Hvor mange penge kunden p.t. har puttet i automaten
        private int antalVoksenBilletterSolgt; // Antal billetter automaten i alt har solgt
        private int antalBørneBilletterSolgt; // Antal billetter automaten i alt har solgt
        private int samletOmsætning; //beløb der er solgt for

        /**
         * Opret en billetautomat, der sælger billetter til en given billetpris.
         *
         * @param billetpris skal være større end nul (p.t. bliver det ikke tjekket)
         */
        public Billetautomat(int billetpris1, int billetpris2) {
            voksenpris = billetpris1;
            børnepris = billetpris2;
        }

        /**
         * Opret en billetautomat, der sælger billetter til en given billetpris
         *
         * @param billetpris skal være større end nul (p.t. bliver det ikke tjekket)
         * @param startbalance mængden af penge automaten allerede indeholder
         */
        public Billetautomat(int billetpris1, int billetpris2, int startbalance) {
            voksenpris = billetpris1;       //rette jeg har fjernet int
            børnepris = billetpris2;
            balance = startbalance;
        }

        /**
         * Giver prisen for en billet.
         */
        public int getVoksenBilletpris() {
            int resultat = voksenpris;
            return resultat;
        }

        public int getBørneBilletpris() {
            int resultat = børnepris;
            return resultat;
        }

        /**
         * Modtag nogle penge (i kroner) fra en kunde.
         */
        public void indsætPenge(int beløb) {
            balance = balance + beløb;
        }

        /**
         * Giver balancen (beløbet maskinen har modtaget til den næste billet).
         */
        public int getBalance() {
            return balance;
        }

        /**
         * Udskriv en billet.
         */
        public void udskrivBillet(boolean voksenbillet) {
            // antalVoksenBilletterSolgt = antalVoksenBilletterSolgt + 1; rykker ned til efter if
            if (voksenbillet == true) {
                balance = balance - voksenpris;             // Nulstil balance // rettet fejl balancen skal skrives !=0
                samletOmsætning = samletOmsætning + voksenpris;
                antalVoksenBilletterSolgt = antalVoksenBilletterSolgt + 1;
            } else {
                balance = balance - børnepris;
                samletOmsætning = samletOmsætning + børnepris;
                antalBørneBilletterSolgt = antalBørneBilletterSolgt + 1;
            }

            System.out.println("##########B##T##########");
            System.out.println("# Borgen Trafikselskab #");
            System.out.println("#                      #");
            if (voksenbillet == true) {
                System.out.println("#        Voksenbillet  #");
                System.out.println("#        " + voksenpris + " kr.        #");
            } else {
                System.out.println("#        Børnebillet   #");
                System.out.println("#        " + børnepris + " kr.        #");
            }
            System.out.println("#                      #");
            System.out.println("# Du har " + balance + " kr til gode#");
            System.out.println("##########B##T##########");
            System.out.println();
        }

        public void setBilletpris(String montørkode, int nyPris, int nyBørnebilletpris) {
            if (montørkode.equals("1234")) {
                voksenpris = nyPris;
                børnepris = nyBørnebilletpris;
            } //tiløjet {}
            else {
                System.err.println("Kunne ikke sætte pris - forkert kode");
            }
        }

        public int getSamletSalgsbeløb(String montørkode) {
            if (montørkode.equals("1234"));
            return samletOmsætning;
        }

        public int getAntalBørneBilletterSolgt() {
            return antalBørneBilletterSolgt;
        }

        public int getAntalVoksenBilletterSolgt() {
            return antalVoksenBilletterSolgt;
        }

    }



