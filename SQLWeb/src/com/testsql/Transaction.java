package com.testsql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import org.junit.Test;
import com.sql.JDBCUtil;

public class Transaction {
	private Connection connect;
	private PreparedStatement prepareStatement;
	public static void main(String[] args) {
		new Transaction().showTransaction();
	}

	@Test
	public void showTransaction() {
		DataPool pool = new DataPool();
		try {
			connect = pool.getConnection();
			String sql = "select * from useinfo";
			prepareStatement = connect.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			
			for(;rs.next();) {
				ResultSetMetaData metaData = rs.getMetaData();
				for(int i=1;i<=metaData.getColumnCount();i++) {
					System.out.println(metaData.getColumnTypeName(i));
					System.out.println(rs.getObject(i));
//					String type = metaData.getColumnTypeName(i);
//					switch (type) {
//					case "VARCHAR":
//						
//						break;
//
//					default:
//						break;
//					}
				}
				
			}
//			System.out.println(executeQuery.getInt(2));
		} catch (Exception e) {
			System.out.println("运行异常");
		}finally {
			JDBCUtil.close(connect, prepareStatement);
		}
	}
}
