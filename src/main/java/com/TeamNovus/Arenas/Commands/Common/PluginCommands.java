package com.TeamNovus.Arenas.Commands.Common;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.TeamNovus.Arenas.Arenas;
import com.TeamNovus.Arenas.Permission;
import com.TeamNovus.Arenas.Arena.Arena;
import com.TeamNovus.Arenas.Commands.BaseCommand;

public class PluginCommands {
	
	@BaseCommand(aliases = "create", desc = "Create an arena", permission = Permission.NONE, usage = "<Arena>", min = 1, max = 1)
	public void onCreateCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		String name = args[0];
		
		if(Arenas.i.getArenaExact(name) != null) {
			sender.sendMessage(ChatColor.RED + "This arena already exists!");
			return;
		}
		
		Arena arena = new Arena(name);
		Arenas.i.attach(arena);
		
		sender.sendMessage(ChatColor.YELLOW + name + ChatColor.GREEN + " has been created!");
	}
	
	@BaseCommand(aliases = { "goto", "gt" }, desc = "Go to a location in an arena", permission = Permission.NONE, usage = "<Arena> <LocationName>", min = 2, max = 2, console = false)
	public void goToCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		String name = args[0];
		
		if(Arenas.i.getArena(name) == null) {
			sender.sendMessage(ChatColor.RED + "This arena does not exist!");
			return;
		}
		
		Arena arena = Arenas.i.getArena(name);
		((Player) sender).teleport(arena.getLocation(args[1]));
		sender.sendMessage(ChatColor.GREEN + "Location: " + ChatColor.YELLOW + args[1]);
	}
	
	@BaseCommand(aliases = { "setlocation", "sl" }, desc = "Set a location in an arena", permission = Permission.NONE, usage = "<Arena> <LocationName>", min = 2, max = 2, console = false)
	public void onSetLocationCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		String name = args[0];
		
		if(Arenas.i.getArena(name) == null) {
			sender.sendMessage(ChatColor.RED + "This arena does not exist!");
			return;
		}
		
		Arena arena = Arenas.i.getArena(name);
		
		Location loc = ((Player) sender).getLocation();
		arena.setLocation(args[1], loc);
		sender.sendMessage(ChatColor.YELLOW + args[1] + ChatColor.GREEN + " has been set at " + ChatColor.YELLOW + "X: " + loc.getBlockX() + ", Y: " + loc.getBlockY() + ", Z: " + loc.getBlockZ() + ChatColor.GREEN + "!");
	}
	
}
