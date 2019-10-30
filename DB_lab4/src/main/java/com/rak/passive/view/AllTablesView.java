package com.rak.passive.view;

import com.rak.passive.model.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AllTablesView {
    public void show() {

        /*
         *       AREA
         */
        AreaModel area = new AreaModel();
        JSONArray areaTable = area.getTable();
        System.out.println("\n                  AREA\n");
        System.out.println("ID" + "   " + "Location" + "    " + "Irrigation system ID");
        System.out.println("----------------------------------------");
        for (Object o : areaTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String location = (String) jsonLineItem.get("location");
            String irrigationSystemId = (String) jsonLineItem.get("irrigationSystemId");
            System.out.println(id + "  |  " + location + "  |  " + irrigationSystemId);
        }


        /*
         *       IRRIGATION SYSTEM
         */
        IrrigationSystemModel irrigationSystemModel = new IrrigationSystemModel();
        JSONArray irrigationTable = irrigationSystemModel.getTable();
        System.out.println("\n\n          IRRIGATION SYSTEM\n");
        System.out.println("ID" + "    " + "Status" + "    " + "Time" + "    " + "User ID");
        System.out.println("----------------------------------");
        for (Object o : irrigationTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String status = (String) jsonLineItem.get("status");
            String time = (String) jsonLineItem.get("time");
            String userId = (String) jsonLineItem.get("userId");
            System.out.println(id + "  |  " + status + "  |  " + time + "  |  " + userId);
        }


        /*
         *       MOTOR
         */
        MotorModel motor = new MotorModel();
        JSONArray motorTable = motor.getTable();
        System.out.println("\n\n             MOTOR\n");
        System.out.println("ID" + "    " + "Status" + "    " + "Time" + "    " + "Pump ID");
        System.out.println("-----------------------------------");
        for (Object o : motorTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String status = (String) jsonLineItem.get("status");
            String time = (String) jsonLineItem.get("time");
            String pumpId = (String) jsonLineItem.get("pumpId");
            System.out.println(id + "  |  " + status + "  |  " + time + "  |  " + pumpId);
        }


        /*
         *       NOZZLE
         */
        NozzleModel nozzle = new NozzleModel();
        JSONArray nozzleTable = nozzle.getTable();
        System.out.println("\n\n                              NOZZLE\n");
        System.out.println("ID" + "    " + "Status" + "    " + "Location" + "    " + "Max water consumption" + "    " + "Area ID");
        System.out.println("------------------------------------------------------------");
        for (Object o : nozzleTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String status = (String) jsonLineItem.get("status");
            String location = (String) jsonLineItem.get("location");
            String maxWaterConsumption = (String) jsonLineItem.get("maxWaterConsumption");
            String areaId = (String) jsonLineItem.get("areaId");
            System.out.println(id + "  |  " + status + "  |  " + location + "  |  " + maxWaterConsumption + "  |  " + areaId);
        }


        /*
         *       PASSWORD
         */
        PasswordModel pass = new PasswordModel();
        JSONArray passTable = pass.getTable();
        System.out.println("\n\n          PASSWORD\n");
        System.out.println("ID" + "    " + "Password" + "    " + "User ID");
        System.out.println("------------------------");
        for (Object o : passTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String password = (String) jsonLineItem.get("password");
            String userId = (String) jsonLineItem.get("userId");
            System.out.println(id + "  |  " + password + "  |  " + userId);
        }


        /*
         *       PUMP
         */
        PumpModel pump = new PumpModel();
        JSONArray pumpTable = pump.getTable();
        System.out.println("\n\n                     PUMP\n");
        System.out.println("ID" + "    " + "Status" + "    " + "Amount of pumped water" + "    " + "Area ID");
        System.out.println("-----------------------------------------------");
        for (Object o : pumpTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String status = (String) jsonLineItem.get("status");
            String amountOfPumperdWater = (String) jsonLineItem.get("amountOfPumperdWater");
            String areaId = (String) jsonLineItem.get("areaId");
            System.out.println(id + "  |  " + status + "  |  " + amountOfPumperdWater + "  |  " + areaId);
        }


        /*
         *       SENSOR
         */
        SensorModel sensor = new SensorModel();
        JSONArray sensorTable = sensor.getTable();
        System.out.println("\n\n                 SENSOR\n");
        System.out.println("ID" + "    " + "Status" + "    " + "Location" + "    " + "Area ID");
        System.out.println("-------------------------------------");
        for (Object o : sensorTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String status = (String) jsonLineItem.get("status");
            String location = (String) jsonLineItem.get("location");
            String areaId = (String) jsonLineItem.get("areaId");
            System.out.println(id + "  |  " + status + "  |  " + location + "  |  " + areaId);
        }


        /*
         *       STATISTIC OF SENSOR
         */
        StatisticOfSensorModel statistic = new StatisticOfSensorModel();
        JSONArray statisticTable = statistic.getTable();
        System.out.println("\n\n                STATISTIC OF SENSOR\n");
        System.out.println("ID" + "    " + "Time" + "    " + "Temperature" + "    " + "Lighting" + "    " + "Humidity" + "    " + "Sensor ID");
        System.out.println("-----------------------------------------------------------");
        for (Object o : statisticTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String time = (String) jsonLineItem.get("time");
            String temperature = (String) jsonLineItem.get("temperature");
            String lighting = (String) jsonLineItem.get("lighting");
            String humidity = (String) jsonLineItem.get("humidity");
            String sensorId = (String) jsonLineItem.get("sensorId");
            System.out.println(id + "  |  " + time + "  |  " + temperature + "  |  " + lighting + "  |  " + humidity + "  |  " + sensorId);
        }


        /*
         *       USER
         */
        UserModel user = new UserModel();
        JSONArray userTable = user.getTable();
        System.out.println("\n\n         USER\n");
        System.out.println("ID" + "    " + "Name" + "    " + "Email" + "    " + "Phone");
        System.out.println("-----------------------------");
        for (Object o : userTable) {
            JSONObject jsonLineItem = (JSONObject) o;
            String id = (String) jsonLineItem.get("id");
            String name = (String) jsonLineItem.get("name");
            String email = (String) jsonLineItem.get("email");
            String phone = (String) jsonLineItem.get("phone");
            System.out.println(id + "  |  " + name + "  |  " + email + "  |  " + phone);
        }

        System.out.println("\n\n");
        GeneralMenu generalMenu = new GeneralMenu();
        generalMenu.show();

    }
}
