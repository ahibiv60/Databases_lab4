package com.rak.passive.controller.user;

import org.json.simple.JSONArray;

public interface User {
    void add (String new_name, String new_email, String new_phone);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newName, String newEmail, String newPhone);
    void deleteById (int id);
}
