package com.company;

public class Colors {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_BLUE = "\u001B[34m";

    public static void choiceColors(){
        System.out.print("\n" + ANSI_BLUE + "BLUE" + ANSI_RESET);
        System.out.println("\n" + ANSI_RED + "RED" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "YELLOW" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "PURPLE" + ANSI_RESET);
    }
}