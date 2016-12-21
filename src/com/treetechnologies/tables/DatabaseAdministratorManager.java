package com.treetechnologies.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.treetechnologies.connectionmanager.ConnectionManager;

public class DatabaseAdministratorManager {
private static final String SQL = "SELECT First_Name,Last_Name FROM database_administrator WHERE login_id = ? AND password = ?";
	
	public static ResultSet validateLoginCredentials(String loginId,String password) {
		ResultSet rs = null;		
		try {
			Connection connect = ConnectionManager.getConnection();
			PreparedStatement stmt = connect.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.setString(1, loginId);
			stmt.setString(2, password);
			rs = stmt.executeQuery();					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;					
	}

	
	
	
	
	
	
	
	
	

}
