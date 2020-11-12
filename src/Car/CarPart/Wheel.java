package Car.CarPart;

import java.util.Random;

public class Wheel {

    public class wheel  {
        String wheel = "ZQSD";

        String scrumble;


        public int Random(int max) {
            //nombre aléatoire
            Random r = new Random();
            return r.nextInt(max);
        }

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
        }
    }

