package Car;

import Vitesse.DevinerVitesse;
import com.company.Colors;

public class SlowCar extends Cars {
    DevinerVitesse devinerVitesse;
    Colors colors;
    Cars cars;

    public SlowCar() {
        this.speed = 50;
    }

    public void check() {
        devinerVitesse = new DevinerVitesse();
        System.out.println(devinerVitesse.initTab());
    }
}