package be.hackthecube.discord.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;

import org.bukkit.Bukkit;

import be.hackthecube.discord.utilities.annotation.Configuration;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class ConfigManager {

	@Configuration(path = "GLOBAL.PREFIX.PREFIX", color = true)
	private String prefix = "&5&lHackTheCube &8&l×";
	
	@Configuration(path = "GLOBAL.PREFIX.ERROR_PREFIX", color = true)
	private String errorPrefix = "&4&l(!)";
	
			// ---------- \\
	
	@Configuration(path = "DISCORD.TOKEN", color = false)
	private String token = "-";
	
	@Configuration(path = "DISCORD.STATUS", color = false)
	private String onlineStatus = "DO_NOT_DISTURB";
	
	@Configuration(path = "DISCORD.ACTIVITY.TYPE", color = false)
	private String activityType = "WATCHING";
	
	@Configuration(path = "DISCORD.ACTIVITY.VALUE", color = false)
	private String activityValue = "https://hackthecube.be/";
	
		// -------------------- \\
	
	public String replace(String value) {
		if(value.contains("{PREFIX}")) { value = value.replace("{PREFIX}", getPrefix(false)); }
		if(value.contains("{ERROR_PREFIX}")) { value = value.replace("{ERROR_PREFIX}", getErrorPrefix(false)); }
		if(value.contains("&")) { value = value.replace("&", "§"); }
		
		return value;
	}
	
	public String getTime() {
		return DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss").format(LocalDateTime.now());
	}
	
			// ---------- \\
	
	public String getPrefix(boolean withSpace) {
		return replace(prefix) + (withSpace ? " " : "");
	}
	
	public String getErrorPrefix(boolean withSpace) {
		return replace(errorPrefix) + (withSpace ? " " : "");
	}
	
			// ---------- \\
	
	public String getToken() {
		return token;
	}
	
	public OnlineStatus getOnlineStatus() {
		switch(onlineStatus) {
			case "ONLINE":
				return OnlineStatus.ONLINE;
				
			case "OFFLINE":
				return OnlineStatus.OFFLINE;
				
			case "DO_NOT_DISTURB":
				return OnlineStatus.DO_NOT_DISTURB;
				
			case "IDLE":
				return OnlineStatus.IDLE;
				
			case "INVISIBLE":
				return OnlineStatus.INVISIBLE;
				
			default:
				Bukkit.getLogger().log(Level.WARNING, String.format("The '%s' status does not exist !", onlineStatus));
				return OnlineStatus.ONLINE;
		}
	}
	
	public Activity getDiscordActivity() {
		switch(activityType) {
			case "PLAYING":
				return Activity.playing(activityValue);
				
			case "LISTENING":
				return Activity.listening(activityValue);
				
			case "WATCHING":
				return Activity.watching(activityValue);
				
			default:
				Bukkit.getLogger().log(Level.WARNING, String.format("The '%s' activity type does not exist !", activityType));
				return Activity.watching(activityValue);
		}
	}
	
}
