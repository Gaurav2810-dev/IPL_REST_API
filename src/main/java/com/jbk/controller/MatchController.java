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

import com.jbk.model.Match;
import com.jbk.model.Players;
import com.jbk.service.MatchService;

@RestController
public class MatchController {
	@Autowired
	private MatchService matchService;

	@PostMapping("/api/Match/addMatch")
	public String AddMatch(@RequestBody Match match) {
		String addMatch = matchService.AddMatch(match);
		return addMatch;
	}
   
	@GetMapping("/api/Match/")
	public List<Match> GetAllMatches()
	{
		List<Match> getAllMatches = matchService.GetAllMatches();
		return getAllMatches;
		
	}
	
	@GetMapping("/api/Match")
	public Object GetMatchById(@RequestParam int id)
	{
		Match getMatchById = matchService.GetMatchById(id);
		if(getMatchById!=null)
		{
			return getMatchById;
			
		}
		return"Match Not Found";
	}
	@PutMapping("/api/Match/{id}")
	public String UpdateMatch(@RequestBody Match match, @PathVariable int id)
	{
		String updateMatch = matchService.UpdateMatch(match,id);
		
		return updateMatch;
		
	}
	@DeleteMapping("/api/Match")
	public String DeleteMatch(@RequestParam int id)
	{
		String deleteMatch = matchService.DeleteMatch(id);
		
		return deleteMatch;
		
	}
}
