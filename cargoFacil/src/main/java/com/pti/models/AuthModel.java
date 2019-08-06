package com.pti.models;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthModel {
	public static boolean loginUser(String username, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM person where username = ? and password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				connection.close();
				return true;
			}
		} catch (Exception e) {
        	System.out.print("Error: ");
        	System.out.println(e);
        }
		return false;
	}
	
	@SuppressWarnings("finally")
	public static boolean registerUser(String name, String surname, String dni, String birthDate, 
			String userType, String cuil_cuit, String email, String username, String password, 
			String phoneNumber, String address, String rating, String bussinesName) {
		Connection conn;
		PreparedStatement stmt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			conn.setAutoCommit(false);
			try {
				stmt = conn.prepareStatement("insert into person (name, surname, dni, birthDate, userType, "
						+ "cuil_cuit, email, username, password, phoneNumber, address, rating, bussinessName) \n" + 
						"values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				stmt.setString(1, name);
				stmt.setString(2, surname);
				stmt.setString(3, dni);
				stmt.setString(4, birthDate);
				stmt.setString(5, userType);
				stmt.setString(6, cuil_cuit);
				stmt.setString(7, email);
				stmt.setString(8, username);
				stmt.setString(9, password);
				stmt.setString(10, phoneNumber);
				stmt.setString(11, address);
				stmt.setString(12, rating);
				stmt.setString(13, bussinesName);
				stmt.execute();	
				conn.commit();
				stmt.close();
			} catch(SQLException e) {
				conn.rollback();
				return false;
			} finally {
				conn.setAutoCommit(true);
				conn.close();
				return true;
			}	
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println(e);
			return false;
		}		
	}
}
