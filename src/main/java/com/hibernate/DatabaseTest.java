/**
 * 
 */
package com.hibernate;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.learning.model.DatabaseModel;
import com.example.learning.model.DatabaseModelTwo;
/**
 * @author REEMA JOSHI
 *
 */
public class DatabaseTest {

	public static void main(String[] args) {
		try {
			DatabaseTest databaseTest = new DatabaseTest();
			// TODO 1
			// insert one record.
			// find that record
			// if record is found, we will be sure that insert the record was
			// successful.
			 databaseTest.Insert();
			 //databaseTest.insertIntoDatabaseModelTwo();
			// TODO 2
			// insert one record.
			// find that record
			// if record is found, delete the record.
			// find the record again.
			// if record is not found, we will be sure that delete the record
			// was successful.
			 databaseTest.Delete();
			// TODO 3
			// insert one record.
			// find that record
			// if record is found, Update the record.
			// find the record again.
			// if record is found and value is updated. we will be sure that
			// update the record was successful.
			 databaseTest.Update();
			// TODO 4
			// Delete all record in table.
			// find any record
			// if records are not found. we will be sure that delete all the
			// record was successful.
			//databaseTest.DeleteAll();
			 
			 //to check one to one mapping
			 databaseTest.Fetch();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	private void Fetch() {
		DatabaseModel fetch = new DatabaseModel();
	}

	private void DeleteAll() throws SQLException {
		JDBCSample deleteAll = new JDBCSample();
		 //deleteAll.deleteAll();// using hql
		deleteAll.delete(); // using criteria
	}

	private void Update() throws SQLException {
		DatabaseModel modelTODO3 = new DatabaseModel();
		modelTODO3.setId(803);
		modelTODO3.setAge(803);
		modelTODO3.setName("eight zero three");
		JDBCSample jdbcSamplemodelTODO3 = new JDBCSample();
		jdbcSamplemodelTODO3.save(modelTODO3);

		/*DatabaseModel findResultTODO3 = jdbcSamplemodelTODO3.findByAge(227);
		if (findResultTODO3 != null) {
			findResultTODO3.setAge(1000);
			findResultTODO3.setId(223);
			findResultTODO3.setName("onethousand");
			jdbcSamplemodelTODO3.update(findResultTODO3);
		}*/
	}

	private void Delete() throws SQLException {
		DatabaseModel modelTODO2 = new DatabaseModel();
		modelTODO2.setId(802);
		modelTODO2.setAge(802);
		modelTODO2.setName("eight zero two");
		JDBCSample jdbcSamplemodelTODO2 = new JDBCSample();
		jdbcSamplemodelTODO2.save(modelTODO2);
/*
		DatabaseModel findResultTODO2 = jdbcSamplemodelTODO2.findByAge(222);
		if (findResultTODO2 != null) {
			System.out.println("222th record" + findResultTODO2.getName());
			System.out.println("deleting 222th record");
			jdbcSamplemodelTODO2.delete(findResultTODO2);
			DatabaseModel findAgainAfterDel = jdbcSamplemodelTODO2
					.findByAge(222);
			if (findAgainAfterDel != null) {
				System.out.println("delete was not successfull");
			} else {
				System.out.println("delete was  successfull");
			}
		} else {
			System.out.println("Nothing is there to delete");
		}*/

	}

	private void Insert() throws SQLException {
		DatabaseModel model = new DatabaseModel();
		model.setId(808);
		model.setAge(808);
		model.setName("eight zero eight");
		JDBCSample jdbcSample = new JDBCSample();
		jdbcSample.save(model);
		DatabaseModel findResult = jdbcSample.findByAge(808);
		if (findResult != null) {
			System.out.println("Insert was successfull" + findResult.getName());
		} else {
			System.out.println("Insert was not successfull");
		}

	}
	private void insertIntoDatabaseModelTwo() throws SQLException{
		DatabaseModelTwo modelTwo=new DatabaseModelTwo();
		JDBCSample sample1 = new JDBCSample();
		DatabaseModel dbModel=sample1.findByAge(301);
		modelTwo.setDbModel(dbModel);
		
		modelTwo.setId(dbModel.getId());
		modelTwo.setLocation("j&k");
		modelTwo.setPincode(180001);
		
		JDBCSample sample=new JDBCSample();
		sample.saveModelTwo(modelTwo);
		
	}
}
