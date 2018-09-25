package com.sdet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {


	public DBUtil(){}
	public static Connection getConnection() throws SQLException 
	{
	//	Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Welcome123");


		return connection;
	}


	public static void releaseResource(Connection conn) throws SQLException
	{
		
		conn.close();

	}

}
