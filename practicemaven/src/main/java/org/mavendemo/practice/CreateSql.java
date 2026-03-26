package org.mavendemo.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class CreateSql {

	public static void main(String[] args) {
    String dbURL="jdbc:mysql://localhost:3306/testdb";
    String username="root";
    String password="shobanav543!";
    try(Connection con=DriverManager.getConnection(dbURL,username,password)){
    	String sql="CREATE TABLE STUDENT "+"(ID INT NOT NULL,"+"Name VARCHAR(255),"+"Course VARCHAR(255),"+"Email VARCHAR(255),"+"PRIMARY KEY(ID))";
    	PreparedStatement ps=con.prepareStatement(sql);
    	ps.executeUpdate();
    	System.out.println("Table created successfully using PrepareStatement!");
    } 
    
    catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}