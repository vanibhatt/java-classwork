package com.JDBC.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		Statement stmt = null;
		try { Class.forName("oracle.jdbc.driver.OracleDriver");
			  String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
			  Properties info = new Properties();
			  info.put("user", "sys as SYSDBA" );
			  info.put("password", "password123");
			  Connection conn = DriverManager.getConnection(URL, info);
			  System.out.println("Connected Successfully");
			  
//			  System.out.println("Creating Employee table");
//			  stmt=conn.createStatement();
//			  String sql = "Create table Employee (EmployeeNo NUMBER GENERATED ALWAYS as IDENTITY(START with 1 INCREMENT by 1) PRIMARY KEY,firstName VARCHAR(255), lastName VARCHAR(255), time_in  VARCHAR(255), time_out VARCHAR(255))";
//			  stmt.executeQuery(sql);
//			  System.out.println("Table created sucessfully");
//			  String USER = "SYSDBA", PASS = "password123";
//			  Connection conn = DriverManager.getConnection(URL, USER, PASS);
			  
			  
			  Statement stmt1 = conn.createStatement();
			  String sql = "Insert into Employee (firstName, lastName) values ('Vani', 'Bhattacharjee')";
			  stmt1.executeUpdate(sql); 
			  System.out.println("Values inserted sucessfully");
			  
			  String sql1 = "Select * from Employee"; 	  		  
			  ResultSet rs = stmt1.executeQuery(sql1); 
			  
			  while(rs.next()) {
				  String Firstname = rs.getString("firstName");
				  String Lastname = rs.getString("lastName");
							  
				  System.out.println("Firstname : " + Firstname );
				  System.out.println("Lastname : " + Lastname );
			  }
			  
			  rs.close();
			  
			  
			  conn.close();
			} catch(ClassNotFoundException ex) {
				System.out.println("Error: unable to load driver class!");
				System.exit(1);
			}
	}
}
