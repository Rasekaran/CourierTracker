package com.courier.tracking.dao.datasource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class CustomDataSource extends DriverManagerDataSource {

	public CustomDataSource() {
		this.setDriverClassName( "com.mysql.jdbc.Driver" );
		this.setUrl( "jdbc:mysql://localhost:3306/courier" );
		this.setUsername( "root" );
		this.setPassword( "password" );
	}
}
