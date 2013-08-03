package com.TeamNovus.Arenas.Arena.Components;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.TeamNovus.Arenas.Arenas;
import com.TeamNovus.Arenas.Arena.Arena;

public class ArenaPlayer {
	private String name;
	
	public ArenaPlayer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Arena getArena() {
		for(Arena arena : Arenas.i.getArenas()) {
			for(Team team : arena.getTeams()) {
				for(ArenaPlayer p : team.getPlayers()) {
					if(p.getName().equalsIgnoreCase(name)) {
						return arena;
					}
				}
			}
		}
		
		return null;
	}
	
	public Team getTeam() {
		for(Arena arena : Arenas.i.getArenas()) {
			for(Team team : arena.getTeams()) {
				for(ArenaPlayer p : team.getPlayers()) {
					if(p.getName().equalsIgnoreCase(name)) {
						return team;
					}
				}
			}
		}
		
		return null;
	}
	
	public Player getPlayer() {
		return Bukkit.getPlayerExact(name);
	}
	
	public static boolean isInArena(String n) {
		for(Arena arena : Arenas.i.getArenas()) {
			for(Team team : arena.getTeams()) {
				for(ArenaPlayer p : team.getPlayers()) {
					if(p.getName().equalsIgnoreCase(n)) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	public static ArenaPlayer getPlayer(String n) {
		for(Arena arena : Arenas.i.getArenas()) {
			for(Team team : arena.getTeams()) {
				for(ArenaPlayer p : team.getPlayers()) {
					if(p.getName().equalsIgnoreCase(n)) {
						return p;
					}
				}
			}
		}
		
		return null;
	}
	
	public static ArenaPlayer getPlayerExact(String n) {
		for(Arena arena : Arenas.i.getArenas()) {
			for(Team team : arena.getTeams()) {
				for(ArenaPlayer p : team.getPlayers()) {
					if(p.getName().equals(n)) {
						return p;
					}
				}
			}
		}
		
		return null;
	}

}
