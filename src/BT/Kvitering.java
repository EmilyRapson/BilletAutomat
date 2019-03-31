package BT;

public class Kvitering extends Betaling
{


    private int antalBilletterSolgt;

    public void udskrivBillet(boolean kviteringsValg)
    {

//        udskriv billet skal kaldes i GUI knappen hvis indbetalingen er godkendt

        BilletTyper bt = new BilletTyper();

        antalBilletterSolgt = antalBilletterSolgt + 1;
        setBalance(0);             // Nulstil balance

        System.out.println("##########B##T##########");
        System.out.println("# Borgen Trafikselskab #");
        System.out.println("#                      #");
        if (kviteringsValg == true) {
            System.out.println("#        Voksenbillet  #");
            System.out.println("#        " + bt.getVoksenpris() + " kr.        #");
        } else {
            System.out.println("#        Børnebillet   #");
            System.out.println("#        " + bt.getBornepris() + " kr.        #");
        }
        System.out.println("#                      #");
        System.out.println("# Du har " + getBalance() + " kr til gode#");
        System.out.println("##########B##T##########");
        System.out.println();


    }

}
