import java.util.*;

public class vending {
    public static void main(String[] args) {
        System.out.println("CHOCOLADE VENDING MACHINE");
        System.out.println("1. Mars: €0,90");
        System.out.println("2. Twix: €0,95");
        System.out.println("3. Snickers: €0,85");
        System.out.println("4. Bounty: €1,00");


        int tien, vijf;
        int keuze = 0;
        int geld = 0;
        int hoeveel = 0;


        String[] producten = new String[4];

        producten[0] = "Mars";
        producten[1] = "Twix";
        producten[2] = "Snickers";
        producten[3] = "Bounty";


        int[] kosten = new int[4];

        kosten[0] = 90;
        kosten[1] = 95;
        kosten[2] = 85;
        kosten[3] = 100;



        System.out.println("Selecteer jouw product.");
        Scanner input = new Scanner(System.in);
        keuze = input.nextInt();

        System.out.println("Hoeveel cent heeft u?");

        geld = input.nextInt();

        if ((geld >= 85) && (geld <= 100)) {

            switch (keuze) {
                case 1:
                    if (geld < 90){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {

                        System.out.println("Je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Mars gekozen. - .90");
                        hoeveel = geld - kosten[0];

                        System.out.println("Jouw wisselgeld: " + hoeveel + "cent");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");

                    }
                    break;

                case 2:
                    if (geld < 95){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                        System.out.println("Je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Twix gekozen. - .95");
                        hoeveel = geld - kosten[1];
                        System.out.println("Jouw wisselgeld: " + hoeveel + " cent");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");

                    }
                    break;

                case 3:
                    if (geld < 85){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                        System.out.println("je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Snickers gekozen. - 1,00");
                        hoeveel = geld - kosten[2];
                        System.out.println("Jouw wisselgeld: " + hoeveel + " cent.");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");
                    }
                    break;

                case 4:
                    if (geld < 100){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                        System.out.println("Je hebt: " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Bounty gekozen -.85");
                        hoeveel = geld - kosten[3];
                        System.out.println("Jouw wisselgeld: " + hoeveel + " cent");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");
                    }
                    break;

                default:

                    System.out.println("Je moet een keuze maken tussen 1 en 4.");
            }

        } else {
            if (geld < 85) {
                System.out.println("Je moet minimaal 85 cent inwerpen.");

            }
            if (geld > 100) {
                System.out.println("Je hebt teveel ingeworpen, maximaal 100cent!");
            }
        }

    }
}