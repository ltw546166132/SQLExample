package com.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtil {
	static ComboPooledDataSource datasource;
	static Properties properties;
	static {
		datasource = new ComboPooledDataSource();
		properties = new Properties();
		try {
			properties.load(JDBCUtil.class.getClassLoader().getResourceAsStream("sqlselect.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Properties getProperties() {
		return properties;
	}
	
	public static DataSource getDataSource() throws SQLException {
		return datasource;
	}
	
	public static Connection getConnection() throws SQLException{
		return datasource.getConnection();
	}
	
	public static void release(Connection conn,Statement staticment, ResultSet rs) {
		closeRs(rs);
		closeSt(staticment);
		closeConn(conn);
	}
	
	private static void closeConn(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void closeSt(Statement staticment) {
		try {
			staticment.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void closeRs(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
