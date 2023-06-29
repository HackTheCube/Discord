package be.hackthecube.discord;

import org.bukkit.plugin.java.JavaPlugin;

import be.hackthecube.discord.utilities.ConfigManager;
import be.hackthecube.discord.utilities.annotation.Annotation;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Main extends JavaPlugin {

	private static Main instance;
	private JDA discordAPI;
	
	private ConfigManager configManager;
	
		// -------------------- \\
	
	public void onEnable() {
		instance = this;
		configManager = new ConfigManager();
		
			// ---------- \\
		
		saveDefaultConfig();
		Annotation.loadClass(getConfig(), getConfigManager());
		
			// ---------- \\
		
		discordAPI = JDABuilder.createDefault(getConfigManager().getToken())
				.setStatus(getConfigManager().getOnlineStatus())
				.setActivity(getConfigManager().getDiscordActivity())
				.addEventListeners()
				.build();
	}
	
		// -------------------- \\
	
	public static Main getInstance() {
		return instance;
	}
	
	public JDA getDiscordAPI() {
		return discordAPI;
	}
	
	public ConfigManager getConfigManager() {
		return configManager;
	}
	
}
