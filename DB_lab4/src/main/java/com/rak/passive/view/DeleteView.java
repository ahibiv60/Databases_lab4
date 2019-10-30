package com.rak.passive.view;

import com.rak.passive.model.*;

import java.util.Scanner;

public class DeleteView {
    public void show() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter table name:");

        String number = myObj.nextLine();

        /*
         *       AREA
         */
        if (number.equals("area")) {
            AreaModel area = new AreaModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            area.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       IRRIGATION SYSTEM
         */
        if (number.equals("irrigation_system")) {
            IrrigationSystemModel irrigationSystemModel = new IrrigationSystemModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            irrigationSystemModel.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       MOTOR
         */
        if (number.equals("motor")) {
            MotorModel motor = new MotorModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            motor.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       NOZZLE
         */
        if (number.equals("nozzle")) {
            NozzleModel nozzle = new NozzleModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            nozzle.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       PASSWORD
         */
        if (number.equals("password")) {
            PasswordModel password = new PasswordModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            password.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }



        /*
         *       PUMP
         */
        if (number.equals("pump")) {
            PumpModel pump = new PumpModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            pump.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       SENSOR
         */
        if (number.equals("sensor")) {
            SensorModel sensor = new SensorModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            sensor.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       STATISTIC OF SENSOR
         */
        if (number.equals("statistic_of_sensor")) {
            StatisticOfSensorModel statistic = new StatisticOfSensorModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            statistic.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       USER
         */
        if (number.equals("user")) {
            UserModel user = new UserModel();

            Scanner row = new Scanner(System.in);
            System.out.println("Enter row id:");
            String id = row.nextLine();
            int newId = Integer.parseInt(id);
            user.deleteRow(newId);

            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        } else {
            System.out.println("Table is not exist");
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }
    }
}
