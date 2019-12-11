package com.tyss.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.tyss.fms.controller.DBConnection;
import com.tyss.fms.dto.LandBean;

public class LandDaoImpl implements LandDao {
	static PreparedStatement pstmt = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	LandBean land = null;
	static Connection connection = DBConnection.getConnection();
	Set<LandBean> landSet = new HashSet<LandBean>();

	@Override
	public boolean addLandRecord(LandBean land) {
		try {
			pstmt = connection.prepareStatement(
					"insert into land(land_Id, owner_Id,land_Area_In_Sq_Feet, land_Latitude, land_Longitude, "
							+ "land_Cost, land_Tax, is_Land_Disputed) VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setInt(1, land.getLandId());
			pstmt.setInt(2, land.getLandOwnerId());
			pstmt.setInt(3, land.getLandAreaInSqFeet());
			pstmt.setString(4, land.getLandLatitude());
			pstmt.setString(5, land.getLandLongitude());
			pstmt.setDouble(6, land.getLandCost());
			pstmt.setDouble(7, land.getLandTax());
			pstmt.setBoolean(8, land.isLandDisputed());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Set<LandBean> getAllLandRecords() {
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select land_Id, owner_Id, land_Area_In_Sq_Feet, land_Latitude, land_Longitude, land_Cost, land_Tax, is_Land_Disputed from land");
			while (rs.next()) {
				land = new LandBean();
				land.setLandId(rs.getInt(1));
				land.setLandOwnerId(rs.getInt(2));
				land.setLandAreaInSqFeet(rs.getInt(3));
				land.setLandLatitude(rs.getString(4));
				land.setLandLongitude(rs.getString(5));
				land.setLandCost(rs.getDouble(6));
				land.setLandTax(rs.getDouble(7));
				land.setLandDisputed(rs.getBoolean(8));
				landSet.add(land);
			}
			return landSet;

		} catch (Exception e) {
			System.out.println("Could not load data, exception occured");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updateLandRecord(int landId, double newLandTax) {
		try {
			pstmt = connection.prepareStatement("UPDATE land SET land_Tax =? WHERE land_Id=?");
			pstmt.setDouble(1, newLandTax);
			pstmt.setInt(2, landId);
			int count = pstmt.executeUpdate();
			if (count > 0)
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}
