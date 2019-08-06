package com.pti.truckType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TruckTypeHelper {

	public static List<TruckType> getTruckTypeFromDB() {
		List<TruckType> truckDrivers = new ArrayList<TruckType>();
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
           Statement s = connection.createStatement(); 
           ResultSet rs = s.executeQuery ("SELECT * FROM truckType");
           while(rs.next()) {
        	   truckDrivers.add(new TruckType(String.valueOf(rs.getInt("id")), rs.getString("type")));
           }
           connection.close();
        } catch (Exception e) {
        	System.out.print("Error: ");
        	System.out.println(e);
        }
        return truckDrivers;
	}
}
