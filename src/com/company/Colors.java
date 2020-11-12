package com.company;


import java.util.Scanner;

public class Colors {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    String couleur;

    public Colors(String couleur) {
        this.couleur = couleur;
    }

    public static Colors choiceColors() {
        Scanner scannerColors = new Scanner(System.in);
        String choiceColors;



       do   {
            System.out.println("\n" + "---- Choice your color ----");
            System.out.print("\n" + ANSI_BLUE + "BLUE" + ANSI_RESET);
            System.out.println("\n" + ANSI_RED + "RED" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "YELLOW" + ANSI_RESET);
            System.out.println(ANSI_PURPLE + "PURPLE" + ANSI_RESET);

            choiceColors = scannerColors.next();
        }while (!(choiceColors.equals("BLUE") || choiceColors.equals("RED") || choiceColors.equals("YELLOW") || choiceColors.equals("PURPLE")));


        if (choiceColors.equals("BLUE")) {
            return new Colors(ANSI_BLUE);
        } else if (choiceColors.equals("RED")) {
            return new Colors(ANSI_RED);
        } else if (choiceColors.equals("YELLOW")) {
            return new Colors(ANSI_YELLOW);
        } else {
            return new Colors(ANSI_PURPLE);
        }
    }


    public String getCouleur() {
        return couleur;
    }
}