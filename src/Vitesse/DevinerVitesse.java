package Vitesse;

import java.util.Random;

public class DevinerVitesse {
    String message[] = {"V", "I", "T", "E", "S", "S", "E"};
    Random random= new Random();

    public int [] InitTab(int tTaille) {
        //création d'un tableau
        int monTableau[] = new int[tTaille];
        for (int i = 0; i < tTaille; i++){
            monTableau[i] = i;
        }
        return monTableau;
    }

    public void AfficherTab(int [] tab) {
        //affiche tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print("| " +message[i]+ " |");
        }
    }
    public static void tabVitesse(String args[]) {
        DevinerVitesse devinerVitesse=new DevinerVitesse();
        devinerVitesse.AfficherTab(devinerVitesse.InitTab(7));

    }

}
