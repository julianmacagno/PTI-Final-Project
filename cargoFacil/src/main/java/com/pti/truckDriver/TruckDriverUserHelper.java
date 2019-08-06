package com.pti.truckDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TruckDriverUserHelper {
	public static List<TruckDriverUser> getTruckDriverUserFromDB() {
		List<TruckDriverUser> truckDrivers = new ArrayList<TruckDriverUser>();
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
           Statement s = connection.createStatement(); 
           ResultSet rs = s.executeQuery ("SELECT * FROM `person` as p join `userType` as ut on p.userType = ut.id");
           while(rs.next()) {
        	   truckDrivers.add(new TruckDriverUser(rs.getString("name"), rs.getString("surname"), String.valueOf(rs.getInt("dni")), rs.getDate("birthdate").toString(), rs.getString("type"), rs.getString("cuil_cuit"), rs.getString("email"), rs.getString("username"), rs.getString("password"), rs.getString("phoneNumber"), rs.getString("address"), String.valueOf(rs.getInt("rating")), rs.getString("bussinessName")));
           }
           connection.close();
        } catch (Exception e) {
        	System.out.print("Error: ");
        	System.out.println(e);
        }
        return truckDrivers;
	}
}
