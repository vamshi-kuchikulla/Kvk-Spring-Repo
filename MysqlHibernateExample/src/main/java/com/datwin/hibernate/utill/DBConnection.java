package com.datwin.hibernate.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");  
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Test", "postgres", "root");
			// here mydb is database name, root is username and root
			System.out.println("Established Connection");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
