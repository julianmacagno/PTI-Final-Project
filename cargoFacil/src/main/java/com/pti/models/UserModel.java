package com.pti.models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.LinkedList;

import com.pti.cargoFacil.beans.UserTypeBean;

public class UserModel {
	public static LinkedList<UserTypeBean> getUserTypes() {
		LinkedList<UserTypeBean> userTypesList = new LinkedList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
			CallableStatement stmt = connection.prepareCall("call getUserTypes()");
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				userTypesList.add(new UserTypeBean(rs.getInt("userType_key"), rs.getString("type")));
			}
			connection.close();
		} catch (Exception e) {
        	System.out.print("Error: ");
        	System.out.println(e);
        }		
		return userTypesList;
	}
}
