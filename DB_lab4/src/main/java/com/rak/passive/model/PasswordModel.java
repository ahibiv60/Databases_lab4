package com.rak.passive.model;

import com.rak.passive.controller.password.PasswordImpl;
import org.json.simple.JSONArray;

public class PasswordModel {
    PasswordImpl controller = new PasswordImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newPassword, int newUserId) {
        controller.add(newPassword, newUserId);
    }

    public void updateRow(int id, String newPassword, int newUserId) {
        controller.updateById(id, newPassword, newUserId);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
