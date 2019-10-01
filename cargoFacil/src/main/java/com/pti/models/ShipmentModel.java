package com.pti.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ShipmentModel {
	public static LinkedList<String> RegisterRandomShipmentFromFile() {
		LinkedList<String> result = new LinkedList<>();
		try {	
			List<String> allLines = Files.readAllLines(Paths.get("/home/julian/Facultad/PTI/PTI-Final-Project/RandPoints.txt"));
			for (int i = 0; i < allLines.size(); i++) {
				String[] columns = allLines.get(i).split("¿");
				String originCoord = columns[0];
				String originAddress = columns[1];
				String destCoord = columns[2];
				String destAddress = columns[3];
				String distance = columns[4];
				
				Connection conn;
				CallableStatement stmt;
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
					conn.setAutoCommit(false);
					try {
						stmt = conn.prepareCall("call insertShipment(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
						stmt.setString(1, originCoord);
						stmt.setString(2, originAddress);
						stmt.setString(3, destCoord);
						stmt.setString(4, destAddress);
						stmt.setString(5, distance);
						stmt.setDate(6, Date.valueOf("2019-10-10"));
						stmt.setDate(7, Date.valueOf("2019-12-10"));
						stmt.setString(8, "n");
						stmt.setInt(9, 1);
						stmt.setInt(10, 35000);
						stmt.setString(11, "kg");
						stmt.setInt(12, 1);
						stmt.execute();	
						conn.commit();
						stmt.close();
						System.out.print(i);
						System.out.println(" inserted successfully.");
					} catch(SQLException e) {
						System.err.println(e);
						conn.rollback();
					} finally {
						conn.setAutoCommit(true);
						conn.close();
					}	
				} catch (SQLException | ClassNotFoundException e) {
					System.err.println(e);
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return result;
	}
}
