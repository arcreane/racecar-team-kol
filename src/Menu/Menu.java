package Menu;

import java.util.Scanner;

    public class Menu {

        public static void menu() {

            Scanner scanner = new Scanner(System.in);
            String mainMenu;

            //Choix du menu à ouvrir
            System.out.println("---- Welcome on CAR RACE. Type the number corresponding to your request: ----");
            System.out.println(); // Sauter une ligne
            System.out.println("    -1 Play"); // Tape 1 si il veut lancer une partie
            System.out.println("    -2 Rules");// Tape 2 si il veut voir les règles
            System.out.println("    -0 Left the game"); // Tape 0 si il veut quitter le jeu

            mainMenu = scanner.next(); // Choix de l'utilisateur

            //Boucle si le caractère tapé n'est pas le bon, pour réouvrir le menu principal
            while (!(mainMenu.equals("1") || mainMenu.equals("2") || mainMenu.equals("0") || mainMenu.equals("3"))){ // Si la saisie du choix est incorrecte
                System.out.println("Votre saisie est incorrecte. Tapez le chiffre correspondant en fonction de ce que vous voulez faire");
                System.out.println();
                System.out.println("    -1 Play");
                System.out.println("    -2 Rules");
                System.out.println("    -0 Left the game");

                mainMenu = scanner.next();
            }

            //condition pour menu Jeu
            if (mainMenu.equals("1")) {
                //Implémenter la fonction pour jouer
                System.out.println("Le jeu : ");
                //Mettre la fonction de jeu
            }

            //condition pour afficher les règles
            else if (mainMenu.equals("2")){
                //mettre la fonction de règles
                Rules.rules();
            }

            //condition pour quitter le jeu
            else if (mainMenu.equals("0")) {
                System.out.println("Quitter le jeu");
            }

        }
    }
