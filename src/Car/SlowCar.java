package Car;

import Vitesse.DevinerVitesse;
import com.company.Colors;

import java.util.Random;

public class SlowCar extends Cars {
    DevinerVitesse devinerVitesse;
    Random r;

    public SlowCar() {
        //initialisation de la vitesse de la voiture lente
        this.speed = 50;
        r = new Random();
        devinerVitesse = new DevinerVitesse();
    }

    public void check() {
        if (r.nextInt(101) < 101){
            manegeEvent();
        }
        System.out.println(devinerVitesse.initTab());
    }

    private void manegeEvent() {
        //appel le mot
        devinerVitesse.initTab();
        //rentrer mot pour boost
        devinerVitesse.event(this);
    }
}