package Menu;

import Car.Cars;
import Car.FastCar;
import Car.SlowCar;

public class Race {

    public Cars cars;
    boolean isFinish = false;
    float distanceLap = 10000;
    int currentLap = 0;
    int nbLaps = 5;
    int nbCycle = 0;
    private float travelDistance;

    public Race(int choice) {
    //mode de jeu lent ou rapide
        if (choice == 0) {
            cars = new SlowCar();
        } else {
            cars = new FastCar();
        }
    }

    public Cars getCars() {
    //return de la voiture choisie
        return cars;
    }

    public void startRace() {
    //active parcours
        while (!isFinish) {
        //quand c'est fini :
            cars.write();
            update();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Merci d'avoir joué ! :D");
    }

    public void update() {
    //affichage a chaque tour de l'etat du parcours
        travelDistance += cars.speed * 1000 / 60;
        if (travelDistance >= distanceLap) {
            float superiorTravelDistance = travelDistance - distanceLap;
            travelDistance = 0 + superiorTravelDistance;
            currentLap += 1;
        }
        if (currentLap > nbLaps) {
            isFinish = true;
        } else {
            System.out.println("La distance parcourue est de " + travelDistance +
                    "m , il reste " + (distanceLap - travelDistance) + "m avant la fin du tour");
            if (currentLap == nbLaps) {
                System.out.println("Dernier tour ! Nombre de cycle : " + nbCycle);
            } else {
                System.out.println("Tour actuel : " + currentLap + "/" + nbLaps + " Nombre de cycle : " + nbCycle);
            }
            nbCycle += 1;
        }
        cars.check();
    }
}
