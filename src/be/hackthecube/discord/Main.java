package be.hackthecube.discord;

import org.bukkit.plugin.java.JavaPlugin;

import be.hackthecube.discord.listeners.member.GuildMemberJoin;
import be.hackthecube.discord.listeners.member.GuildMemberRemove;
import be.hackthecube.discord.utilities.ConfigManager;
import be.hackthecube.discord.utilities.annotation.Annotation;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main extends JavaPlugin {

	private static Main instance;
	private JDA discordAPI;
	
	private ConfigManager configManager;
	
		// -------------------- \\
	
	@Override
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
				.enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES, GatewayIntent.MESSAGE_CONTENT)
				.addEventListeners(
						new GuildMemberJoin(),
						new GuildMemberRemove()
				)
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
