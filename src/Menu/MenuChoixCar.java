package Menu;

import Car.Cars;
import Car.SlowCar;
import com.company.Colors;

import java.util.Scanner;

public class MenuChoixCar {
    Race race;

    public void ChoixCar() {

        Scanner scanner = new Scanner(System.in);
        String mainMenu;

        do { // Si la saisie du choix est incorrecte
            //Choix du menu à ouvrir
            System.out.println("---- CHOISIS TON STYLE DE VOITURE: ----");
            System.out.println(); // Sauter une ligne
            System.out.println("    -1 LENTE MAIS SÉCURISÉ"); // Tape 1 si il veut lancer une partie
            System.out.println("    -2 RAPIDE ET FURIEUSE");// Tape 2 si il veut voir les règles
            System.out.println("    -0 Left the game"); // Tape 0 si il veut quitter le jeu

            mainMenu = scanner.next(); // Choix de l'utilisateur

        } while (!(mainMenu.equals("1") || mainMenu.equals("2") || mainMenu.equals("0")));

        if (mainMenu.equals("0")) {
            System.exit(0);
        } else {
            if (mainMenu.equals("1")) {
                race = new Race(0);
            } else{
                race = new Race(1);
            }
            Colors colors = Colors.choiceColors();
            race.getCars().setColors(colors);
            race.startRace();
        }
    }
}

