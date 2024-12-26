package com.jbk.model;


public class Match {

	 private int matchId;
	 private String team1;
	  private String team2;
	  private String date;
	  private String venue;
	   private String result;
	   
	   public Match() {
		// TODO Auto-generated constructor stub
	}

	public Match(int matchId, String team1, String team2, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", date=" + date + ", venue="
				+ venue + ", result=" + result + "]";
	}
	
}
