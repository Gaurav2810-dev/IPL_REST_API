package com.jbk.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jbk.model.Teams;

@Repository
public class TeamDao {
	List<Teams> Teamlist = new ArrayList<Teams>();
	// to add manual data

	public TeamDao() {
		Teamlist.add(new Teams(1, "Mumbai Indians", "Mumbai", "Sachin Tendulkar"));
		Teamlist.add(new Teams(2, "RCB", "Banglore", "Virat "));

	}

	public String AddTeams(Teams teams) {
		Teamlist.add(teams);

		return "added sucessfully...";
	}

	public List<Teams> GetAllTeams() {

		return Teamlist;
	}

	public Teams GetTeamById(int id) {

		for (Teams teams : Teamlist) {

			if (teams.getTeamId() == id) {
				return teams;

			}
		}
		return null;
	}

	public String DeleteTeam(int id) {
		for (Teams teams : Teamlist) {
			if (teams.getTeamId() == id) {

				Teamlist.remove(teams);

				return " Team Deleted";

			}
		}

		return "Team Not Found";

	}

	public String UpdateTeamById(Teams teams, int id) {
		
        String deleteTeam = DeleteTeam(id);
        if(deleteTeam!=null)
        {
        	Teamlist.add(teams);
        	
        	return"Team Updated";
        	
        }
		return "Team not found";
		

	}

}
