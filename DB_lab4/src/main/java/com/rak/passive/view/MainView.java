package com.rak.passive.view;

import java.util.Scanner;

public class MainView {

    public void show() {
        System.out.println("==================================================");
        System.out.println("=                                                =");
        System.out.println("=               IRRIGATION SYSTEM                =");
        System.out.println("=                                                =");
        System.out.println("==================================================");


        System.out.println("[ 1 ] open menu");
        System.out.println("[ 2 ] out");

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1/2");

        String number = myObj.nextLine();

        if (number.equals("1")) {
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        if (number.equals("2")) {
            Out outer = new Out();
            outer.show();
        }

        else {
            System.out.println("Pl, enter 1 or 2");
        }
    }
}
