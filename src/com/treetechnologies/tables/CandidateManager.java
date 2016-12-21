package com.treetechnologies.tables;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.treetechnologies.connectionmanager.ConnectionManager;

public class CandidateManager {
	
private static final String SHOWCANDIDATESSQL = "SELECT * FROM candidates";
private static final String UPDATECANDIDATESSQL = "SELECT First_Name,Last_Name FROM Voter WHERE voter_id = ? AND password = ?";
private static final String ADDCANDIDATESSQL = "INSERT INTO Candidate(first_name,last_name,date_of_birth,party_name) VALUES (?,?,?,?)";
private static final String DELETECANDIDATESSQL = "SELECT First_Name,Last_Name FROM Voter WHERE voter_id = ? AND password = ?";
	
	public static boolean addCandidate(String f_name,String l_name,String Dob,String party) {
		//Insert Fails
		int success = 0;		
		try {
			Connection connect = ConnectionManager.getConnection();
			PreparedStatement stmt = connect.prepareStatement(ADDCANDIDATESSQL);
			stmt.setString(1, f_name);
			stmt.setString(2, l_name);
			stmt.setString(3, Dob);
			stmt.setString(4, party);
			success = stmt.executeUpdate();										
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		if(success == 1){
			return true;
		}else{
			return false;
		}					
	}
	
	public boolean updateCandidate(){
		return false;		
	}
	
	public boolean deleteCandidate(){
		return false;
	}
	
	
	
	
	
	

}
