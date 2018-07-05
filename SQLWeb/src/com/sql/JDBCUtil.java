package com.sql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.sun.media.sound.PortMixerProvider;

public class JDBCUtil {
	private static Connection conn = null;
	static {
		
		try {
			Properties pro = new Properties();
			InputStream resourceAsStream = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
			pro.load(resourceAsStream);
			Class.forName(pro.getProperty("jdbcDriver"));
			System.out.println(pro.getProperty("url"));
			JDBCUtil.conn = DriverManager.getConnection(pro.getProperty("url"), pro.getProperty("name"), pro.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnect() {
		return JDBCUtil.conn;
	}
	public static void close(Connection conn, PreparedStatement pre) {
		try {
			pre.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
