package Menu;

import java.util.Scanner;

public class Rules {
    public static void rules() {
        /**
         * Fonction qui affiche les regles du jeu
         */

        Scanner scanner = new Scanner(System.in);
        String returnMainMenu;


        //Affichage des règles
        System.out.println("Les règles sont simples : ");
        System.out.println("");
        System.out.println("C'est une course de voiture ! Les règles sont simples : arriver 1ER ");
        System.out.println("Il y a 2 type de voitures : ");
        System.out.println("- Type 1 pour une voiture rapide mais qui a  30% de chance d'avoir une panne");
        System.out.println("- Type 2 pour une voiture lente mais vous avez 50% de chance d'avoir un boost de vitesse");
        System.out.println("Les événements qui vous empécheront d'arriver 1er à la ligne d'arriver sont :");
        System.out.println("");
        System.out.println("Pour le type 1: ");
        System.out.println("Votre moteur ou vos roues auront quelques difficultés durant la course. À vous de les réparer le plus rapidement possible");
        System.out.println("");
        System.out.println("Pour le type 2 : ");
        System.out.println("Le mot 'VITESSE' apparaitera dans le désordre, a vous de bien le réécrire !");
        System.out.println();
        System.out.println("Bonne chance dans RACE CAR ! Que le sort vous soit favorable");
        System.out.println();
        System.out.println("POur retourner au menu tapez R");
        returnMainMenu = scanner.next();

        //condition pour retourner au menu principal
        if(returnMainMenu.equals("R") || returnMainMenu.equals("r")) {
            Menu.menu();
        }
    }
}
