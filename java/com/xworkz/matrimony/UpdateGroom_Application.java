package com.xworkz.matrimony;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;

import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class UpdateGroom_Application {

	public static void main(String[] args) {
		GroomDTO groom1 = new GroomDTO();

		groom1.setId(4);
		groom1.setName("Vinay");
		groom1.setAge(24);
		groom1.setHeight(6.1);
		groom1.setWeight(60);
		groom1.setQualification("M.tech");
		groom1.setExpectation("to be good wife ");
		groom1.setPhoneNumber("725992981");
		groom1.setSalary(700000);
		groom1.setOcupation("Engineer");
		groom1.setAddres("Mandya");

		GroomDTO groom2 = new GroomDTO();
		groom2.setId(5);
		groom2.setName("Vijay");
		groom2.setAge(26);
		groom2.setHeight(6.0);
		groom2.setWeight(45);
		groom2.setQualification("M.tech");
		groom2.setExpectation("no current existing loan");
		groom2.setPhoneNumber("725992981");
		groom2.setSalary(5000000);
		groom2.setOcupation("to be good");
		groom2.setAddres("Gadag");

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		List<GroomDTO> grooms = new ArrayList<GroomDTO>();
		grooms.add(groom1);
		grooms.add(groom2);

		int[] result = matrimonyService.validateAndUpdateGroom(grooms);
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				// System.out.println(i+"the bride failed to create");//only for id
				System.out.println(grooms.get(i).getName() + " groom failed to update");
			} else {
				System.out.println(grooms.get(i).getName() + " groom succeded  to update");
			}
		}

	}

}
