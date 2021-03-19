package com.xworkz.matrimony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;



public class GetBrideApplliction {
	public static void main(String[] args) {
		
		MatrimonyDAO matrimonyDAO=new MatrimonyDAOImpl();
		BrideDTO brideDTO =matrimonyDAO.getById(2);
		MatrimonyService matrimonyService=new MatrimonyServiceImpl(matrimonyDAO);
		if(brideDTO!=null) {
			System.out.println(brideDTO);
		}
		
		
		
		//System.out.println(matrimonyService);
		
		
		
		
		
		
		
		
		
		
		
//		Connection connection = null;
//
//		try {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
//			System.out.println("conneted with database");
//			Statement stmt = connection.createStatement();
//			ResultSet resultSet = stmt.executeQuery("select * from matrimony.bride where id=1");
//			
//			BrideDTO bride = new BrideDTO();
////			while(resultSet.next()) {
//
//			resultSet.next();// here we want pointing to only id so we don't use while
//			bride.setId(resultSet.getInt(1));
//			bride.setName(resultSet.getString(2));
//			bride.setAge(resultSet.getInt(3));
//			bride.setHeight(resultSet.getDouble(4));
//			bride.setWeight(resultSet.getDouble(5));
//			bride.setQualification(resultSet.getString(6));
//			bride.setExpectation(resultSet.getString(7));
//			bride.setPhoneNumber(resultSet.getString(8));
//			bride.setSalary(resultSet.getDouble(9));
//			bride.setAddress(resultSet.getString(10));
//			bride.setOcupation(resultSet.getString(11));
//			System.out.println(bride);
//
//			// }
//		} catch (SQLException e) {
//			e.printStackTrace();
//			System.out.println("failed to connect to database");
//		}
//		finally {
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

	


