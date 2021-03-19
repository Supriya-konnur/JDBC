package com.xworkz.matrimony;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class GetGroomApplication {

	public static void main(String[] args) {

		MatrimonyDAO matrimonyDAO = new MatrimonyDAOImpl();
		GroomDTO groomDTO =matrimonyDAO.getById1(2);
		MatrimonyService matrimonyService = new MatrimonyServiceImpl(matrimonyDAO);
		if (groomDTO != null) {
			System.out.println(groomDTO);
		}

	}

}
