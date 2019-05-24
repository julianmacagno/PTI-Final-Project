package com.pti.cargoFacil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/truckDriver")
	public String truckDriver(@RequestParam(value="name", defaultValue="World") String name) {
		String result = "{";
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost/cargoFacil","julianmacagno", "rivadavia850");
           Statement s = connection.createStatement(); 
           ResultSet rs = s.executeQuery ("SELECT * FROM `person` as p join `userType` as ut on p.userType = ut.id");
           while(rs.next()) {
        	   result += rs.getString("name") + " - " + rs.getString("surname") + " - " + rs.getInt("dni") + " - " + 
        			   	rs.getDate("birthdate") + " - " + rs.getString("type") + " - " + rs.getString("cuil_cuit") + 
        			   	" - " + rs.getString("email") + " - " + rs.getString("username") + " - " + rs.getString("password") + 
        			   	" - " + rs.getString("phoneNumber") + " - " + rs.getString("address") + " - " + 
        			   	rs.getInt("rating") + " - " + rs.getString("bussinessName") + ",\n";
           }
           connection.close();
        } catch (Exception e) {
        	System.out.print("Error: ");
        	System.out.println(e);
        }
		result += "}";
        return result;
    }
}
