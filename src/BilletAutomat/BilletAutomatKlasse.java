package BilletAutomat;

public class BilletAutomatKlasse {

private int balance;
private int pris;
private int tillæg;
private String BilletType;

//   tom konstruktør
    public BilletAutomatKlasse()
    {

    }


//   konstruktør med 3 argumenter der skal sætte vores priser, billet typer og tillæg;
    public BilletAutomatKlasse(String billettype,  int billetpris)
    {
        this.pris = billetpris;
        this.BilletType = billettype;
    }


    public int setBalance(int balance)
    {
        this.balance = balance;

        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public int setPris(int pris)
    {
        this.pris = pris;

        return pris;
    }


    public int getPris()
    {
        return pris;
    }

    public int setTillæg(int tillæg) {
        this.tillæg = tillæg;

        return tillæg;
    }

    public int getTillæg() {
        return tillæg;
    }
}
