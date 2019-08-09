package com.pti.models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TruckDriverModel {
	public static boolean insertTruckDriverAndLicense(String dni, String expirationDate, String licenseType, String emergencyNumber) {
		Connection conn;
		CallableStatement stmt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			conn.setAutoCommit(false);
			try {
				stmt = conn.prepareCall("call registerTruckDriverAndLicense(?, ?, ?, ?)");
				stmt.setInt(1, Integer.valueOf(dni));
				stmt.setDate(2, Date.valueOf(expirationDate));
				stmt.setString(3, licenseType);
				stmt.setString(4, emergencyNumber);
				stmt.execute();	
				conn.commit();
				stmt.close();
			} catch(SQLException e) {
				conn.rollback();
				return false;
			} finally {
				conn.setAutoCommit(true);
				conn.close();
			}	
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e);
			return false;
		}		
		return true;
	}
}
