package com.rak.passive.model;

import com.rak.passive.controller.statisticOfSensor.StatisticOfSensorImpl;
import org.json.simple.JSONArray;

public class StatisticOfSensorModel {
    StatisticOfSensorImpl controller = new StatisticOfSensorImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newTime, String newTemperature, String newLighting, String newHumidity, int newSensorId) {
        controller.add(newTime, newTemperature, newLighting, newHumidity, newSensorId);
    }

    public void updateRow(int id, String newTime, String newTemperature, String newLighting, String newHumidity, int newSensorId) {
        controller.updateById(id, newTime, newTemperature, newLighting, newHumidity, newSensorId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
