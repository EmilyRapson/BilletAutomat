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





//    public int samletkøb()
//    {
//       denne funktion kalder info fra spinner (GUI) og oversætter værdien
//       fra billet typer, så billet typer returnere pris
//    }


//    public int returBeløb()
//    {
//        int returPenge =  samletkøb() -  balance;
//        return returPenge;
//    }


    public void getKortBataling(String kundeKode)
    {
        if (kundeKode.equals("1234"))
        {
//            hent texfeld  knappen og udprint til textfeld at koden er korrekt
//            og der udprintes kvittering
        }
        else
        {
//            text felt fra gui med en meddelelse om at koden er forkert
//            prøv igen.
        }
    }


}
