package com.xworkz.matrimony;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class GetAllBrideApplication {

	public static void main(String[] args) {
		
		
		MatrimonyDAO dao = new MatrimonyDAOImpl();
		MatrimonyService service = new MatrimonyServiceImpl(dao);
		List<BrideDTO> brides =  service.getAll();
		
		
		//using foreach loop
		for (BrideDTO brideDTO : brides) {
			System.out.println(brideDTO);
		}
		
		
		//using lamda expression (foreach method)
//		List<BrideDTO> brides =  service.getAll();
//		
//		brides.forEach(e->System.out.println(e));

		
//		MatrimonyDAO matrimonyDAO=new MatrimonyDAOImpl();
//		BrideDTO brideDTO =matrimonyDAO.getById(2);
//		System.out.println(brideDTO);
		
		
		
		
		/*
		 * Connection connection = null;
		 * 
		 * try { connection = DriverManager.getConnection("jdbc:mysql://localhost:3306",
		 * "root", "root"); System.out.println("conneted with database"); Statement stmt
		 * = connection.createStatement(); ResultSet resultSet =
		 * stmt.executeQuery("select * from matrimony.bride");
		 * 
		 * //List<BrideDTO> brideDTOs = new ArrayList<BrideDTO>();
		 * 
		 * while (resultSet.next()) { BrideDTO bride = new BrideDTO();
		 * 
		 * bride.setId(resultSet.getInt(1)); bride.setName(resultSet.getString(2));
		 * bride.setAge(resultSet.getInt(3)); bride.setHeight(resultSet.getDouble(4));
		 * bride.setWeight(resultSet.getDouble(5));
		 * bride.setQualification(resultSet.getString(6));
		 * bride.setExpectation(resultSet.getString(7));
		 * bride.setPhoneNumber(resultSet.getString(8));
		 * bride.setSalary(resultSet.getDouble(9));
		 * bride.setAddress(resultSet.getString(10));
		 * bride.setOcupation(resultSet.getString(11)); System.out.println(bride);
		 * 
		 * // brideDTOs.add(bride);
		 * 
		 * } } catch (SQLException e) { e.printStackTrace();
		 * System.out.println("failed to connect to database"); }
		 */
		

	}

}
