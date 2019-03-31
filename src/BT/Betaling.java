package BT;

public class Betaling extends BilletTyper{


    private int balance;
    private String kundeKode;


    public int setBalance(int input)
    {
        balance = balance + input;
        return balance;
    }


    public int getBalance()
    {
        return balance;
    }



}
