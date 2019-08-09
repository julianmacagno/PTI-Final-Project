package com.pti.models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthModel {
	public static boolean loginUser(String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			CallableStatement stmt = connection.prepareCall("call loginUser(?,?)");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				connection.close();
				return true;
			}
		} catch (Exception e) {
			System.err.println(e);
        }
		return false;
	}
	
	public static boolean registerUser(String name, String surname, String dni, String birthDate, 
			String userType, String cuil_cuit, String email, String username, String password, 
			String phoneNumber, String address, String rating, String bussinesName) {
		Connection conn;
		CallableStatement stmt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			conn.setAutoCommit(false);
			try {
				stmt = conn.prepareCall("call registerUser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				stmt.setString(1, name);
				stmt.setString(2, surname);
				stmt.setInt(3, Integer.valueOf(dni));
				stmt.setDate(4, Date.valueOf(birthDate));
				stmt.setInt(5, Integer.valueOf(userType));
				stmt.setString(6, cuil_cuit);
				stmt.setString(7, email);
				stmt.setString(8, username);
				stmt.setString(9, password);
				stmt.setString(10, phoneNumber);
				stmt.setString(11, address);
				stmt.setInt(12, Integer.valueOf(rating));
				stmt.setString(13, bussinesName);
				stmt.execute();	
				conn.commit();
				stmt.close();
			} catch(SQLException e) {
				System.err.println(e);
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
