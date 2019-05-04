/**
 * 
 */
package com.sample.learning;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.example.learning.model.DatabaseModel;

/**
 * @author HCL
 *
 */
public class DatabaseTest {

	public static void main(String[] args) {
		try {
			DatabaseModel databaseModel = new DatabaseModel();
			databaseModel.setId(1);
			databaseModel.setName("abcd");
			databaseModel.setAge(12);
			
			
			
			EmployeeDao employeeDao = new EmployeeDao();
			employeeDao.getEmployeeDetailsById(12);
			employeeDao.getEmployeeDetailsByName("reema");
			employeeDao.deleteRecord("riya");
			employeeDao.updateRecord("megha",databaseModel);
			employeeDao.insertRecord(databaseModel);
			employeeDao.findAllDetails();
			/*List<DatabaseModel> data = sample.executeStatements();
			sample.printData(data);*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
