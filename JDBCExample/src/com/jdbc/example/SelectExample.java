package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SelectExample {

public static void main(String[] args) throws SQLException {
	// TODO Auto-generated method stub
	PreparedStatement stmt = null;
	
	
	try { Class.forName("oracle.jdbc.driver.OracleDriver");
		  String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		  Properties info = new Properties();
		  info.put("user", "sys as SYSDBA" );
		  info.put("password", "password123");
		  Connection conn = DriverManager.getConnection(URL, info);
		  System.out.println("Database Connected Successfully");
		  
		  String sql = "Insert into Student_Info1 values (?,?,?) ";
		  stmt = conn.prepareStatement(sql);
		  
		  stmt.setString(1, "A");
		  stmt.setString(2, "B");
		  stmt.setString(3, "20");
		  stmt.executeUpdate(); 
		  		  
//		  ResultSet rs = stmt.executeQuery(); 
//		  
//		  while(rs.next()) {
//			  String Firstname = rs.getString("Firstname");
//			  String Lastname = rs.getString("Lastname");
//			  String Age = rs.getString("Age");
//			  
//			  System.out.println("Firstname : " + Firstname );
//			  System.out.println("Lastname : " + Lastname );
//			  System.out.println("Age : " + Age );
//		  }
		  
//		  rs.close();
		  
		  
	} catch(ClassNotFoundException ex) {
		System.out.println("Error: unable to load driver class!");
		System.exit(1);
		  
}
}
}