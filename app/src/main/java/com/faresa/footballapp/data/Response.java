package com.faresa.footballapp.data;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("teams")
	private List<TeamsItem> teams;

	public void setTeams(List<TeamsItem> teams){
		this.teams = teams;
	}

	public List<TeamsItem> getTeams(){
		return teams;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"teams = '" + teams + '\'' + 
			"}";
		}
}