package Vitesse;

import Car.SlowCar;
import java.util.Random;
import java.util.Scanner;

public class DevinerVitesse {
    Scanner scanner = new Scanner(System.in);
    String message = "VITESSE";
    String scrumble;

    public String initTab() {
        /**
         * Fonction qui creer un tableau pour l'event vitesse
         */
    //création d'un tableau
        scrumble = "";
        Random r = new Random();
        StringBuilder sb = new StringBuilder(message);
        for (int i = 0; i < message.length(); i++) {
            int index = r.nextInt(sb.length());
            scrumble += sb.charAt(index);
            sb.deleteCharAt(index);
        }
        System.out.println(scrumble);
        return scrumble;
    }

    public void event(SlowCar car){
        /**
         * Fonction qui active l'event vitesse et verifie si le jouer reussi ou non
         */
    //si l'utilisateur rentre le meme mot qui est écrit au dessus, alors il
    //gagne un boost, sinon rien ne change
        System.out.println("Ecrivez ");
        String m = scanner.next();

        if (m.equals(scrumble)){
            System.out.println("Tu as gagné un boost");
            car.speed += 25;
            System.out.println(car.speed);
        } else {
            System.out.println("tu n'as pas gagné de boost !");
        }
    }
}
