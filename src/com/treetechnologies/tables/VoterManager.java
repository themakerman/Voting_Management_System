package com.treetechnologies.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.treetechnologies.connectionmanager.ConnectionManager;

public class VoterManager {
	
	private static final String SQL = "SELECT First_Name,Last_Name FROM Voter WHERE voter_id = ? AND password = ?";
	
	public static ResultSet validateLoginCredentials(int voterId,String password) {
		ResultSet rs = null;
		
		try {
			Connection connect = ConnectionManager.getConnection();
			PreparedStatement stmt = connect.prepareStatement(SQL, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			stmt.setInt(1, voterId);
			stmt.setString(2, password);
			rs = stmt.executeQuery();										
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;					
	}
}
