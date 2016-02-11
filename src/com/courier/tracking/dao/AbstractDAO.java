package com.courier.tracking.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AbstractDAO extends JdbcDaoSupport {

//		// JDBC driver name and database URL
//		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
//		static final String DB_URL = "jdbc:mysql://localhost/EMP";
//
//		//  Database credentials
//		static final String USER = "username";
//		static final String PASS = "password";
		
		@Autowired
		private DataSource dataSource;
		
		@PostConstruct
		private void initialize() {
			setDataSource(dataSource);
		}
		
//		static{
//			try{
//				
//				//Register JDBC driver
//				Class.forName( "com.mysql.jdbc.Driver" );
//				
//			}catch( ClassNotFoundException e ){
//				e.printStackTrace();
//			}
//		}
		
//		public ResultSet retriveData( String sql ){
//			
//			Connection conn = null;
//			Statement stmt = null;
//			ResultSet rs = null;
//			
//			try{
//				
//				// Open a connection
//				System.out.println("Connecting to database...");
//				conn = DriverManager.getConnection(DB_URL,USER,PASS);
//	
//				// Execute a query
//				System.out.println("Creating statement...");
//				stmt = conn.createStatement();
//				rs = stmt.executeQuery(sql);
//				
//				return rs;
//			
//			} catch( SQLException e ){
//				
//				e.printStackTrace();
//				
//			}finally {
//				try{
//					
//					rs.close();
//					stmt.close();
//					conn.close();
//					
//				}catch( SQLException ex ){
//					ex.printStackTrace();
//				}
//			}
//			return null;
//		}
//		
//		public Boolean updateData( String sql ){
//			
//			Connection conn = null;
//			Statement stmt = null;
//			ResultSet rs = null;
//			
//			try{
//				
//				// Open a connection
//				System.out.println("Connecting to database...");
//				conn = DriverManager.getConnection(DB_URL,USER,PASS);
//	
//				// Execute a query
//				System.out.println("Creating statement...");
//				stmt = conn.createStatement();
//				int x = stmt.executeUpdate( sql );
//				
//				return true;
//			
//			} catch( SQLException e ){
//				
//				e.printStackTrace();
//				return false;
//			}finally {
//				try{
//					
//					rs.close();
//					stmt.close();
//					conn.close();
//					
//				}catch( SQLException ex ){
//					ex.printStackTrace();
//				}
//			}
//			
//		}
		
}
