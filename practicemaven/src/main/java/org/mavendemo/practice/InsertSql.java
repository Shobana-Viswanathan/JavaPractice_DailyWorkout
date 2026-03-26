package org.mavendemo.practice;

import java.sql.*;

public class InsertSql {

    public static void insert(int id, String name, String course, String email) {

        String dbURL = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "shobanav543!";

        try (Connection con = DriverManager.getConnection(dbURL, username, password)) {

            String sql = "INSERT INTO Student VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setString(4, email);

            ps.executeUpdate();
            System.out.println("Inserted Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}