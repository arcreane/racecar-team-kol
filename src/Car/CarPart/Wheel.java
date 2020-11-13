package Car.CarPart;

import java.util.Random;

public class Wheel extends CarPart {

    String wheel = "ZQSD";

    String scrumble;


    public String initTab() {
        //création d'un tableau
        int i;
        scrumble = "";
        Random r = new Random();
        StringBuilder sb = new StringBuilder(wheel);
        for (i = 0; i < wheel.length(); i++) {
            int index = r.nextInt(sb.length());
            scrumble += sb.charAt(index);
            sb.deleteCharAt(index);
        }

        return scrumble;
    }

    @Override
    public void eventsFast() {
        super.eventsFast();

    }
}


