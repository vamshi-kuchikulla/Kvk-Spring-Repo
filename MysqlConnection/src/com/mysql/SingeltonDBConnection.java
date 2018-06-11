package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingeltonDBConnection {
	private Connection connection;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "root";

	private static SingeltonDBConnection singeltonDBConnection;

	private SingeltonDBConnection() {
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Database Connection Creation Failed : " + e.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}
	
	public static SingeltonDBConnection getInstance() throws SQLException {
		if(singeltonDBConnection == null) {
			singeltonDBConnection = new SingeltonDBConnection();
		}else if(singeltonDBConnection.getConnection().isClosed()) {
			singeltonDBConnection = new SingeltonDBConnection();
		}
		return singeltonDBConnection;
	}
}
