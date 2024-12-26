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

import com.jbk.model.Teams;
import com.jbk.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("/api/teams/CreateTeam")
	public String AddTeams(@RequestBody Teams teams) {
		String msg = teamService.AddTeams(teams);

		return msg;
	}

	@GetMapping("/api/teams/GetAllTeams")
	public List<Teams> GetAllTeams() {
		List<Teams> allTeam = teamService.GetAllTeams();

		return allTeam;
	}

	@GetMapping("/api/teams")
	public Object GetTeamById(@RequestParam int id) {
		Teams TeamId = teamService.GetTeamById(id);
		if (TeamId != null) {
			return TeamId;
		} else {
			return "User Not Found";
		}

	}

	@DeleteMapping("/api/teams/{id}")
	public String DeleteTeam(@PathVariable int id) {
		String deleteTeam = teamService.DeleteTeam(id);

		return deleteTeam;

	}
	@PutMapping("/api/teams/{id}")
    public String UpdateTeamById(@RequestBody Teams teams,@PathVariable int id)
    {
    	String updateTeam = teamService. UpdateTeamById(teams,id);
    	return updateTeam;
    	
    }
}
