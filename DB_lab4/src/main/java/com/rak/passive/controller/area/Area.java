package com.rak.passive.controller.area;

import org.json.simple.JSONArray;

public interface Area {
    void add (String new_location, int new_irrigation_system_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newLocation, int newIrrigationSystemId);
    void deleteById (int id);
}
