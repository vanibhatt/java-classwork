package com.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnExample {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try { Class.forName("oracle.jdbc.driver.OracleDriver");
			  String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
			  Properties info = new Properties();
			  info.put("user", "sys as SYSDBA" );
			  info.put("password", "password123");
			  Connection conn = DriverManager.getConnection(URL, info);
			  System.out.println("Connected Successfully");
//			  String USER = "SYSDBA", PASS = "password123";
//			  Connection conn = DriverManager.getConnection(URL, USER, PASS);
			  conn.close();
			} catch(ClassNotFoundException ex) {
				System.out.println("Error: unable to load driver class!");
				System.exit(1);
			}
	}
}
	