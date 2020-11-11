package com.company;

import Menu.Menu;
import Vitesse.DevinerVitesse;

import java.util.Scanner;

public class Main  extends DevinerVitesse{
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String message[] = {"V", "I", "T", "E", "S", "S", "E"};

        //Menu.menu();
        DevinerVitesse.tabVitesse(message);
    }
}
