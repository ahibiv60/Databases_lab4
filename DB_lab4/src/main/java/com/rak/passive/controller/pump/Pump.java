package com.rak.passive.controller.pump;

import org.json.simple.JSONArray;

public interface Pump {
    void add (String new_status, int new_amount_of_pumped_water, int new_area_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newStatus, int newAmountOfPumpedWater, int newAreaId);
    void deleteById (int id);
}
