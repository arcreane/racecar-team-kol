package Car;

import Vitesse.DevinerVitesse;
import com.company.Colors;

import java.util.Random;

public class SlowCar extends Cars {
    DevinerVitesse devinerVitesse;

    Random r;

    public SlowCar() {
        /**
         * Fonction qui initialise la vitesse de la voiture
         */
        //initialisation de la vitesse de la voiture lente
        this.speed = 50;
        r = new Random();
        devinerVitesse = new DevinerVitesse();
    }

    public void check() {
        /**
         * Fonction qui donne le pourcentage de l'event vitesse
         */
        if (r.nextInt(101) < 101){
            manegeEvent();
        }
        System.out.println(devinerVitesse.initTab());
    }

    private void manegeEvent() {
        /**
         * Fonction qui creer l'event vitesse
         */
        //appel le mot
        devinerVitesse.initTab();
        //rentrer mot pour boost
        devinerVitesse.event(this);
    }
}