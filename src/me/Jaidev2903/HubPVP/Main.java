package me.Jaidev2903.HubPVP;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	
	public void onEnable() {
		
		getConfig().addDefault("sword-slot", 0);
		saveConfig();
	}
	
	public void onDisable() {
		
	}
}
