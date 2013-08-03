package com.TeamNovus.Arenas.Arena;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Location;

import com.TeamNovus.Arenas.Arena.Components.Rule;
import com.TeamNovus.Arenas.Arena.Components.Team;

public class Arena {
	private String name;
	private HashMap<String, Location> locations = new HashMap<String, Location>();
	private ArrayList<Rule> rules = new ArrayList<Rule>();
	private ArrayList<Team> teams = new ArrayList<Team>();
	
	public Arena(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Location getLocation(String s) {
		return locations.get(s);
	}
	
	public void setLocation(String s, Location l) {
		locations.put(s, l);
	}
	
	public void removeLocation(String s) {
		locations.remove(s);
	}
	
	public ArrayList<Rule> getRules() {
		return rules;
	}
	
	public ArrayList<Team> getTeams() {
		return teams;
	}

}
