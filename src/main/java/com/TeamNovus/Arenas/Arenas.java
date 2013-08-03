package com.TeamNovus.Arenas;

import org.bukkit.plugin.java.JavaPlugin;

import com.TeamNovus.Arenas.Collections.ArenaCollection;
import com.TeamNovus.Arenas.Commands.BaseCommandExecutor;
import com.TeamNovus.Arenas.Commands.CommandManager;
import com.TeamNovus.Arenas.Commands.Common.DefaultCommands;
import com.TeamNovus.Arenas.Commands.Common.PluginCommands;

public class Arenas extends JavaPlugin {
	public static ArenaCollection i = new ArenaCollection();
	private static Arenas plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("arena").setExecutor(new BaseCommandExecutor());
		
		CommandManager.register(DefaultCommands.class);
		CommandManager.register(PluginCommands.class);
	}
	
	public void onDisable() {
		plugin = null;
	}
	
	public static Arenas getPlugin() {
		return plugin;
	}
}
