package BT;


public class BilletTyper{

    private int voksenpris;
    private int bornepris;


    public BilletTyper()
    {

    }

    public BilletTyper(int voksenpris, int bornepris)
    {
        this.voksenpris = voksenpris;
        this.bornepris = bornepris;
    }


    private int antalBilletterSolgt;

    public void setVoksenpris(int voksenpris) {
        this.voksenpris = voksenpris;
    }

    public void setBornepris(int bornepris) {
        this.bornepris = bornepris;
    }

    public int getBornepris() {
        return bornepris;
    }

    public int getVoksenpris() {
        return voksenpris;
    }



}
