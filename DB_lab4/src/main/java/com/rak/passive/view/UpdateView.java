package com.rak.passive.view;

import com.rak.passive.model.*;

import java.util.Scanner;

public class UpdateView {
    public void show() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter table name:");

        String number = myObj.nextLine();

        /*
         *       AREA
         */
        if (number.equals("area")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter location:");
            String location = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter irrigation system id:");
            String irrigationSysteamId = myObj3.nextLine();
            //--
            int newId = Integer.parseInt(id);
            int newIrrigationSysteamId = Integer.parseInt(irrigationSysteamId);
            //--
            AreaModel area = new AreaModel();
            area.updateRow(newId, location, newIrrigationSysteamId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       IRRIGATION SYSTEM
         */
        if (number.equals("irrigation_system")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter status:");
            String status = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter time:");
            String time = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter user id:");
            String userId = myObj4.nextLine();
            //--
            int newId = Integer.parseInt(id);
            int newUserId = Integer.parseInt(userId);
            //--
            IrrigationSystemModel irrigationSystem = new IrrigationSystemModel();
            irrigationSystem.updateRow(newId, status, time, newUserId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       MOTOR
         */
        if (number.equals("motor")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter status:");
            String status = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter time:");
            String time = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter pump id:");
            String pumpId = myObj4.nextLine();
            //--
            int newId = Integer.parseInt(id);
            int newPumpId = Integer.parseInt(pumpId);
            //--
            MotorModel motor = new MotorModel();
            motor.updateRow(newId, status, time, newPumpId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       NOZZLE
         */
        if (number.equals("nozzle")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter status:");
            String status = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter location:");
            String location = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter max water consumption:");
            String maxWaterConsumption = myObj4.nextLine();

            Scanner myObj5 = new Scanner(System.in);
            System.out.println("Enter areaId:");
            String areaId = myObj5.nextLine();
            //--
            int newId = Integer.parseInt(id);
            int newMaxWaterConsumption = Integer.parseInt(maxWaterConsumption);
            int newAreaId = Integer.parseInt(areaId);
            //--
            NozzleModel nozzle = new NozzleModel();
            nozzle.updateRow(newId, status, location, newMaxWaterConsumption, newAreaId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }

        /*
         *       PASSWORD
         */
        if (number.equals("country")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter password:");
            String password = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter user id:");
            String user_id = myObj3.nextLine();

            //--
            int newId = Integer.parseInt(id);
            int newUserId = Integer.parseInt(user_id);
            //--
            PasswordModel pass = new PasswordModel();
            pass.updateRow(newId, password, newUserId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }



        /*
         *       PUMP
         */
        if (number.equals("pump")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter status:");
            String status = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter amount of pumped water:");
            String amountOfPumpedWater = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter area id:");
            String areaId = myObj4.nextLine();

            //--
            int newId = Integer.parseInt(id);
            int newAmountOfPumpedWater = Integer.parseInt(amountOfPumpedWater);
            int newAreaId = Integer.parseInt(areaId);
            //--
            PumpModel pump = new PumpModel();
            pump.updateRow(newId, status, newAmountOfPumpedWater, newAreaId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       SENSOR
         */
        if (number.equals("sensor")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter status:");
            String status = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter location:");
            String location = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter area id:");
            String areaId = myObj4.nextLine();

            //--
            int newId = Integer.parseInt(id);
            int newAreaId = Integer.parseInt(areaId);
            //--
            SensorModel sensor = new SensorModel();
            sensor.updateRow(newId, status, location, newAreaId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       STATISTIC OF SENSOR
         */
        if (number.equals("statistic_of_sensor")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter time:");
            String time = myObj2.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter temperature:");
            String temperature = myObj3.nextLine();

            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Enter lighting id:");
            String lighting = myObj4.nextLine();

            Scanner myObj5 = new Scanner(System.in);
            System.out.println("Enter humidity:");
            String humidity = myObj5.nextLine();

            Scanner myObj6 = new Scanner(System.in);
            System.out.println("Enter sensor id:");
            String sensorId = myObj6.nextLine();
            //--
            int newId = Integer.parseInt(id);
            int newSensorId = Integer.parseInt(sensorId);
            //--
            StatisticOfSensorModel statistic = new StatisticOfSensorModel();
            statistic.updateRow(newId, time, temperature, lighting, humidity, newSensorId);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }


        /*
         *       USER
         */
        if (number.equals("user")) {
            Scanner myObj1 = new Scanner(System.in);
            System.out.println("Enter id:");
            String id = myObj1.nextLine();

            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter name:");
            String name = myObj2.nextLine();

            Scanner myObj0 = new Scanner(System.in);
            System.out.println("Enter email:");
            String email = myObj0.nextLine();

            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Enter phone:");
            String phone = myObj3.nextLine();
            //--
            int newId = Integer.parseInt(id);
            //--
            UserModel p = new UserModel();
            p.updateRow(newId, name, email, phone);
            //--
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        } else {
            System.out.println("Table is not exist");
            GeneralMenu generalMenu = new GeneralMenu();
            generalMenu.show();
        }
    }
}
