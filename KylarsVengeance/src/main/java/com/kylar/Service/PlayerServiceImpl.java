package com.kylar.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kylar.Domain.Player;
import com.kylar.Repo.PlayerRepo;

@Service
public class PlayerServiceImpl implements PlayerService {

	PlayerRepo playerRepo;
	
	@Autowired
	public PlayerServiceImpl(PlayerRepo playerRepo) {
		this.playerRepo = playerRepo;
	}

	@Override
	public Player getPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePlayerInfo(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] endOfRoundInfo(Player player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPlayer(Player player) {
		// TODO Auto-generated method stub
		
	}

}

