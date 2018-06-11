package com.mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) {
		Connection con = null;
		try {
			SingeltonDBConnection db = SingeltonDBConnection.getInstance();
			con = db.getConnection();
			System.out.println("Connention Established !!!!!!!!");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from test.emp");
			while (rs.next())
				System.out.println("Employee : " + rs.getInt(1) + " , " + rs.getString(2) + " , " + rs.getInt(3));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
