package com.kylar.Repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kylar.Domain.ShopItem;
import com.kylar.RowMapper.ShopItemMapper;

@Repository
public class JdbcShopRepo implements ShopRepo{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcShopRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void addToShop(ShopItem shopitem) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dropStock(ShopItem shopItem) {
		String sql = "UPDATE shop SET stock = ? WHERE item = ?";
		jdbcTemplate.update(sql, new Object[] {shopItem.getStock()-1, shopItem.getItem()});
	}

	@Override
	public void purchase(ShopItem shopItem) {
		String sql = "SELECT * FROM shop WHERE item = ?";
		jdbcTemplate.update(sql, new Object[] { shopItem.getItem() });
		
	}

	@Override
	public List<ShopItem> getStock() {
		String sql = "SELECT * FROM shop";
		return jdbcTemplate.query(sql, new ShopItemMapper());
	}

	@Override
	public void removeFromShop(ShopItem shopItem) {
		String sql = "DELETE FROM shop WHERE item = ?";
		jdbcTemplate.update(sql, new Object[] { shopItem.getItem() });
	}

}
