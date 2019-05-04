package com.oneToOne;

import java.sql.SQLException;

import com.example.learning.model.DatabaseModel;
import com.hibernate.JDBCSample;

public class DataBaseOperations {

	public static void main(String[] args) throws SQLException {
		DataBaseOperations dataBaseOperations = new DataBaseOperations();
		dataBaseOperations.read();
	}

	public void read() throws SQLException {
		ConnectionProvider connectionProvider = new ConnectionProvider();
		StoreModel storeModel = connectionProvider.findById(3);
		if (storeModel != null) {
			System.out
					.println("Read was successfull \n" + storeModel.getBook_id().getTitle());
		} else {
			System.out.println("Read was not successfull");
		}

	}

}
