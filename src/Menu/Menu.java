package Menu;


import java.util.Scanner;

    public class Menu {

        public static void menu() {
            /**
             * Fonction qui creer le menu
             */
        //création du menu
            Scanner scanner = new Scanner(System.in);
            String mainMenu;

            //Choix du menu à ouvrir
            System.out.println("---- Bienvenue sur CAR RACE. Entre le numéro pour séléctionner ton option : ----");
            System.out.println(); //Sauter une ligne
            System.out.println("    -1 Jouer"); //Tape 1 si il veut lancer une partie
            System.out.println("    -2 Règels");//Tape 2 si il veut voir les règles
            System.out.println("    -0 Quitter le jeu"); //Tape 0 si il veut quitter le jeu

            mainMenu = scanner.next(); //Choix de l'utilisateur

            //Boucle si le caractère tapé n'est pas le bon, pour réouvrir le menu principal
            while (!(mainMenu.equals("1") || mainMenu.equals("2") || mainMenu.equals("0") || mainMenu.equals("3"))){
                System.out.println("Votre saisie est incorrecte. Tapez le chiffre correspondant en fonction de ce que vous voulez faire");
                System.out.println();
                System.out.println("    -1 Jouer");
                System.out.println("    -2 Règles");
                System.out.println("    -0 Quitter la partie");

                mainMenu = scanner.next();
            }

            //condition pour menu Jeu
            if (mainMenu.equals("1")) {
                MenuChoixCar menuChoixCar = new MenuChoixCar();
                menuChoixCar.ChoixCar();
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
