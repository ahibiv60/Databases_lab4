package com.rak.passive.model;

import com.rak.passive.controller.pump.PumpImpl;
import org.json.simple.JSONArray;

public class PumpModel<PumpdImpl> {
    PumpImpl controller = new PumpImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newStatus, int newAmountOfPumpedWater, int newAreaId) {
        controller.add(newStatus, newAmountOfPumpedWater, newAreaId);
    }

    public void updateRow(int id, String newStatus, int newAmountOfPumpedWater, int newAreaId) {
        controller.updateById(id, newStatus, newAmountOfPumpedWater, newAreaId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
