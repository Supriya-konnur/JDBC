package com.xworkz.matrimony;

import static com.xworkz.matrimony.constant.Constants.DB_URL;
import static com.xworkz.matrimony.constant.Constants.PASSWORD;
import static com.xworkz.matrimony.constant.Constants.USER_NAME;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionManagementApplication {

	public static void main(String[] args) {
		Connection con=null;
		Savepoint savepoint=null;
		try {
			con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			con.setAutoCommit(false);
			Statement stmt= con.createStatement();
		String query1="insert into matrimony.bride values(2,'Rakshitha',22,4.6,45,'B.E','kind hearted','1234567890',300000,'Engineer','Kottur')";
		
		String query2="insert into matrimony.bride values(2,'Vaishanvi',22,4.6,45,'B.E','kind hearted','1234567890',800000,'Engineer','Banglore')";
		String query3="update matrimony.bride set  expectations='Full stack developer' where id=8";
		String query4="delete from matrimony.bride where id=1";
		stmt.execute(query1);
		savepoint=con.setSavepoint();
		stmt.execute(query2);
		stmt.execute(query3);
		stmt.execute(query4);
		System.out.println("success");
		con.commit();
		
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				//con.rollback();
				con.rollback(savepoint);
				con.commit();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		
	}
		}


