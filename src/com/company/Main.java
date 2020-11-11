package com.company;

import Menu.Menu;
import Vitesse.DevinerVitesse;
import java.util.Random;
import java.util.Scanner;

public class Main  extends DevinerVitesse {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        DevinerVitesse devinerVitesse= new DevinerVitesse();
        String message[] = {"V", "I", "T", "E", "S", "S", "E"};

        int r = devinerVitesse.Random(6);
        String message2[] = {
                message[r]= "V",
                message[r]= "I",
                message[r]= "T",
                message[r]= "E",
                message[r]= "S",
                message[r]= "S",
                message[r]= "E"};


        //Menu.menu();
        DevinerVitesse.tabVitesse(message);
        DevinerVitesse.tabVitesse(message2);
        Colors.choiceColors();

    }
}
