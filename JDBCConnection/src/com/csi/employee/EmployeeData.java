package com.csi.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeData {
	public static void main(String[] args) {
		
		
		/*Step for DB Connection
		Step 1: Load Driver Class
		step 2: Create Connection
		Step 3: Create statement
		step 4: Execute Query
		Step 5: Close Connection*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userrecords", "root", "root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from user");
				while (rs.next()) {
					System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3));
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
