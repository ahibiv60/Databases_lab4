package com.rak.passive.controller.irrigationSystem;

import org.json.simple.JSONArray;

public interface IrrigationSystem {
    void add (String new_status, String new_time, int new_user_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newStatus, String newTime, int newUserId);
    void deleteById (int id);
}
