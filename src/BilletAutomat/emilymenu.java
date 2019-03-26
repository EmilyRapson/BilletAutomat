//package BilletAutomat;
//
//public class emilymenu {
//
//
//import java.util.Scanner;
//
//    public class BilletAutomatFælles {
//
//        public static void main(String[] arg) {
//            Billetautomat automaten = new Billetautomat(24, 12);
//            int voksenpris = automaten.getVoksenBilletpris();
//            int børnepris = automaten.getBørneBilletpris();
//
//            System.out.println("Billetprisen er: " + voksenpris + " kroner for voksen og " + børnepris + " kroner for børn");
//
//            Scanner sc = new Scanner(System.in);
//
//            while (true) {
//                System.out.println("Tast 1 for at indsæt penge\n"
//                        + "Tast 2 for at købe voksen billet\n"
//                        + "Tast 3 for at købe børne billet\n"
//                        + "Tast 4 for at tjekke balancen\n"
//                        + "Tast 5 for at aflsutte købet\n"
//                        + "Tast 98 for medarbejder\n"
//                        + "Tast 99 for operatør");
//
//                int valg = sc.nextInt();
//                if (valg == 1) {
//                    System.out.println("Indtast beløb");
//                    int beløb = sc.nextInt();
//                    automaten.indsætPenge(beløb);
//                    if (beløb < voksenpris && beløb < børnepris) {
//                        System.out.println("Beløbet stemmer ikke overens med billetprisen ");
//                    }
//                }
//                if (valg == 2) {
//                    int balance = automaten.getBalance();
//                    int billetprisen = automaten.getVoksenBilletpris();
//                    if (balance >= billetprisen) {
//                        automaten.udskrivBillet(true);
//                    } else {
//                        System.out.println("Beløbet stemmer ikke overens med billetprisen ");
//                    }
//                }
//                if (valg == 3) {
//                    int balance = automaten.getBalance();
//                    int billetprisen = automaten.getBørneBilletpris();
//                    if (balance >= billetprisen) {
//                        automaten.udskrivBillet(false);
//                    } else {
//                        System.out.println("Beløbet stemmer ikke overens med billetprisen ");
//                    }
//                }
//
//                if (valg == 4) {
//                    int bal = automaten.getBalance();
//                    System.out.println("Balance er " + bal);
//                }
//                if (valg == 5) {
//                    int slutbalance = automaten.getBalance();
//                    if (slutbalance > 0) {
//                        System.out.println("Du skal have " + slutbalance + " kr. tilbage");
//                    }
//
//                }
//                if (valg == 98) {
//                    System.out.println("Indtast medarbejder kode: ");
//                    int medarbejderinput = sc.nextInt();
//                    String medarbejderkode = Integer.toString(medarbejderinput);
//
//                    System.out.println("Tast 1 for at aflæse dagenssalg"
//                            + "      Tast 2 for at ændre billetpris");
//                    int medarbejdervalg = sc.nextInt();
//                    if (medarbejdervalg == 1) {
//                        System.out.println("Dagens salg: \n" + automaten.getSamletSalgsbeløb(medarbejderkode) + " kr"
//                                + " Dagens salg af voksenbilletter: \n" + automaten.getAntalVoksenBilletterSolgt()
//                                + " Dagens salg af børnebiletter: " + automaten.getAntalBørneBilletterSolgt());
//
//                    }
//                    if (medarbejdervalg == 2) {
//                        System.out.println("Sæt voksenbilletpris: ");
//                        int nyvoksenbilletpris = sc.nextInt();
//
//                        System.out.println("Sæt børnebilletpris: ");
//                        int nybørnebilletpris = sc.nextInt();
//                        automaten.setBilletpris(medarbejderkode, nyvoksenbilletpris, nybørnebilletpris);
//                    }
//                }
//
//                if (valg == 99) {
//                    System.out.println("Indtast montør kode: ");
//                    int montorinput = sc.nextInt();
//                    String montorkode = Integer.toString(montorinput);
//
//                    System.out.println("Tast 1 for at sætte billetpris"
//                            + "         Tast 2 Angiv startbalance");
//                    int montorvalg = sc.nextInt();
//                    if (montorvalg == 1) {
//                        if (montorvalg == 2) {
//                            System.out.println("Sæt voksenbilletpris: ");
//                            int nyvoksenbilletpris = sc.nextInt();
//
//                            System.out.println("Sæt børnebilletpris: ");
//                            int nybørnebilletpris = sc.nextInt();
//                            automaten.setBilletpris(montorkode, nyvoksenbilletpris, nybørnebilletpris);
//                        }
//
//                        if (montorvalg == 2) {
//                            System.out.println("Indtast start balance: ");
//                            int beløb = sc.nextInt();
//                            automaten.indsætPenge(beløb);
//                            System.out.println("Balancen er nu: " + automaten.getBalance());
//                        }
//
//                    }
//
//                }
//            }
//        }
//    }
//
//}
