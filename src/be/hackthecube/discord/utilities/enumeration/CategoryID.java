package be.hackthecube.discord.utilities.enumeration;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.channel.concrete.Category;

public enum CategoryID {

	SUPPORT("1123804251370573874"),
	INVOLVEMENT("1120771302412791828"),
	COMMUNITY("1120765875780333638"),
	BETA("1123174716774043768"),
	TEAM("1120765979618717776"),
	VOCAL("1120766042910769193");
	
		// -------------------- \\
	
	private String categoryID;
	CategoryID(String categoryID) { this.categoryID = categoryID; }
	
		// -------------------- \\
	
	public Category getCategory(Guild guild) {
		return guild.getCategoryById(categoryID);
	}
	
}
