package Car;

import Vitesse.DevinerVitesse;
import com.company.Colors;

public class SlowCar extends Cars {
DevinerVitesse devinerVitesse;
Colors colors;
Cars cars;


//    public SlowCar()
                public void check(){
            cars.speed = 50;
            devinerVitesse = new DevinerVitesse();
            System.out.println(devinerVitesse.initTab());
        }
//    }
}
