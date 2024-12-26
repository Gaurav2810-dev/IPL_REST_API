package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.model.Match;
import com.jbk.model.Players;

@Repository
public class MatchDao {
	List<Match> listMatch = new ArrayList<Match>();
	public MatchDao() {
	listMatch.add(new Match(1, "Mumbai", "Chennai", "2024-05-01", "Wankhade Stadium", "Mumbai won"));
	listMatch.add(new Match(2, "Kolkatta", "Chennai", "2024-06-01", "Pune Stadium", "Chennai won"));
	}
	public String AddMatch(Match match) {
		listMatch.add(match);
		if (listMatch != null) {
			return "added Sucessfully...";
		}
		return null;

	}

	public List<Match> GetAllMatches() {

		return listMatch;

	}

	public Match GetMatchById(int id) {
		for (Match match : listMatch) {
			if (match.getMatchId() == id) {
				
				return match;
			}
		}
		return null;
		


	}
	public String DeleteMatch(int id) {

     for (Match match : listMatch) {
		if(match.getMatchId()==id)
		{
			listMatch.remove(match);
			 return"Match Deleted...";
		}
	}
		return "Match Not Found";
		
		
	}
	public String UpdateMatch(Match match, int id) {
		String deleteMatch = DeleteMatch(id);
		if(deleteMatch!=null)
		{
			listMatch.add(match);
			return"Team updated";
			
		}
		return "Team Not Found";
		
		
	}

}
