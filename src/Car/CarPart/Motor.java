package Car.CarPart;

import java.util.Random;

public class Motor {


    public String initTab() {
        int maxTab = 5;
        String nbList = "";
        Random r = new Random();
        for (int i = 0; i < maxTab; i++) {
            nbList += r.nextInt(10);
        }
        return nbList;
    }
}




