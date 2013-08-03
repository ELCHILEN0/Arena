package com.TeamNovus.Arenas.Arena.Components;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<ArenaPlayer> players = new ArrayList<ArenaPlayer>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<ArenaPlayer> getPlayers() {
		return players;
	}
	
	public void addPlayer(ArenaPlayer p) {
		players.add(p);
	}
	
	public void removePlayer(ArenaPlayer p) {
		players.remove(p);
	}
}
