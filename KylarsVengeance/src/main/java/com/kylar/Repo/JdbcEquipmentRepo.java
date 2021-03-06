package com.kylar.Repo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kylar.Domain.Equipment;
import com.kylar.Domain.ShopItem;
import com.kylar.RowMapper.EquipmentMapper;

@Repository
public class JdbcEquipmentRepo implements EquipmentRepo {
	private JdbcTemplate jdbcTemplate;
	Random random = new Random();


	@Autowired
	public JdbcEquipmentRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Equipment getEquipment(String item) {		
		String sql = "SELECT * FROM equipment WHERE item = ?";
		Equipment equipment = jdbcTemplate.queryForObject(sql, new Object[] { item }, new EquipmentMapper());
		return equipment;
	}

	@Override
	public void updateEqipmentInfo(Equipment equipment) {
		int prot = random.nextInt(15 - 10 + 1) + 10;
		int dam = random.nextInt(60 - 20 + 1) + 20;
		
		String sql = "UPDATE equipment SET protection = ?, damage = ?,"
				+ "currentLevel = ?, priceForUpgrade = ?, salePrice = ? "
				+ "WHERE item = ?";
		jdbcTemplate.update(sql, new Object[] { 
				(equipment.getCurrentLevel()+1)*prot, 
				(equipment.getCurrentLevel()+1)*dam,
				equipment.getCurrentLevel()+1,
				(equipment.getCurrentLevel()+1)*250,
				(equipment.getCurrentLevel()+1)*50,
				equipment.getItem()
				});
	}

	
	@Override
	public void removeEquipment(Equipment equipment) {
		String sql = "DELETE FROM equipment WHERE item = ?";
		jdbcTemplate.update(sql, new Object[] { equipment.getItem() });
	}

	@Override
	public List<Equipment> getAllEquipment() {
		String sql = "SELECT * FROM equipment";
		return jdbcTemplate.query(sql, new EquipmentMapper());
	}

	@Override
	public List<Equipment> getAllSellable() {
		String sql = "SELECT * FROM equipment WHERE beSold = 1";
		return jdbcTemplate.query(sql, new EquipmentMapper());
	}

	@Override
	public List<Equipment> getAllUpgradable() {
		String sql = "SELECT * FROM equipment WHERE currentLevel < 5";
		return jdbcTemplate.query(sql, new EquipmentMapper());
	}

	@Override
	public void addEquipment(ShopItem shopItem) {
		String sql = "INSERT INTO equipment (item, protection, damage, durability, currentLevel, priceForUpgrade, beSold, salePrice) VALUES (?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, 
			new Object[] {shopItem.getItem(),shopItem.getProtection(), shopItem.getDamage(), shopItem.getDurability(), shopItem.getCurrentLevel(), shopItem.getPriceForUpgrade(), shopItem.getSale(), shopItem.getSalePrice()} );

	}
}
