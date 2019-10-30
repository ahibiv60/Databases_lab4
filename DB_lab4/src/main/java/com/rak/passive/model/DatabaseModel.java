package com.rak.passive.model;

import com.rak.passive.controller.database.DatabaseImpl;

public class DatabaseModel {
    DatabaseImpl controller = new DatabaseImpl();

    public void createOrUpdateDatabase() {
        controller.createDatabase();
    }
}
