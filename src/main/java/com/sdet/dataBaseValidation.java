package com.sdet;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.testng.annotations.Test;


import com.sdet.entities.Player;

public class dataBaseValidation {
	@Test
	public static void mainq1() throws SQLException 
	{
		Statement statementV=null;
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","Welcome123");
		statementV=connection.createStatement();
		String str="SELECT * FROM player where category='batsman'" ;
		ResultSet rs=statementV.executeQuery(str);
		
		
		while(rs.next())
		{
			Player player=new Player();
			player.setId(String.valueOf(rs.getInt(1)));
			player.setPlayer_name(String.valueOf(rs.getString(2)));
			player.setCategory(String.valueOf(rs.getString(3)));
			System.out.println(player);
			
			
			
			 
			 
		}

	}

}
