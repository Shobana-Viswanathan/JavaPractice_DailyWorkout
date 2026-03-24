package com.jdbc.JDBC_Practice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class DBConnection1 {
public static Connection getConnection() throws SQLException{
	String url="jdbc:mysql://localhost:3306/testdb";
	String user="root";
	String password="shobanav543!";
	return DriverManager.getConnection(url,user,password);
}

	

}
