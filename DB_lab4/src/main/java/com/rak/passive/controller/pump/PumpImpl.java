package com.rak.passive.controller.pump;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class PumpImpl implements Pump {
    private static final String DATABASE = "irrigation_system";
    private static final String USERNAME = "iotuser";
    private static final String PASSWORD = "iotuser";

    public void add(String new_status, int new_amount_of_pumped_water, int new_area_id) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            if (!conn.isClosed()) {
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO pump (status, amount_of_pumped_water, area_id) VALUES (\'" + new_status + "\'," + new_amount_of_pumped_water + "," + new_area_id + ")");
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
            String query = "select * from pump";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject pump = new JSONObject();
                    pump.put("id", rs.getString("id"));
                    pump.put("status", rs.getString("status"));
                    pump.put("amountOfPumpedWater", rs.getString("amount_of_pumped_water"));
                    pump.put("areaId", rs.getString("area_id"));
                    jsonArray.add(pump);
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
            String query = "select * from pump where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject pump = new JSONObject();
                    pump.put("id", rs.getString("id"));
                    pump.put("status", rs.getString("status"));
                    pump.put("amountOfPumpedWater", rs.getString("amount_of_pumped_water"));
                    pump.put("areaId", rs.getString("area_id"));
                    jsonArray.add(pump);
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

    public void updateById(int paramId, String newStatus, int newAmountOfPumpedWater, int newAreaId) {
        Connection conn = null;

        try {

            String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            String query = "UPDATE pump SET status = ?, amount_of_pumped_water = ?, area_id= ? WHERE id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, newStatus);
            preparedStmt.setInt(2, newAmountOfPumpedWater);
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
            String sql = "delete from pump where id =\'" + paramId + " \';";
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
