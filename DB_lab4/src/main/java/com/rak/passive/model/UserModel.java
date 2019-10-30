package com.rak.passive.model;

import com.rak.passive.controller.user.UserImpl;
import org.json.simple.JSONArray;

public class UserModel {
   UserImpl controller = new UserImpl();

    public JSONArray getTable() {
        return controller.getAll();
    }

    public JSONArray getRow(int id) {
        return controller.getById(id);
    }

    public void addRow(String newName, String newEmail, String newPhone) {
        controller.add(newName, newEmail, newPhone);
    }

    public void updateRow(int id, String newName, String newEmail, String newPhone) {
        controller.updateById(id, newName, newEmail, newPhone);
    }

    public void deleteRow(int id) {
        controller.deleteById(id);
    }
}
