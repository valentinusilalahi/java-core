/**
 * 
 */
package com.silalahi.valentinus.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author valentinusilalahi
 *
 */
public class JdbcMySQL {
	public static void main(String[] xx) {
		System.out.println("=== Test JDBC MySQL ===");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/tesDB?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC\\n\",\"root\", \"root\"");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Failed! Check Output console");
			e.printStackTrace();
			return;
		}
	}
}
