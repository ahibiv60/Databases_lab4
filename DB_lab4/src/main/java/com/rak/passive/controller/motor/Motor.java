package com.rak.passive.controller.motor;

import org.json.simple.JSONArray;

public interface Motor {
    void add (String new_status, String new_time, int new_pump_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newStatus, String newTime, int newPumpId);
    void deleteById (int id);
}
