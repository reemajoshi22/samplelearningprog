package com.sample.learning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.learning.model.DatabaseModel;

public class EmployeeDao {

	 void findAllDetails() {
		JDBCSample sample;
		try {
			sample = new JDBCSample();
			List<DatabaseModel> data = sample.executeStatements();
			sample.printData(data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	void getEmployeeDetailsById(int id) {
		String sqlQuerryId;
		// sqlQuerryId = "SELECT id,name,age FROM sampleTestEmp where id=1";
		sqlQuerryId = "SELECT * FROM sampleTestEmp where id='"+id+"' ";
		JDBCSample sample;
		try {
			sample = new JDBCSample();
			List<DatabaseModel> data = sample.executeStatements(sqlQuerryId);
			System.out.println("Employee Details By ID");
			sample.printData(data);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void getEmployeeDetailsByName(String name) {
		String sqlQuerryName;
		sqlQuerryName = "SELECT id,name,age FROM sampleTestEmp where name='"+name+"' ";
		JDBCSample sample;
		try {
			sample = new JDBCSample();
			List<DatabaseModel> data = sample.executeStatements(sqlQuerryName);
			System.out.println("Employee Details By Name");
			sample.printData(data);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	 void deleteRecord(String name) throws SQLException{
		String sqlQuerryName;
		sqlQuerryName = "Delete from sampleTestEmp where name='"+name+"' ";
		JDBCSample jdbcsample=new JDBCSample();
		PreparedStatement statement = jdbcsample.connection.prepareStatement(sqlQuerryName);
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		}
		
	}
	 void insertRecord(DatabaseModel databaseModel) throws SQLException{
		String sql = "INSERT INTO sampleTestEmp (id, name, age) VALUES (?, ?, ?)";
		 JDBCSample jdbcsample=new JDBCSample();
		PreparedStatement statement = jdbcsample.connection.prepareStatement(sql);
		statement.setLong(1, databaseModel.getId());
		statement.setString(2, databaseModel.getName());
		statement.setLong(3, databaseModel.getAge());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		}
	}
	 void updateRecord(String name, DatabaseModel databaseModel) throws SQLException{
		 String sql = "UPDATE sampleTestEmp SET id=?, name=?, age=? WHERE name='"+name+"' ";
		 JDBCSample jdbcsample=new JDBCSample();
		 PreparedStatement statement = jdbcsample.connection.prepareStatement(sql);
		 statement.setLong(1, databaseModel.getId());
		 statement.setString(2, databaseModel.getName());
		 statement.setLong(3, databaseModel.getAge());
		  
		 int rowsUpdated = statement.executeUpdate();
		 
		 if (rowsUpdated > 0) {
		     System.out.println("An existing user was updated successfully!");
		 }
	 }
}
