package com.rak.passive.controller.nozzle;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class NozzleImpl implements Nozzle{
    private static final String DATABASE = "irrigation_system";
    private static final String USERNAME = "iotuser";
    private static final String PASSWORD = "iotuser";

    public void add(String new_status, String new_location, int new_max_water_consumption, int new_area_id) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            if (!conn.isClosed()) {
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO nozzle (status, location, max_water_consumption, area_id) VALUES (\'" + new_status + "\',\'" + new_location + "\'," + new_max_water_consumption + "," + new_area_id + ")");
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
            String query = "select * from nozzle";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject nozzle = new JSONObject();
                    nozzle.put("id", rs.getString("id"));
                    nozzle.put("status", rs.getString("status"));
                    nozzle.put("location", rs.getString("location"));
                    nozzle.put("newMaxWaterConsumption", rs.getString("max_water_consumption"));
                    nozzle.put("newAreaId", rs.getString("area_id"));
                    jsonArray.add(nozzle);
                }

                return jsonArray;

            } catch (SQLException e) {
                throw new Error("Problems", e);
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
            String query = "select * from nozzle where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject nozzle = new JSONObject();
                    nozzle.put("id", rs.getString("id"));
                    nozzle.put("status", rs.getString("status"));
                    nozzle.put("location", rs.getString("location"));
                    nozzle.put("maxWaterConsumption", rs.getString("max_water_consumption"));
                    nozzle.put("areaId", rs.getString("area_id"));
                    jsonArray.add(nozzle);
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

    public void updateById(int paramId, String newStatus, String newLocation, int newMaxWaterConsumption, int newAreaId) {
        Connection conn = null;

        try {

            String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            String query = "UPDATE nozzle SET status = ?, location = ?, max_water_consumption = ?, area_id = ? WHERE id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, newStatus);
            preparedStmt.setString(2, newLocation);
            preparedStmt.setInt(3, newMaxWaterConsumption);
            preparedStmt.setInt(4, newAreaId);
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
            String sql = "delete from nozzle where id =\'" + paramId + " \';";
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
