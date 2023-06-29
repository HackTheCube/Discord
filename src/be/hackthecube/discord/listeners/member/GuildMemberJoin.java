package be.hackthecube.discord.listeners.member;

import java.time.format.DateTimeFormatter;

import be.hackthecube.discord.utilities.Embed;
import be.hackthecube.discord.utilities.enumeration.ChannelID;
import be.hackthecube.discord.utilities.enumeration.EmoteID;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMemberJoin extends ListenerAdapter {

	public void onGuildMemberJoin(GuildMemberJoinEvent event) {
		ChannelID.HOME.getTextChannel(event.getGuild()).sendMessageEmbeds(
				new Embed()
					.setDescription(String.format(
							"%s Bienvenue à %s sur **HackTheCube** !",
							EmoteID.CHECK.getEmote(), event.getMember().getAsMention()
					))
				
					.addField(String.format("%s | **Nom d'utilisateur**", EmoteID.USER.getEmote()), String.format("`%s`", event.getUser().getName()), true)
					.addField(String.format("%s | **Identifiant**", EmoteID.HASHTAG.getEmote()), String.format("`%s`", event.getUser().getIdLong()), true)
					.addField(String.format("%s | **Robot**", EmoteID.BOT.getEmote()), (event.getUser().isBot() ? String.format("Oui %s", EmoteID.CHECK.getEmote()) : String.format("Non %s", EmoteID.CROSS.getEmote())), true)
					.addField(String.format("%s | **Date de création**", EmoteID.CLOCK.getEmote()), String.format("`%s`", event.getUser().getTimeCreated().format(DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss"))), false)
					.addField(String.format("%s | **Membre**", EmoteID.UP_VOTE.getEmote()), String.format("`#%s`", event.getGuild().getMemberCount()), true)
					
					.setThumbnail(event.getMember().getAvatarUrl())
					.build()
		).queue();
	}
	
}
