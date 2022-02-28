package com.clt.cmm.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSourceManager {
	private Connection conn;
	private static DataSourceManager instance = new DataSourceManager();

	private DataSourceManager() {
		try {
			Class.forName(DatabaseInfo.DB_DRIVER);
			conn = DriverManager.getConnection(DatabaseInfo.DB_URL, DatabaseInfo.DB_USER, DatabaseInfo.DB_PASS);
			System.out.println("DataSource Lookup....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DataSourceManager getInstance() {
		return instance;
	}

	public Connection getConnection() {
		return conn;
	}
}