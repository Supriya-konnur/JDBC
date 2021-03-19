package com.xworkz.matrimony;

import java.util.ArrayList;   
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class ManipulationGroomApplications {
	public static void main(String[] args) {
		GroomDTO groom1 = new GroomDTO();

		groom1.setId(4);
		groom1.setName("Vinay");
		groom1.setAge(22);
		groom1.setHeight(5.3);
		groom1.setWeight(40);
		groom1.setQualification("B.E");
		groom1.setExpectation("kind hearted");
		groom1.setPhoneNumber("725992981");
		groom1.setSalary(500000);
		groom1.setOcupation("Engineer");
		groom1.setAddres("Mandya");

		GroomDTO groom2 = new GroomDTO();
		groom2.setId(5);
		groom2.setName("Vijay");
		groom2.setAge(23);
		groom2.setHeight(40);
		groom2.setWeight(4.5);
		groom2.setQualification("B.E");
		groom2.setExpectation("no current existing loan");
		groom2.setPhoneNumber("725992981");
		groom2.setSalary(2000000);
		groom2.setOcupation("to be good");
		groom2.setAddres("Gadag");

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);

		List<GroomDTO> grooms = new ArrayList<GroomDTO>();
		grooms.add(groom1);
		grooms.add(groom2);

		// for prepare Statement
		int[] result = matrimonyService.validateAndInsertGroom(grooms);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
		
	}