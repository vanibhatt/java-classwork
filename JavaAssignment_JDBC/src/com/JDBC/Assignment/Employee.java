package com.JDBC.Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Employee {
	
	private String EFirstname;
	private String ELastname;
	private String EtimeIn;
	private String EtimeOut;
	Integer EmployeeNo; 
	
	Employee(String firstname, String lastname) {
		this.EFirstname = firstname;
		this.ELastname = lastname;
	}
	
	void createNewEmployee() throws ClassNotFoundException, SQLException {
		
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		  Properties info = new Properties();
		  info.put("user", "sys as SYSDBA" );
		  info.put("password", "password123");
		  Connection conn = DriverManager.getConnection(URL, info);
		  System.out.println("Database Connected Successfully");
		  
		  Statement stmt = conn.createStatement();
		  String sql = "Insert into Employee values ('Vani', 'Bhattacharjee') "; 
		  stmt.executeUpdate(sql); 
		  
		  String sql1 = "Select * from Employee"; 	  		  
		  ResultSet rs = stmt.executeQuery(sql1); 
		  
		  while(rs.next()) {
			  String Firstname = rs.getString("firstName");
			  String Lastname = rs.getString("lastName");
						  
			  System.out.println("Firstname : " + Firstname );
			  System.out.println("Lastname : " + Lastname );
		  }
		  
		  rs.close();
		  conn.close();
	}

}
