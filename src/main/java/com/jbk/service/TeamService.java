package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.TeamDao;
import com.jbk.model.Teams;

@Service
public class TeamService {
	@Autowired
	private TeamDao teamDao;

	public String AddTeams(Teams teams) {

		String msg = teamDao.AddTeams(teams);
		return msg;
	}

	public List<Teams> GetAllTeams() {
		List<Teams> allTeam = teamDao.GetAllTeams();
		return allTeam;
	}

	public Teams GetTeamById(int id) {
		Teams TeamId = teamDao.GetTeamById(id);
		return TeamId;

	}

	public String DeleteTeam(int id) {
		String deleteTeam = teamDao.DeleteTeam(id);

		return deleteTeam;

	}

	public String UpdateTeamById(Teams teams, int id) {

		String updateTeam = teamDao.UpdateTeamById(teams, id);

		return updateTeam;

	}

}
