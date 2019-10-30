package com.rak.passive.controller.nozzle;

import org.json.simple.JSONArray;

public interface Nozzle {
    void add (String new_status, String new_location, int new_max_water_consumption, int new_area_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newStatus, String newLocation, int newMaxWaterConsumption, int newAreaId);
    void deleteById (int id);
}
