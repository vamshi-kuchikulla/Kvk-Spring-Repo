package com.spring.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataScource {
	private Connection connection;
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "root";

	private static DataScource dataSource;

	private DataScource() {
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
	
	public static DataScource getInstance() throws SQLException {
		if(dataSource == null) {
			dataSource = new DataScource();
		}else if(dataSource.getConnection().isClosed()) {
			dataSource = new DataScource();
		}
		return dataSource;
	}
}
