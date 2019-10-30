package com.rak.passive.model;

import com.rak.passive.controller.sensor.SensorImpl;
import org.json.simple.JSONArray;

public class SensorModel {
    SensorImpl controller = new SensorImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newStatus, String newLocation, int newAreaId) {
        controller.add(newStatus, newLocation, newAreaId);
    }

    public void updateRow(int id, String newStatus, String newLocation, int newAreaId) {
        controller.updateById(id, newStatus, newLocation, newAreaId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
