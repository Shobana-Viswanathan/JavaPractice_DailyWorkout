package org.mavendemo.practice;

import java.sql.*;

public class ReadSql {

    public static void display() {

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "shobanav543!")) {

            String sql = "SELECT * FROM Student";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt("ID") + " | " +
                        rs.getString("Name") + " | " +
                        rs.getString("Course") + " | " +
                        rs.getString("Email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }
