package com.rak.passive.controller.user;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.sql.*;

public class UserImpl implements User {
    private static final String DATABASE = "irrigation_system";
    private static final String USERNAME = "iotuser";
    private static final String PASSWORD = "iotuser";

    public void add(String new_name, String new_email, String new_phone) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            Statement stmt = null;
            if (!conn.isClosed()) {
                stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO user (name, email, phone) VALUES (\'" + new_name + "\',\'" + new_email + "\'," + new_phone + ")");
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
            String query = "select * from user";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject user = new JSONObject();
                    user.put("id", rs.getString("id"));
                    user.put("name", rs.getString("name"));
                    user.put("email", rs.getString("email"));
                    user.put("phone", rs.getString("phone"));
                    jsonArray.add(user);
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
            String query = "select * from user where id =\'" + paramId + " \';";
            try {
                stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                JSONArray jsonArray = new JSONArray();

                while (rs.next()) {
                    JSONObject user = new JSONObject();
                    user.put("id", rs.getString("id"));
                    user.put("name", rs.getString("name"));
                    user.put("email", rs.getString("email"));
                    user.put("phone", rs.getString("phone"));
                    jsonArray.add(user);
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

    public void updateById(int paramId, String newName, String newEmail, String newPhone) {
        Connection conn = null;

        try {

            String url = "jdbc:sqlite:path-to-db-file/chinook/chinook.db";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/" + DATABASE +
                    "?user=" + USERNAME + "&password=" + PASSWORD + "&serverTimezone=UTC");

            String query = "UPDATE user SET name = ?, email = ?, phone = ? WHERE id = ?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1, newName);
            preparedStmt.setString(2, newEmail);
            preparedStmt.setString(3, newPhone);
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
            String sql = "delete from user where id =\'" + paramId + " \';";
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
