package org.mavendemo.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateSql {

    public static void update(String name, String course, String email) {

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "shobanav543!")) {

            String sql = "UPDATE Student SET Course=?, Email=? WHERE Name=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, course);
            ps.setString(2, email);
            ps.setString(3, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated!");
            else
                System.out.println("No record found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}