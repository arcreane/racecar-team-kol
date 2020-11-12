package Car.CarPart;

import java.util.Random;

public class Motor {



    public class Engine{


        String scrumbleEngine;

        public int Random(int max) {
            //nombre aléatoire
            java.util.Random r = new Random();
            return r.nextInt(max);
        }

        public String initTab() {
            //création d'un tableau
            int i;
            scrumbleEngine = "";
            Random r = new Random();
            for (i = 0; i <= 5; i++) {
                int index = r.nextInt(9);
                scrumbleEngine += r;
            }
            return scrumbleEngine;
        }
    }
}





