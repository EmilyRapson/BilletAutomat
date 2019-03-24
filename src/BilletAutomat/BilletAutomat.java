package BilletAutomat;

public class BilletAutomat {

private int balance;
private int pris;
private int zone;
private String BilletType;

//   tom konstruktør
    public BilletAutomat()
    {

    }

//   konstruktør med 3 argumenter der skal sætte vores priser, billet typer og zoner;
    public BilletAutomat (String billettype, int zone , int billetpris)
    {
        this.pris = billetpris;
        this.BilletType = billettype;
        this.zone = zone;
    }


    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public void setPris(int pris)
    {
        this.pris = pris;
    }

    public int getBalance() {
        return balance;
    }

    public int getPris()
    {
        return pris;
    }
}
