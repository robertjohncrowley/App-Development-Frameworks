package com.kylar.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kylar.Domain.Equipment;

public class EquipmentMapper implements RowMapper<Equipment>{
	@Override
	public Equipment mapRow(ResultSet rs, int i) throws SQLException {
		return new Equipment(rs.getString("item"), 
				rs.getInt("protection"), rs.getInt("damage"), rs.getInt("durability"),
				rs.getInt("currentLevel"), rs.getInt("priceForUpgrade"), rs.getInt("beSold"), 
				rs.getInt("salePrice"));
	}
}