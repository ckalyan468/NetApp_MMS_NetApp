package com.paragon.netapp.tests;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class connectDB 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://dv2-ls-cts-1:3308/ads_dev_new", "adsapp", "123123123");
		
		DatabaseMetaData md=conn.getMetaData();
		ResultSet rs=md.getTables(null, null, "%", null);
		while(rs.next())
		{
			System.out.println(rs.getString(3));
		}
		}
}
