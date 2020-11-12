package Car;

import Vitesse.DevinerVitesse;
import com.company.Colors;

public class SlowCar extends Cars {
DevinerVitesse devinerVitesse;
Colors colors;

//    public SlowCar() {
        @Override
                public void check(){
            devinerVitesse = new DevinerVitesse();
            System.out.println(devinerVitesse.initTab());
        }
//    }
}
