package com.rak.passive.controller.statisticOfSensor;

import org.json.simple.JSONArray;

public interface StatisticOfSensor {
    void add (String new_time, String new_temperature, String new_lighting, String new_humidity, int new_sensor_id);
    JSONArray getAll ();
    JSONArray getById (int id);
    void updateById (int paramId, String newTime, String newTemperature, String newLighting, String newHumidity, int newSensorId);
    void deleteById (int id);
}
