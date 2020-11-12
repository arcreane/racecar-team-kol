package Menu;


import Car.Cars;
import Car.FastCar;
import Car.SlowCar;
import com.company.Colors;

public class Race {
    Cars cars;

    public Race(int choice) {
        if (choice == 0) {
            cars = new SlowCar();
        } else {
            cars = new FastCar();
        }
    }
    public Cars getCars() {
        return cars;
    }

    public void startRace() {
        System.out.println("LA COURSE VA COMMENCER !!!");
        System.out.println("TUTUTUTUTUTUTU");
        System.out.println("LE DÉPART EST DONNÉ !!!");
        cars.check();
    }
}
