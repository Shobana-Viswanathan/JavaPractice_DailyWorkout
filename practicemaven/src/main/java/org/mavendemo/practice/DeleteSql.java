package org.mavendemo.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteSql {

    public static void delete(String name) {

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "shobanav543!")) {

            String sql = "DELETE FROM Student WHERE Name=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted!");
            else
                System.out.println("No record found!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}