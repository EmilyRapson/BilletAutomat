package BilletAutomat;

public class BilletAutomat {

private int balance;
private int billetpris;
private int solgtebilletter;

public BilletAutomat()
{

}


public BilletAutomat(int billetpris)
{
this.billetpris = billetpris;
}


public BilletAutomat (int billetpris, int startbalance)
{
this.billetpris = billetpris;
this.balance = startbalance;
}

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setBilletpris(int billetpris) {
        this.billetpris = billetpris;
    }

    public int getBalance() {
        return balance;
    }

    public int getBilletpris() {
        return billetpris;
    }
}
