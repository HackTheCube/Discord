package be.hackthecube.discord.utilities;

import java.awt.Color;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;

public class Embed {

	private EmbedBuilder embedBuilder;
	
		// -------------------- \\
	
	public Embed() {
		embedBuilder = new EmbedBuilder()
				.setColor(new Color(43, 45, 49));
	}
	
		// -------------------- \\
	
	public Embed setTitle(String title) {
		embedBuilder.setTitle(title);
		return this;
	}
	
	public Embed setDescription(String description) {
		embedBuilder.setDescription(description);
		return this;
	}
	
	public Embed addField(String title, String description, boolean inline) {
		embedBuilder.addField(title, description, inline);
		return this;
	}
	
	public Embed setThumbnail(String thumbnailURL) {
		embedBuilder.setThumbnail(thumbnailURL);
		return this;
	}
	
	public Embed setFooter(String footer) {
		embedBuilder.setFooter(footer);
		return this;
	}
	
		// -------------------- \\
	
	public MessageEmbed build() {
		return embedBuilder.build();
	}
	
}
