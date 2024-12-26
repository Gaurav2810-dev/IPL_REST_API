package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.PlayerDao;
import com.jbk.model.Players;
@Service
public class PlayerService {
	@Autowired
	PlayerDao playerDao;

	public String AddPlayers(Players players) {
		String addPlayers = playerDao.AddPlayers(players);
		return addPlayers;

	}

	public List<Players> GetAllPlayers() {
		List<Players> getAllPlayers = playerDao.GetAllPlayers();
		return getAllPlayers;
		
		
	}

	public Players GetPlayerById(int id) {
		Players getPlayerById = playerDao.GetPlayerById(id);
		return getPlayerById;
		
		
	}

	public String PlayerUpdate(Players players, int id) {
		
		  int status = playerDao.PlayerUpdate(players,id);
		  if(status==1)
		  {
			  return"Player Updated..";
		  }
		  else
			  
		  {
			  return "Player Not Found";
		  }
	}

	public String DeletePlayer(int id) {
		int status = playerDao.DeletePlayer(id);
		
		if(status==0)
		{
			return"Player Not Found";
		}
		else
		{
			return"Player Deleted...";
		}
		
		
	}

}
