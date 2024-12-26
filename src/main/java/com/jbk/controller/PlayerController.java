package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.model.Players;
import com.jbk.service.PlayerService;

@RestController
public class PlayerController {
	@Autowired
	PlayerService playerService;

	@PostMapping("/api/Players/AddPlayers")
	public String AddPlayers(@RequestBody Players players) {
		String AddPlayer = playerService.AddPlayers(players);
		return AddPlayer;
	}

	@GetMapping("/api/Players/")
	public List<Players> GetAllPlayers() {
		List<Players> getAllPlayers = playerService.GetAllPlayers();
		return getAllPlayers;
	}

	@GetMapping("/api/Players")
	public Object GetPlayerById(@RequestParam int id) {
		Players getPlayerById = playerService.GetPlayerById(id);
		if (getPlayerById != null) {
			return getPlayerById;
		}
		else {
		return "User not Found";
		}
	}
	@DeleteMapping("/api/Players/{id}")
	public String DeletePlayer(@PathVariable int id) {
		 String status = playerService.DeletePlayer(id);
		 
		return status;
	}
	
	 @PutMapping("/api/Players/{id}")
		public String PlayerUpdate(@RequestBody Players players, @PathVariable int id)
	 {
		
		 String status = playerService.PlayerUpdate(players,id);
		 return status;
	 }
}
