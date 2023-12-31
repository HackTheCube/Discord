package be.hackthecube.discord.utilities.enumeration;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Role;

public enum RoleID {

	SYSTEM("1120790547418849440"),
	
	SEPARATOR_EIGHT("1120790519698702487"),
	
	ADMINISTRATOR("1120790548526153821"),
	MANAGER("1120790550719758447"),
	
	SEPARATOR_SEVEN("1120790534429098064"),
	
	MODERATOR("1120790551994843336"),
	HELPER("1120790553227964548"),
	
	SEPARATOR_SIX("1120790535309893694"),
	
	DEVELOPER("1120790555358666973"),
	GRAPHIC_DESIGNER("1120790559792037958"),
	COMMUNITY_MANAGER("1120790572093943879"),
	
	SEPARATOR_FIVE("1120790536761127002"),
	
	PARTNER("1120790557158015018"),
	DONOR("1120790558546350242"),
	
	SEPARATOR_FOUR("1120790537969094757"),
	
	HONOR_MEMBER("1121690681174396999"),
	BETA_TESTER("1123174795270426734"),
	
	SEPARATOR_THREE("1123174842607337523"),
	
	RECRUITMENT("1120790569740927117"),
	BOOSTER("1122968567911034962"),
	MEMBER("1120790561071304856"),
	
	SEPARATOR_TWO("1120790542444408864"),
	
	NOTIFICATION_ANNOUNCEMENT("1120790562312835115"),
	NOTIFICATION_RECRUITMENT("1120790570948890684"),
	NOTIFICATION_NEWS("1120790566637142108"),
	NOTIFICATION_GIVEAWAY("1120790563625640037"),
	NOTIFICATION_POLL("1120790565693431969"),
	NOTIFICATION_PARTNERSHIP("1120795345287393360"),
	
	SEPARATOR_ONE("1120790543870459915");
	
		// -------------------- \\
	
	private String roleID;
	RoleID(String roleID) { this.roleID = roleID; }
	
		// -------------------- \\
	
	public Role getRole(Guild guild) {
		return guild.getRoleById(roleID);
	}
	
}
