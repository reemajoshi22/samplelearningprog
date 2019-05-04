package com.hibernate;

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
			DatabaseModel data = (DatabaseModel) sample.getConnections().get(DatabaseModel.class, "");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
}
