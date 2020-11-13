package Car.CarPart;

import Car.Cars;

import java.util.Random;
import java.util.Scanner;

public class Motor extends CarPart {

    public String initTab() {
        /**
         * fonction pour initier le tableau qui contiendra les chiffres utiliser pour réparer le moteur.
        **/

        int maxTab = 5;
        String nbList = "";
        Random r = new Random();
        for (int i = 0; i < maxTab; i++) {
            nbList += r.nextInt(10);
        }
        return nbList;
    }

    @Override
    public void eventsFast() {
        /**
         * Fonction pour vérifier que la suite de nombre donner par initTab correspond a celle ecrite par le joueur
         * sinon il recommence.
         */
        super.eventsFast();

        String nbList = initTab();
        System.out.println(nbList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recopie la suite");
        String comparaison = scanner.nextLine();

        while (!(comparaison.equals(nbList))) {
            System.out.println("retry");
            comparaison = scanner.nextLine();
        }
        System.out.println("bravo");
    }
}




