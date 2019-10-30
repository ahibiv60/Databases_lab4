package com.rak.passive.controller.sensor;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class SensorImpl implements Sensor {
    private static final String DATABASE = "irrigation_system";
    private static final String USERNAME = "iotuser";
    private static final String PASSWORD = "iotuser";

    public void add(String new_status, String new_location, int new_area_id) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            if (!conn.isClosed()) {
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO sensor (status, location, area_id) VALUES (\'" + new_status + "\',\'" + new_location + "\'," + new_area_id + ")");
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
            String query = "select * from sensor";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject sensor = new JSONObject();
                    sensor.put("id", rs.getString("id"));
                    sensor.put("status", rs.getString("status"));
                    sensor.put("location", rs.getString("location"));
                    sensor.put("areaId", rs.getString("area_id"));
                    jsonArray.add(sensor);
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
            String query = "select * from sensor where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject sensor = new JSONObject();
                    sensor.put("id", rs.getString("id"));
                    sensor.put("status", rs.getString("status"));
                    sensor.put("location", rs.getString("location"));
                    sensor.put("areaId", rs.getString("area_id"));
                    jsonArray.add(sensor);
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

    public void updateById(int paramId, String newStatus, String newLocation, int newAreaId) {
        Connection conn = null;

        try {

            String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            String query = "UPDATE sensor SET status = ?, location = ?, area_id = ? WHERE id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, newStatus);
            preparedStmt.setString(2, newLocation);
            preparedStmt.setInt(3, newAreaId);
            preparedStmt.setInt(4, paramId);

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
            String sql = "delete from sensor where id =\'" + paramId + " \';";
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
