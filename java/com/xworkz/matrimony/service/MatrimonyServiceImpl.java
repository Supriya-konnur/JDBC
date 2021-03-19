package com.xworkz.matrimony.service;

import java.util.List;

import com.xworkz.matrimony.dao.MatrimonyDAO;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;

public class MatrimonyServiceImpl implements MatrimonyService {
	public MatrimonyDAO matrimonyDAO;

	public MatrimonyServiceImpl(MatrimonyDAO matrimonyDAO) {
		this.matrimonyDAO = matrimonyDAO;
	}

	@Override
	public BrideDTO getbyId(int id) {
		if (id == 0) {
			System.out.println("invalid id");
		}
		return null;
	}

	@Override
	public List<BrideDTO> getAll() {
		// TODO Auto-generated method stub
		return matrimonyDAO.getAll();
	}

	@Override
	public int ValidateAndCreateBride(BrideDTO bride) {
		if (null == bride) {
			System.out.println("bride can not be null");
			return 0;
		} else if (bride.getId() == 0) {
			System.out.println("invalid ID");
			return 0;

		} else {
			return this.matrimonyDAO.create(bride);
		}

	}

	@Override
	public int ValidateAndUpdatePhoneNumberById(String phoneNumber, int id) {
		if (phoneNumber == null) {
			System.out.println("phoneNumber can not be null");
			return 0;

		} else if (id == 0) {
			System.out.println("invlid ID");

			return 0;
		} else {
			return this.matrimonyDAO.updatePhoneNumberById(phoneNumber, id);
		}

	}

	@Override
	public int ValidateAndDeleteById(int id) {
		if (id == 0) {
			System.out.println("invalid ID");

		} else {
			return this.matrimonyDAO.deleteById(id);
		}
		return 0;

	}

	@Override
	public int[] validateAndInsertBrides(List<BrideDTO> brides) {

		if (brides != null && brides.size() > 0) {
			System.out.println("The bride list is valid");
			int[] result = matrimonyDAO.insertBride(brides);
			return result;
		} else {
			System.out.println("The list is not valid");
			int[] result = new int[brides.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			return result;
		}

	}

	@Override
	public int[] validateAndUpdateBrides(List<BrideDTO> brides) {
		if (brides == null) {
			System.out.println("Brides list can not be null");
			int[] results = new int[brides.size()];
			for (int i = 0; i < results.length; i++) {
				results[i] = 0;
			}
			return results;
		} else {
			return matrimonyDAO.updateBrides(brides);
		}

	}
//
//	@Override
//	public int[] validateAndInsertBrides(List<BrideDTO> brides) {
//		if(brides==null) {
//			System.out.println("bride list can not be null");
//			int[] result= new int[brides.size()];
//			for (int i = 0; i < result.length; i++) {
//				result[i]=0;
//			}
//			return result;
//		}
//		else {
//			return matrimonyDAO.insertBride(brides);
//		}

	@Override
	public int[] validateAndDeleteIds(List<Integer> ids) {
		if (ids == null) {
			System.out.println("invalid ID");
			int[] result = new int[ids.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			return result;

		} else {

			return this.matrimonyDAO.deleteIds(ids);

		}

	}

	@Override
	public GroomDTO getById1(int id) {
		if (id == 0) {
			System.out.println("invalid id");
		}
		return matrimonyDAO.getById1(id);
	}

	@Override
	public List<GroomDTO> getAll1() {
		// TODO Auto-generated method stub
		return matrimonyDAO.getAll1();
	}

	@Override
	public int ValidateAndCreateGroom(GroomDTO grooms) {

		if (null == grooms) {
			System.out.println("bride can not be null");
			return 0;
		} else if (grooms.getId() == 0) {
			System.out.println("invalid ID");
			return 0;

		} else {
			return this.matrimonyDAO.create(grooms);
		}

	}

	@Override
	public int ValidateAndUpdatePhoneNumberById1(String phoneNumber, int id) {
		if (phoneNumber == null) {
			System.out.println("phoneNumber can not be null");
			return 0;

		} else if (id == 0) {
			System.out.println("invlid ID");

			return 0;
		} else {
			return this.matrimonyDAO.updatePhoneNumberById1(phoneNumber, id);
		}

	}

	@Override
	public int ValidateAndDeleteByIdGroom(int id) {
		if (id == 0) {
			System.out.println("invalid ID");

		} else {
			return this.matrimonyDAO.deleteById1(id);
		}
		return 0;

	}

	@Override
	public int[] validateAndInsertGroom(List<GroomDTO> grooms) {

		if (grooms != null && grooms.size() > 0) {
			System.out.println("The groom list is valid");
			int[] result = matrimonyDAO.insertGroom(grooms);
			return result;
		} else {
			System.out.println("The list is not valid");
			int[] result = new int[grooms.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			return result;
		}

	}

	@Override
	public int[] validateAndUpdateGroom(List<GroomDTO> grooms) {
		if (grooms == null) {
			System.out.println("grooms list can not be null");
			int[] results = new int[grooms.size()];
			for (int i = 0; i < results.length; i++) {
				results[i] = 0;
			}
			return results;
		} else
			return matrimonyDAO.updateGrooms(grooms);

	}

	@Override
	public int[] validateAndDeleteIdsOfGroom(List<Integer> ids) {
		if (ids == null) {
			System.out.println("invalid ID");
			int[] result = new int[ids.size()];
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
			return result;

		} else {

			return this.matrimonyDAO.deleteIdsOfGroom(ids);

		}
	}
}
