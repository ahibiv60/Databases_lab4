package com.rak.passive.model;

import com.rak.passive.controller.nozzle.NozzleImpl;
import org.json.simple.JSONArray;

public class NozzleModel {
    NozzleImpl controller = new NozzleImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newStatus, String newLocation, int newMaxWaterConsumption, int newAreaId) {
        controller.add(newStatus, newLocation, newMaxWaterConsumption, newAreaId);
    }

    public void updateRow(int id, String newStatus, String newLocation, int newMaxWaterConsumption, int newAreaId) {
        controller.updateById(id, newStatus, newLocation, newMaxWaterConsumption, newAreaId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
