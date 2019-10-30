package com.rak.passive.controller.sensor;

import org.json.simple.JSONArray;

public interface Sensor {
    void add (String new_status, String new_location, int new_area_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newStatus, String newLocation, int newAreaId);
    void deleteById (int id);
}
