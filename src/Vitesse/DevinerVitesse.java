package Vitesse;

import java.util.Random;

public class DevinerVitesse {
    String message = "VITESSE";
    String scrumble;


    public int Random(int max) {
        //nombre aléatoire
        Random r = new Random();
        return r.nextInt(max);
    }

    public String initTab() {
        //création d'un tableau
        scrumble = "";
        Random r = new Random();
        StringBuilder sb = new StringBuilder(message);
        for (int i = 0; i < message.length(); i++) {
            int index = r.nextInt(sb.length());
            scrumble += sb.charAt(index);
            sb.deleteCharAt(index);
        }
        return scrumble;
    }
}
