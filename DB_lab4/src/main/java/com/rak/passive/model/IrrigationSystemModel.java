package com.rak.passive.model;

import com.rak.passive.controller.irrigationSystem.IrrigationSystemImpl;
import org.json.simple.JSONArray;

public class IrrigationSystemModel {
    IrrigationSystemImpl controller = new IrrigationSystemImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String status, String time, int userId) {
        controller.add(status, time, userId);
    }

    public void updateRow(int id, String status, String time, int userId) {
        controller.updateById(id, status, time, userId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
