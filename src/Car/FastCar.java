package Car;

import Car.CarPart.CarPart;
import Car.CarPart.Motor;
import Car.CarPart.Wheel;

import java.util.Random;
import java.util.Scanner;

public class FastCar extends Cars {
    CarPart[] parts;
    Random r;

    public FastCar() {
    //initialisation de la vitesse de la voiture rapide
        this.speed = 100;
        r = new Random();
        parts = new CarPart[2];
        parts[0] = new Motor();
        parts[1] = new Wheel();
    }

    public void check() {
        if (r.nextInt(101) < 36 ) {
            manageEvent();
        }
    }

    public void manageEvent() {
        parts[r.nextInt(parts.length)].eventsFast();
    }
}
