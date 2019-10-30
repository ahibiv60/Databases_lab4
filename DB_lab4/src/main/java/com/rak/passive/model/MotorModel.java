package com.rak.passive.model;

import com.rak.passive.controller.motor.MotorImpl;
import org.json.simple.JSONArray;

public class MotorModel {
    MotorImpl controller = new MotorImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newStatus, String newTime, int newPumpId) {
        controller.add(newStatus, newTime, newPumpId);
    }

    public void updateRow(int id, String newStatus, String newTime, int newPumpId) {
        controller.updateById(id, newStatus, newTime, newPumpId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
