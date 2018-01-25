package com.pw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConJDBC {
	 
		 static Connection conn=null;
		 static String driver="com.mysql.jdbc.Driver";
		 static String url="jdbc:mysql://localhost:3306/javastudy";
		 static String user="root";
		 static String password="123456";
	
	 public static Connection getConnection() throws ClassNotFoundException, SQLException{
		 
		Class.forName(driver);
		conn=DriverManager.getConnection(url, user, password);
		return conn;
	 }
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		conn= getConnection();
		System.out.println(conn);
	}
}
