package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.model.Players;

@Repository
public class PlayerDao {
	List<Players> listPlayer = new ArrayList<Players>();

	public PlayerDao() {
		listPlayer.add(new Players(1, "Sachin Tendulkar", 40, 1, "Batsman"));
		listPlayer.add(new Players(2, "Virat Kolhi", 38, 2, "Batsman"));
	}

	public String AddPlayers(Players players) {
		listPlayer.add(players);

		return "Added Sucessfully...";

	}

	public List<Players> GetAllPlayers() {

		return listPlayer;
	}

	public Players GetPlayerById(int id) {

		for (Players players : listPlayer) {
			if (players.getPlayerId() == id) {
				return players;
			}
		}
		return null;

	}

	

	public int PlayerUpdate(Players players, int id) {

	   int status=DeletePlayer(id);
		if (status==1) {
			listPlayer.add(players);
			return 1;
		}
		return 0;

	}

	public int DeletePlayer(int id) {
		for (Players players : listPlayer) {
			if(players.getPlayerId()==id)
			{
				listPlayer.remove(players);
				return 1;
				
			}
		}
		 return 0;
		 
	}

}
