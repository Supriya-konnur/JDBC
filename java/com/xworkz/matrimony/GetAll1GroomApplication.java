package com.xworkz.matrimony;

import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dao.MatrimonyDAOImpl;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;
import com.xworkz.matrimony.service.MatrimonyService;
import com.xworkz.matrimony.service.MatrimonyServiceImpl;

public class GetAll1GroomApplication {

	public static void main(String[] args) {

		MatrimonyDAO dao = new MatrimonyDAOImpl();
		MatrimonyService service = new MatrimonyServiceImpl(dao);
		List<GroomDTO> grooms =  service.getAll1();
		
		
		//using foreach loop
		for (GroomDTO groomDTO : grooms) {
			System.out.println(groomDTO);
		}
	}

}
