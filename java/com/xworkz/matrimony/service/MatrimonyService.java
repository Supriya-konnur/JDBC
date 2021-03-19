package com.xworkz.matrimony.service;

import java.util.List;

import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;

public interface MatrimonyService {
	public BrideDTO getbyId(int id);

	public List<BrideDTO> getAll();

	public int ValidateAndCreateBride(BrideDTO bride);

	public int ValidateAndUpdatePhoneNumberById(String phoneNumber, int id);

	public int ValidateAndDeleteById(int id);

	public int[] validateAndInsertBrides(List<BrideDTO> brides);

	public int[] validateAndUpdateBrides(List<BrideDTO> brides);

	// public int[] validateAndDeleteById(List<BrideDTO> brides);
	public int[] validateAndDeleteIds(List<Integer> ids);

	
	
	// for Groom
	public GroomDTO getById1(int id);

	public List<GroomDTO> getAll1();

	public int ValidateAndCreateGroom(GroomDTO grooms);

	public int ValidateAndUpdatePhoneNumberById1(String phoneNumber, int id);

	public int ValidateAndDeleteByIdGroom(int id);

	public int[] validateAndInsertGroom(List<GroomDTO> grooms);

	public int[] validateAndUpdateGroom(List<GroomDTO> grooms);
	
	public int[] validateAndDeleteIdsOfGroom(List<Integer> ids);


}
