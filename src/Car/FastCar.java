package Car;

import Car.CarPart.Motor;

import java.util.Scanner;

public class FastCar extends Cars {
    Motor motor;
    double random = Math.random();
    Cars cars;

        public void check(){
            cars.speed = 100;
            motor = new Motor();
            //String nbList = motor.initTab();
            String nbList = "bonjour";
            System.out.println(nbList);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Recopie la suite");
            String comparaison = scanner.nextLine();

            while (!(comparaison.equals(nbList))) {
                System.out.println("retry");
                comparaison = scanner.nextLine();
            }

            System.out.println("bravo");
        }
    }