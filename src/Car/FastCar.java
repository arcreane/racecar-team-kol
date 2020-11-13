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
        /**
         * Fonction qui initialise la vitesse de la voiture
         */
    //initialisation de la vitesse de la voiture rapide
        this.speed = 100;
        r = new Random();
        parts = new CarPart[2];
        parts[0] = new Motor();
        parts[1] = new Wheel();
    }

    public void check() {
        /**
         * fonction qui verifie le pourcentage de chance de tomber en panne
         */
        if (r.nextInt(101) < 36 ) {
            manageEvent();
        }
    }

    public void manageEvent() {
        parts[r.nextInt(parts.length*100)/100].eventsFast();
    }
}
