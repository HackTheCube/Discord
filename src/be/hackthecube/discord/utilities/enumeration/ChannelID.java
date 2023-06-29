package be.hackthecube.discord.utilities.enumeration;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.NewsChannel;
import net.dv8tion.jda.api.entities.channel.concrete.StageChannel;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.entities.channel.concrete.VoiceChannel;

public enum ChannelID {

	HOME("1120764974265016392"),
	RULES("1120765246798299266"),
	
	TICKET("1120765246798299266"),
	
	INFORMATION_ANNOUNCEMENT("1120766612182671441"),
	INFORMATION_NEWS("1120767463215353897"),
	INFORMATION_GIVEAWAY("1120767912790200440"),
	INFORMATION_PARTERSHIP("1120794913697697912"),
	
	INVOLVEMENT_POLL("1120768672345116853"),
	INVOLVEMENT_SUGGEST("1120771437922357328"),
	INVOLVEMENT_BOOST("1120775189777625179"),
	
	COMMUNITY_GLOBAL("1120768672345116853"),
	COMMUNITY_MULTIMEDIA("1120770661405704212"),
	COMMUNITY_COMMAND("1120770798412632186"),
	
	BETA_GLOBAL("1123176585692975114"),
	BETA_PRIVATE("1123176000252022884"),
	
	TEAM_GLOBAL("1120771706521387068"),
	TEAM_ANNOUNCEMENT("1120771736540033044"),
	TEAM_TASK("1121629795000778792"),
	TEAM_GENERAL("1120810438754586674"),
	TEAM_MEETING("1120810691922771998"),
	
	VOCAL_CREATE("1120770450088271992");
	
		// -------------------- \\
	
	private String channelID;
	ChannelID(String channelID) { this.channelID = channelID; }
	
		// -------------------- \\
	
	public TextChannel getTextChannel(Guild guild) { return guild.getTextChannelById(channelID); }
	public VoiceChannel getVoiceChannel(Guild guild) { return guild.getVoiceChannelById(channelID); }
	public NewsChannel getNewsChannel(Guild guild) { return guild.getNewsChannelById(channelID); }
	public StageChannel getRulesChannel(Guild guild) { return guild.getStageChannelById(channelID); }
	
}
