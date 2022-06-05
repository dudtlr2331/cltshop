package com.clt.cmm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonDao {
	private DataSourceManager ds;

	public CommonDao() {
//		try {
//			Class.forName(DatabaseInfo.DB_DRIVER);
//			System.out.println("Driver Loading....");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		ds = DataSourceManager.getInstance();
	}

	public Connection getConnection() throws SQLException {
		return ds.getConnection();
		
//		Connection conn = null;
//		try {
//			Class.forName(DatabaseInfo.DB_DRIVER);
//			System.out.println("Driver Loading....");
//			conn = DriverManager.getConnection(DatabaseInfo.DB_URL, DatabaseInfo.DB_USER, DatabaseInfo.DB_PASS);
//			System.out.println("DataSource Lookup....");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return conn;
	}
	
	/*public int insertEntr(Object pvo) {
		Connection conn = null;
//		PreparedStatement ps = null;
		LogPreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = getConnection();
			ps = new LogPreparedStatement(conn, EntrSql.ENTR_INSERT);
//			ps = conn.prepareStatement(EntrSql.ENTR_INSERT);

			List<Field> list = ReflecttionUtils.getAllFields(pvo.getClass());
			for(Field obj : list) {
				obj.setAccessible(true);
				String type = ReflecttionUtils.getType(pvo.getClass(), obj.getName());
				if(type.contains("long")) {
					ps.setLong(ReflecttionUtils.camelToUpperSnakeCase(obj.getName()), obj.get(obj.getName()));
				}
			}
			
			System.out.println("=SQL=======================================================");
			System.out.println(ps);
			System.out.println("===========================================================");
			row = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				closeAll(rs, ps, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return row;
	}*/

	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
//		System.out.println("PreparedStatement Close.... ps, conn");
//		if (null != ps && !ps.isClosed())
//			ps.close();
//		if (null != conn && !conn.isClosed())
//			conn.close();
	}

	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
//		System.out.println("PreparedStatement Close.... ps, conn, rs");
//		if (null != rs && !rs.isClosed())
//			rs.close();
//		if (null != ps && !ps.isClosed())
//			ps.close();
//		if (null != conn && !conn.isClosed())
//			conn.close();
	}
}