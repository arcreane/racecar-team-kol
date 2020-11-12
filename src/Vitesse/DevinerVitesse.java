package Vitesse;

import java.util.Random;

public class DevinerVitesse {
    String message[] = {"V", "I", "T", "E", "S", "S", "E"};
    String message2[] = {   message[Random(6)]= "V",
                            message[Random(6)]= "I",
                            message[Random(6)]= "T",
                            message[Random(6)]= "E",
                            message[Random(6)]= "S",
                            message[Random(6)]= "S",
                            message[Random(6)]= "E"};

    public int Random(int max){
    //nombre aléatoire
        Random r = new Random();
        return r.nextInt(max);
    }

    public int [] InitTab(int tTaille) {
    //création d'un tableau
        int monTableau[] = new int[tTaille];
        for (int i = 0; i < tTaille; i++){
            monTableau[i] = i;
        }
        return monTableau;
    }

    public void AfficherTab(int [] tab) {
    //affichage d'un tableau tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print("| " +message[i]+ " |");
        }
    }

    public void AfficherTab2(int [] tab) {
    //affichage du tableau modifié
        for (int i = 0; i < tab.length; i++) {
            System.out.print("| " +message2[i]+ " |");
        }
    }

    public static void tabVitesse(String args[]) {
    //affichage / appel des tableaux
        DevinerVitesse devinerVitesse=new DevinerVitesse();
        //devinerVitesse.AfficherTab(devinerVitesse.InitTab(7));

        devinerVitesse.AfficherTab2(devinerVitesse.InitTab(7));
    }

}
