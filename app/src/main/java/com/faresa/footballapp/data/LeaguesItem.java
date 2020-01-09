package com.faresa.footballapp.data;

import com.google.gson.annotations.SerializedName;

public class LeaguesItem{

	@SerializedName("strLeagueAlternate")
	private String strLeagueAlternate;

	@SerializedName("strLeague")
	private String strLeague;

	@SerializedName("strSport")
	private String strSport;

	@SerializedName("idLeague")
	private String idLeague;

	public void setStrLeagueAlternate(String strLeagueAlternate){
		this.strLeagueAlternate = strLeagueAlternate;
	}

	public String getStrLeagueAlternate(){
		return strLeagueAlternate;
	}

	public void setStrLeague(String strLeague){
		this.strLeague = strLeague;
	}

	public String getStrLeague(){
		return strLeague;
	}

	public void setStrSport(String strSport){
		this.strSport = strSport;
	}

	public String getStrSport(){
		return strSport;
	}

	public void setIdLeague(String idLeague){
		this.idLeague = idLeague;
	}

	public String getIdLeague(){
		return idLeague;
	}

	@Override
 	public String toString(){
		return 
			"LeaguesItem{" + 
			"strLeagueAlternate = '" + strLeagueAlternate + '\'' + 
			",strLeague = '" + strLeague + '\'' + 
			",strSport = '" + strSport + '\'' + 
			",idLeague = '" + idLeague + '\'' + 
			"}";
		}
}