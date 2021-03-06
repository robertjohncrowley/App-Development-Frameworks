package com.kylar.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kylar.Domain.Player;
import com.kylar.RowMapper.PlayerMapper;

@Repository
public class JdbcPlayerRepo implements PlayerRepo{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcPlayerRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public Player getPlayer() {
		String sql = "SELECT * FROM player";
		Player player = jdbcTemplate.queryForObject(sql, new Object[] {}, new PlayerMapper());
		return player;
	}

	public void updatePlayerInfo(Player player) {
		String sql = "UPDATE player SET balance = ? , health = ? WHERE ign = ?";
		jdbcTemplate.update(sql, new Object[] {player.getBalance(), player.getHealth(), player.getIgn()});
		
	}

	public int[] endOfRoundInfo(Player player) {
		// TODO Auto-generated method stub
		return null;
	}


	public void addPlayer(Player player) {
		String sql = "INSERT INTO player (firstName,lastName,ign,balance,health) VALUES (?,?,?,?,?)";
		jdbcTemplate.update(sql,new Object[] { player.getFirstName(), player.getLastName(), player.getIgn(), 
				player.getBalance(), player.getBalance() });
	}

}
