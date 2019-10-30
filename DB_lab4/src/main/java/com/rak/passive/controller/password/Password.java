package com.rak.passive.controller.password;

import org.json.simple.JSONArray;

public interface Password {
    void add (String new_password, int new_user_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newPassword, int newUserId);
    void deleteById (int id);
}
