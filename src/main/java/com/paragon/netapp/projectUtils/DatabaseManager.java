package com.paragon.netapp.projectUtils;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseManager 
{
	public static Connection conn;
	
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection("jdbc:mysql://dv2-ls-cts-1:3308/ads_dev_new", "adsapp", "123123123");
		return conn;
	}
	
	

}
