package Menu;

import java.util.Scanner;

public class Rules {
    public static void rules() {

        Scanner scanner = new Scanner(System.in);
        String retourMenuPrincipal;


        //Affichage des règles
        System.out.println("Rules ae simple : ");
        System.out.println("");
        System.out.println("It's a race car. The goal ? Finish FIRST");
        System.out.println("We have two speed's car ");
        System.out.println("Type 1 for a speeding car but having 30% chance of failing components");
        System.out.println("-Type 2 for a slow car but having 50% chance of having a speeding boost");
        System.out.println("But it is too simple ! So during the race many events During the race, events will take place to prevent you from crossing the finish line. ");
        System.out.println("");
        System.out.println("Events are : ");
        System.out.println("For type 1 : ");
        System.out.println("The word speed that will appear in the disorder. It will therefore have to be returned");
        System.out.println("");
        System.out.println("For type 2 : ");
        System.out.println("The word speed that will appear in the disorder. It will therefore be necessary to rewrite it in the same order");

        System.out.println("For go at the main menu type R");
        retourMenuPrincipal = scanner.next();

        //condition pour retourner au menu principal
        if(retourMenuPrincipal.equals("R") || retourMenuPrincipal.equals("r")) {
            Menu.menu();
        }
    }
}
