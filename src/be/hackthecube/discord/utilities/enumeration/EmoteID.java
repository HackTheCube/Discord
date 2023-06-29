package be.hackthecube.discord.utilities.enumeration;

import net.dv8tion.jda.api.entities.emoji.Emoji;
import net.dv8tion.jda.api.entities.emoji.EmojiUnion;

public enum EmoteID {
	
	CLOCK("<:clock:1123822454280822915>"),
	GUIDELINES("<:guidelines:1123825475454767136>"),
	
	USER("<:user:1123822330456580096>"),
	HASHTAG("<:hashtag:1123822195320291388>"),
	BOT("<:bot:1123825830682959953>"),
	WRENCH("<:wrench:1123822550741418094>"),
	
	WEBSITE("<:website:1123820367698481184>"),
	TWITTER("<:twitter:1123817458084622416>"),
	
	BELL("<:bell:1123825784595959888>"),
	CHECK("<:check:1123825690991669268>"),
	CROSS("<:cross:1123825737611358238>"),
	WARNING("<:warning:1123815804664807464>"),
	
	UP_VOTE("<:up_vote:1123816823499014275>"),
	DOWN_VOTE("<:down_vote:1123816749113036890>"),
	
	ARROW("<a:arrow:1123816680603262978>");
	
		// -------------------- \\
	
	private String emoteID;
	EmoteID(String emoteID) { this.emoteID = emoteID; }
	
		// -------------------- \\
	
	public EmojiUnion getEmote() {
		return Emoji.fromFormatted(emoteID);
	}
	
}
