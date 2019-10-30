package com.rak.passive.model;

import com.rak.passive.controller.area.AreaImpl;
import org.json.simple.JSONArray;

public class AreaModel {
    AreaImpl controller = new AreaImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String location, int irrigationSystemId) {
        controller.add(location, irrigationSystemId);
    }

    public void updateRow(int id, String location, int irrigationSystemId) {
        controller.updateById(id, location, irrigationSystemId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
