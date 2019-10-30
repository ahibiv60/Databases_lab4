package com.rak.passive.controller.statisticOfSensor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class StatisticOfSensorImpl implements StatisticOfSensor{
    private static final String DATABASE = "irrigation_system";
    private static final String USERNAME = "iotuser";
    private static final String PASSWORD = "iotuser";

    public void add(String new_time, String new_temperature, String new_lighting, String new_humidity, int new_sensor_id) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            if (!conn.isClosed()) {
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO statistic_of_sensor (time, temperature, lighting, humidity, sensor_id) VALUES (\'" + new_time + "\',\'" + new_temperature + "\',\'" + new_lighting + "\',\'" + new_humidity + "\'," + new_sensor_id + ")");
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public JSONArray getAll() {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            String query = "select * from statistic_of_sensor";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject statistic_of_sensor = new JSONObject();
                    statistic_of_sensor.put("id", rs.getString("id"));
                    statistic_of_sensor.put("time", rs.getString("time"));
                    statistic_of_sensor.put("temperature", rs.getString("temperature"));
                    statistic_of_sensor.put("lighting", rs.getString("lighting"));
                    statistic_of_sensor.put("humidity", rs.getString("humidity"));
                    statistic_of_sensor.put("sensorId", rs.getString("sensor_id"));
                    jsonArray.add(statistic_of_sensor);
                }

                return jsonArray;

            } catch (SQLException e) {
                throw new Error("Problem", e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public JSONArray getById(int paramId) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            String query = "select * from statistic_of_sensor where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject statistic_of_sensor = new JSONObject();
                    statistic_of_sensor.put("id", rs.getString("id"));
                    statistic_of_sensor.put("time", rs.getString("time"));
                    statistic_of_sensor.put("temperature", rs.getString("temperature"));
                    statistic_of_sensor.put("lighting", rs.getString("lighting"));
                    statistic_of_sensor.put("humidity", rs.getString("humidity"));
                    statistic_of_sensor.put("sensorId", rs.getString("sensor_id"));
                    jsonArray.add(statistic_of_sensor);
                }

                return jsonArray;

            } catch (SQLException e) {
                throw new Error("Problem", e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public void updateById(int paramId, String time, String temperature, String lighting, String humidity, int sensorId) {
        Connection conn = null;

        try {

            String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            String query = "UPDATE statistic_of_sensor SET status = ?, location = ?, max_water_consumption = ?, area_id = ? WHERE id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, time);
            preparedStmt.setString(2, temperature);
            preparedStmt.setString(3, lighting);
            preparedStmt.setString(4, humidity);
            preparedStmt.setInt(4, sensorId);
            preparedStmt.setInt(5, paramId);

            // execute the java preparedstatement
            preparedStmt.executeUpdate();

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }

    public void deleteById(int paramId) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            String sql = "delete from statistic_of_sensor where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                stmt.executeUpdate(sql);

            } catch (SQLException e) {
                throw new Error("Problem", e);
            } finally {
                if (stmt != null) {
                    stmt.close();
                }
            }

        } catch (SQLException e) {
            throw new Error("Problem", e);
        }
    }
}
