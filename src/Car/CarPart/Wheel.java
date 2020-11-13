package Car.CarPart;

import java.util.Random;
import java.util.Scanner;

public class Wheel extends CarPart {
    String wheel = "erdfs";
    String scrumble;
    int i;


    public String initTab2() {
        //création d'un tableau
        scrumble = "";
        Random r = new Random();
        StringBuilder sb = new StringBuilder(wheel);
//        for(int j = 1; j <= 4; j++) {
        for (i = 0; i < wheel.length(); i++) {
            int index = r.nextInt(sb.length());
            scrumble += sb.charAt(index);
            sb.deleteCharAt(index);
        }
//            i = 0;
//        }
        return scrumble;
    }

    @Override
    public void eventsFast() {
        super.eventsFast();
        String scrumble = initTab2();
        System.out.println(scrumble);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Recopie la suite");
        String comparaison = scanner.nextLine();

        while (!(comparaison.equals(scrumble))) {
            System.out.println("retry");
            comparaison = scanner.nextLine();
        }
        System.out.println("bravo");
    }

}


