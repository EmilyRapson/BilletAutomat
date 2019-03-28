package BilletAutomat;

public class BilletAutomatKlasse {

private int balance;
private int voksenpris;
private int bornepris;



//   tom konstruktør
    public BilletAutomatKlasse()
    {

    }

    public BilletAutomatKlasse(int voksenpris, int bornepris)
    {
        this.voksenpris = voksenpris;
        this.bornepris = bornepris;
    }

    public void setVoksenpris(int voksenpris)
    {
        this.voksenpris = voksenpris;
    }

    public int getVoksenpris()
    {
        return voksenpris;
    }


    public void setBornepris(int bornepris)
    {
        this.bornepris = bornepris;
    }



    public int getBornepris()
    {
        return bornepris;
    }



    public int setBalance(int beløb)
    {
        balance = balance + beløb;
        return balance;
    }


    public int getBalance()
    {
        return balance;
    }

}
