package be.hackthecube.discord.listeners.member;

import be.hackthecube.discord.utilities.Embed;
import be.hackthecube.discord.utilities.enumeration.ChannelID;
import be.hackthecube.discord.utilities.enumeration.EmoteID;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class GuildMemberRemove extends ListenerAdapter {
	
	@Override
	public void onGuildMemberRemove(GuildMemberRemoveEvent event) {
		ChannelID.HOME.getTextChannel(event.getGuild()).sendMessageEmbeds(
				new Embed()
					.setDescription(String.format("%s A bientôt %s sur **HackTheCube** !", EmoteID.CROSS.getEmote(), event.getMember().getAsMention()))
					.addField(String.format("%s | **Membre**", EmoteID.DOWN_VOTE.getEmote()), String.format("`#%s`", event.getGuild().getMemberCount()), true)
					
					.build()
		).queue();
	}
	
}
