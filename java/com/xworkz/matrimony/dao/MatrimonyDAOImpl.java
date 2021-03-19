package com.xworkz.matrimony.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.PreparedStatementWrapper;
import com.xworkz.matrimony.dto.BrideDTO;
import com.xworkz.matrimony.dto.GroomDTO;

import static com.xworkz.matrimony.constant.Constants.*;

public class MatrimonyDAOImpl implements MatrimonyDAO {

	@Override
	public BrideDTO getById(int id) {
		BrideDTO bride = new BrideDTO();

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from matrimony.bride where id=" + id);

			// BrideDTO bride = new BrideDTO();

			resultSet.next();// here we want pointing to only one id so we don't use while
			bride.setId(resultSet.getInt(1));
			bride.setName(resultSet.getString(2));
			bride.setAge(resultSet.getInt(3));
			bride.setHeight(resultSet.getDouble(4));
			bride.setWeight(resultSet.getDouble(5));
			bride.setQualification(resultSet.getString(6));
			bride.setExpectation(resultSet.getString(7));
			bride.setPhoneNumber(resultSet.getString(8));
			bride.setSalary(resultSet.getDouble(9));
			bride.setAddress(resultSet.getString(10));
			bride.setOcupation(resultSet.getString(11));

			// System.out.println(bride);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bride;

	}

	@Override
	public List<BrideDTO> getAll() {

		List<BrideDTO> list = new ArrayList<BrideDTO>();

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from matrimony.bride");

			while (resultSet.next()) {
				BrideDTO bride1 = new BrideDTO();

				bride1.setId(resultSet.getInt(1));
				bride1.setName(resultSet.getString(2));
				bride1.setAge(resultSet.getInt(3));
				bride1.setHeight(resultSet.getDouble(4));
				bride1.setWeight(resultSet.getDouble(5));
				bride1.setQualification(resultSet.getString(6));
				bride1.setExpectation(resultSet.getString(7));
				bride1.setPhoneNumber(resultSet.getString(8));
				bride1.setSalary(resultSet.getDouble(9));
				bride1.setAddress(resultSet.getString(10));
				bride1.setOcupation(resultSet.getString(11));
				list.add(bride1);
				// System.out.println(bride);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int create(BrideDTO bride) {
		int result = 0;

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt = con.prepareStatement("insert into matrimony.bride values(?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, bride.getId());
			stmt.setString(2, bride.getName());
			stmt.setInt(3, bride.getAge());
			stmt.setDouble(4, bride.getHeight());
			stmt.setDouble(5, bride.getWeight());
			stmt.setString(6, bride.getQualification());
			stmt.setString(7, bride.getExpectation());
			stmt.setString(8, bride.getPhoneNumber());
			stmt.setDouble(9, bride.getSalary());
			stmt.setString(10, bride.getOcupation());
			stmt.setString(11, bride.getAddress());
			result = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}
		return result;

	}

	@Override
	public int updatePhoneNumberById(String phoneNumber, int id) {
		int result = 0;
		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt1 = con.prepareStatement("update matrimony.bride set phone_number=? where id = ?");
			stmt1.setString(1, phoneNumber);
			stmt1.setInt(2, id);
			result = stmt1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}
		return result;

	}

	@Override
	public int deleteById(int id) {
		int result = 0;
		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt2 = con.prepareStatement("delete from matrimony.bride where id=?");
			stmt2.setInt(1, id);
			result = stmt2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}

		return result;
	}

	@Override
	public int[] insertBride(List<BrideDTO> brides) {
		int[] result = new int[brides.size()];

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt3 = con
					.prepareStatement("insert into matrimony.bride values (?,?,?,?,?,?,?,?,?,?,?)");

			for (BrideDTO bride : brides) {

				stmt3.setInt(1, bride.getId());
				stmt3.setString(2, bride.getName());
				stmt3.setInt(3, bride.getAge());
				stmt3.setDouble(4, bride.getHeight());
				stmt3.setDouble(5, bride.getWeight());
				stmt3.setString(6, bride.getQualification());
				stmt3.setString(7, bride.getExpectation());
				stmt3.setString(8, bride.getPhoneNumber());
				stmt3.setDouble(9, bride.getSalary());
				stmt3.setString(10, bride.getOcupation());
				stmt3.setString(11, bride.getAddress());
				stmt3.addBatch();
			}
			result = stmt3.executeBatch();

		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("failed");
		}
		return result;
	}

//	@Override
//	public int[] insertBride(List<BrideDTO> brides) {
//		int[] result = new int[brides.size()];
//		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
//			Statement stmt = con.createStatement();
//			//PreparedStatement stmt =con.prepareStatement(INSERT_QUERY);
//			for (BrideDTO dto : brides) {
//				String query = String.format(INSERT_QUERY, dto.getId(),
//						dto.getName(),
//						dto.getAge(), 
//						dto.getHeight(),
//						dto.getWeight(),
//						dto.getQualification(), 
//						dto.getExpectation(), 
//						dto.getPhoneNumber(),
//						dto.getPhoneNumber(), 
//						dto.getSalary(), 
//						dto.getOcupation(), 
//						dto.getAddress());
//						stmt.addBatch(query);
//			}
//			result=stmt.executeBatch();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}

	@Override
	public int[] updateBrides(List<BrideDTO> brides) {
		int[] results = new int[brides.size()];
		try(Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)){
			//con.prepareStatement("update matrimony.bride set qualifcation=?, salary=? where id=?");
			PreparedStatement pstmt=con.prepareStatement(UPDATE_QUARY);
			for(BrideDTO dto : brides) {
				pstmt.setString(1,dto.getQualification());
				pstmt.setDouble(2,dto.getSalary());
				pstmt.setInt(3,dto.getId());
				pstmt.addBatch();
			}
			results=pstmt.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return results;
	}

	@Override
	public int[] deleteIds(List<Integer> ids) {
		int[] results = new int[ids.size()];
		try(Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)){
			PreparedStatement pstmt=con.prepareStatement(DELETE_QUERY);
			for(Integer id : ids) {
				pstmt.setInt(1, id);
				pstmt.addBatch();
			}
			results = pstmt.executeBatch();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
		
	}


	
	
	//for Goorm
	
	@Override
	public GroomDTO getById1(int id) {
		GroomDTO groom = new GroomDTO();

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from matrimony.groom where id=" + id);

			resultSet.next();// here we want pointing to only one id so we don't use while
			groom.setId(resultSet.getInt(1));
			groom.setName(resultSet.getString(2));
			groom.setAge(resultSet.getInt(3));
			groom.setHeight(resultSet.getDouble(4));
			groom.setWeight(resultSet.getDouble(5));
			groom.setQualification(resultSet.getString(6));
			groom.setExpectation(resultSet.getString(7));
			groom.setPhoneNumber(resultSet.getString(8));
			groom.setSalary(resultSet.getDouble(9));
			
			groom.setOcupation(resultSet.getString(10));
			groom.setAddres(resultSet.getString(11));
			// System.out.println(bride);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return groom;

	}			
			
	//	return null;
	

	@Override
	public List<GroomDTO> getAll1() {
		List<GroomDTO> list = new ArrayList<GroomDTO>();

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from matrimony.groom");

			while (resultSet.next()) {
				GroomDTO groom1 = new GroomDTO();
				groom1.setId(resultSet.getInt(1));
				groom1.setName(resultSet.getString(2));
				groom1.setAge(resultSet.getInt(3));
				groom1.setHeight(resultSet.getDouble(4));
				groom1.setWeight(resultSet.getDouble(5));
				groom1.setQualification(resultSet.getString(6));
				groom1.setExpectation(resultSet.getString(7));
				groom1.setPhoneNumber(resultSet.getString(8));
				groom1.setSalary(resultSet.getDouble(9));
				groom1.setOcupation(resultSet.getString(10));
				groom1.setAddres(resultSet.getString(11));
				list.add(groom1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public int create(GroomDTO groom) {
		int result = 0;

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt = con.prepareStatement("insert into matrimony.groom values(?,?,?,?,?,?,?,?,?,?,?)");
			stmt.setInt(1, groom.getId());
			stmt.setString(2, groom.getName());
			stmt.setInt(3, groom.getAge());
			stmt.setDouble(4, groom.getHeight());
			stmt.setDouble(5, groom.getWeight());
			stmt.setString(6, groom.getQualification());
			stmt.setString(7, groom.getExpectation());
			stmt.setString(8, groom.getPhoneNumber());
			stmt.setDouble(9, groom.getSalary());
			stmt.setString(10, groom.getOcupation());
			stmt.setString(11, groom.getAddres());
			result = stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}
		return result;
	}

	@Override
	public int updatePhoneNumberById1(String phoneNumber, int id) {
		int result = 0;
		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement pstmt1 = con.prepareStatement("update matrimony.groom set phone_number=? where id = ?");
			pstmt1.setString(1, phoneNumber);
			pstmt1.setInt(2, id);
			result = pstmt1.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}
		return result;

	}

	@Override
	public int deleteById1(int id) {

		int result = 0;
		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt2 = con.prepareStatement("delete from matrimony.groom where id=?");
			stmt2.setInt(1, id);
			result = stmt2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("failed to connect data base");
		}

		return result;
	}

	@Override
	public int[] insertGroom(List<GroomDTO> grooms) {
		int[] result = new int[grooms.size()];

		try (Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)) {
			PreparedStatement stmt3 = con
					.prepareStatement("insert into matrimony.groom values (?,?,?,?,?,?,?,?,?,?,?)");

			for (GroomDTO groom : grooms) {

				stmt3.setInt(1, groom.getId());
				stmt3.setString(2, groom.getName());
				stmt3.setInt(3, groom.getAge());
				stmt3.setDouble(4, groom.getHeight());
				stmt3.setDouble(5, groom.getWeight());
				stmt3.setString(6, groom.getQualification());
				stmt3.setString(7, groom.getExpectation());
				stmt3.setString(8, groom.getPhoneNumber());
				stmt3.setDouble(9, groom.getSalary());
				stmt3.setString(10, groom.getOcupation());
				stmt3.setString(11, groom.getAddres());
				stmt3.addBatch();
			}
			result = stmt3.executeBatch();

		} catch (SQLException e) {
			e.printStackTrace();

			System.out.println("failed");
		}
		return result;
			
	}

	@Override
	public int[] updateGrooms(List<GroomDTO> grooms) {
		int[] results = new int[grooms.size()];
		try(Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)){
			
			PreparedStatement pstmt=con.prepareStatement(UPDATE_QUARY1);
			for(GroomDTO dto : grooms) {
				pstmt.setString(1,dto.getQualification());
				pstmt.setDouble(2,dto.getSalary());
				pstmt.setInt(3,dto.getId());
				pstmt.addBatch();
			}
			results=pstmt.executeBatch();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return results;
	}

	@Override
	public int[] deleteIdsOfGroom(List<Integer> ids) {
		int[] results = new int[ids.size()];
		try(Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD)){
			PreparedStatement pstmt=con.prepareStatement(DELETE_QUERY1);
			for(Integer id : ids) {
				pstmt.setInt(1, id);
				pstmt.addBatch();
			}
			results = pstmt.executeBatch();	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return results;
		
	}


			
	
}

