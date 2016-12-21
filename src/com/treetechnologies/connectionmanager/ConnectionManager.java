package com.treetechnologies.connectionmanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	
	public static Connection connection = null;
	public static final String USERNAME = "dbuser";
	public static final String PASSWORD = "dbpassword";
	public static final String CONNECTION_STRING = "jdbc:mysql://localhost/elections_database";
			
	public static void openConnection() throws SQLException{
		connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);		
	}
	
	public static Connection getConnection() throws SQLException{
		if(connection == null){
			System.out.println("Opening Connection");
			openConnection();
		}
		return connection;
	}
	
	public static void closeConnection(){
		if(connection != null){
			try {
				System.out.println("closing Connection");
				connection.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}

}
