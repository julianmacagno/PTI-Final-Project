package com.pti.models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.pti.beans.TruckTypeBean;

public class TruckModel {
	public static LinkedList<TruckTypeBean> getTruckTypes() {
		LinkedList<TruckTypeBean> truckTypesList = new LinkedList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			CallableStatement stmt = connection.prepareCall("call getTruckTypes()");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				truckTypesList.add(new TruckTypeBean(rs.getInt("truckType_key"), rs.getString("type")));
			}
			connection.close();
		} catch (Exception e) {
			System.err.println(e);
        }		
		return truckTypesList;
	}
	
	
	public static boolean insertTruck(String owner, String plate, String brand, String model, String year, String tare,
							String maxWeigth, String maxVolume, String axleNum, String chassisNum, String truckType) {
		Connection conn;
		CallableStatement stmt;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			conn.setAutoCommit(false);
			try {
				stmt = conn.prepareCall("call registerUser(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
				stmt.setInt(1, Integer.valueOf(owner));
				stmt.setString(2, plate);
				stmt.setString(3, brand);
				stmt.setString(4, model);
				stmt.setInt(5, Integer.valueOf(year));
				stmt.setInt(6, Integer.valueOf(tare));
				stmt.setInt(7, Integer.valueOf(maxWeigth));
				stmt.setInt(8, Integer.valueOf(maxVolume));
				stmt.setInt(9, Integer.valueOf(axleNum));
				stmt.setInt(10, Integer.valueOf(chassisNum));
				stmt.setInt(11, Integer.valueOf(truckType));
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
