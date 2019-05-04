package com.sample.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.learning.model.DatabaseModel;

public class JDBCSample {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	static final String USER = "root";
	static final String PASS = "root";
	
	
	public Connection connection;
	
	public JDBCSample() throws SQLException{
		connection = getConnections();
	}
	
	

	public void printData(List<DatabaseModel> data) {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i).getId());
			System.out.println(data.get(i).getName());
			System.out.println(data.get(i).getAge());
		}
	}

	public List<DatabaseModel> executeStatements()
			throws SQLException {
		Statement statement = null;
		

		try {
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sqlQuerry;
		sqlQuerry = "SELECT * FROM sampleTestEmp";
		ResultSet resultSet = statement.executeQuery(sqlQuerry);
		List<DatabaseModel> empList = new ArrayList<DatabaseModel>();
		while (resultSet.next()) {
			DatabaseModel databaseModel = new DatabaseModel();
			databaseModel.setId(resultSet.getInt(1));
			databaseModel.setName(resultSet.getString(2));
			databaseModel.setAge(resultSet.getInt(3));
			empList .add(databaseModel);
		}
		return empList;
	}

	public Connection getConnections() throws SQLException {
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		connection = DriverManager.getConnection(DB_URL, USER, PASS);
		return connection;

	}

	public List<DatabaseModel> executeStatements(String sqlQuerry) throws SQLException {
		Statement statement = null;
		statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sqlQuerry);
		List<DatabaseModel> id = new ArrayList<DatabaseModel>();
		while (resultSet.next()) {
			DatabaseModel databaseModel = new DatabaseModel();
			databaseModel.setId(resultSet.getInt(1));
			databaseModel.setName(resultSet.getString(2));
			databaseModel.setAge(resultSet.getInt(3));
			id .add(databaseModel);
		}
		return id;
	}
}
