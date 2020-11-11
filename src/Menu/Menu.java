package Menu;

import java.util.Scanner;

    public class Menu {

        public static void menu() {

            Scanner scanner = new Scanner(System.in);
            String choixMenuPrincipal;

            //Choix du menu à ouvrir
            System.out.println("---- Bienvenue sur CAR RACE. Tapez le chiffre correspondant en fonction de ce que vous voulez faire : ----");
            System.out.println(); // Sauter une ligne
            System.out.println("    -1 Jouer"); // Tape 1 si il veut lancer une partie
            System.out.println("    -2 Voir les règles");// Tape 2 si il veut voir les règles
            System.out.println("    -0 Quitter le jeu"); // Tape 0 si il veut quitter le jeu

            choixMenuPrincipal = scanner.next(); // Choix de l'utilisateur

            //Boucle si le caractère tapé n'est pas le bon, pour réouvrir le menu principal
            while (!(choixMenuPrincipal.equals("1") || choixMenuPrincipal.equals("2") || choixMenuPrincipal.equals("0") || choixMenuPrincipal.equals("3"))){ // Si la saisie du choix est incorrecte
                System.out.println("Votre saisie est incorrecte. Tapez le chiffre correspondant en fonction de ce que vous voulez faire");
                System.out.println();
                System.out.println("    -1 Jouer");
                System.out.println("    -2 Voir les règles");
                System.out.println("    -0 Quitter le jeu");

                choixMenuPrincipal = scanner.next();
            }

            //condition pour menu Jeu
            if (choixMenuPrincipal.equals("1")) {
                //Implémenter la fonction pour jouer
                System.out.println("Le jeu : ");
                //Mettre la fonction de jeu
            }

            //condition pour afficher les règles
            else if (choixMenuPrincipal.equals("2")){
                //mettre la fonction de règles
            }

            //condition pour quitter le jeu
            else if (choixMenuPrincipal.equals("0")) {
                System.out.println("Quitter le jeu");
            }

        }
    }
