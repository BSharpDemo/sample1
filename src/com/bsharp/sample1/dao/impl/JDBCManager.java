package com.bsharp.sample1.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCManager {
 // JDBC driver name and database URL
 static final String JDBC_DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
 static final String DB_URL ="jdbc:sqlserver://localhost:1433;DatabaseName=Demopatient";
    
 //DB credentials
 static final String USER="sa";
 static final String PASS="1"; 
 
 public static Connection getConnection() throws Exception
 {
	  Connection conn = null;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      return conn;
 }
}
