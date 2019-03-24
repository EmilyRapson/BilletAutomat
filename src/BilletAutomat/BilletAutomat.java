package BilletAutomat;

public class BilletAutomat {

private int balance;
private int pris;
private int zoner;
private String BilletType;

//   tom konstruktør
    public BilletAutomat()
    {

    }

    public BilletAutomat(String billetType, int zoner)
    {
        this.BilletType = billetType;
        this.zoner = zoner;
    }

//   konstruktør med 3 argumenter der skal sætte vores priser, billet typer og zoner;
    public BilletAutomat (String billettype, int zoner , int billetpris)
    {
        this.pris = billetpris;
        this.BilletType = billettype;
        this.zoner = zoner;
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
