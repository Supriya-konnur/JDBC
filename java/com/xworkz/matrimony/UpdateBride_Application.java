package com.xworkz.matrimony;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class UpdateBride_Application {

	public static void main(String[] args) {

		BrideDTO bride1 = new BrideDTO();

		bride1.setId(12);
		bride1.setName("Nagashree");
		bride1.setAge(22);
		bride1.setHeight(5.3);
		bride1.setWeight(40);
		bride1.setQualification("M.tech");
		bride1.setExpectation("6 feet height");
		bride1.setPhoneNumber("725992981");
		bride1.setSalary(700000);
		bride1.setOcupation("Engineer");
		bride1.setAddress("Mandya");

		BrideDTO bride2 = new BrideDTO();
		bride2.setId(13);
		bride2.setName("Lalitha");
		bride2.setAge(23);
		bride2.setHeight(40);
		bride2.setWeight(4.5);
		bride2.setQualification("M.tech");
		bride2.setExpectation("no current existing loan");
		bride2.setPhoneNumber("725992981");
		bride2.setSalary(5000000);
		bride2.setOcupation("to be good");
		bride2.setAddress("Gadag");

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		List<BrideDTO> brides = new ArrayList<BrideDTO>();
		brides.add(bride1);
		brides.add(bride2);
		int[] result = matrimonyService.validateAndUpdateBrides(brides);
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				// System.out.println(i+"the bride failed to create");//only for id
				System.out.println(brides.get(i).getName() + " bride failed to update");
			} else {
				System.out.println(brides.get(i).getName() + " bride succeded  to update");
			}
		}
	}

}
