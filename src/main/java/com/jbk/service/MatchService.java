package com.jbk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.MatchDao;
import com.jbk.model.Match;
import com.jbk.model.Players;

@Service
public class MatchService {
	@Autowired
	private MatchDao matchDao;

	public String AddMatch(Match match) {
		String addMatch = matchDao.AddMatch(match);
		return addMatch;

	}

	public List<Match> GetAllMatches() {

		List<Match> getAllMatches = matchDao.GetAllMatches();

		return getAllMatches;

	}

	public Match GetMatchById(int id) {
		Match getMatchById = matchDao.GetMatchById(id);
		
		return getMatchById;

	}

	public String DeleteMatch(int id) {
		
		String deleteMatch = matchDao.DeleteMatch(id);
		
		return deleteMatch;
	}

	public String UpdateMatch(Match match, int id) {
		String updateMatch = matchDao.UpdateMatch(match ,id);
		return updateMatch;
	
		
	}

}
