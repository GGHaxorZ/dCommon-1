package me.technopvp.common.api.fancymessage;

import static org.bukkit.ChatColor.AQUA;
import static org.bukkit.ChatColor.BOLD;
import static org.bukkit.ChatColor.DARK_RED;
import static org.bukkit.ChatColor.GOLD;
import static org.bukkit.ChatColor.GREEN;
import static org.bukkit.ChatColor.ITALIC;
import static org.bukkit.ChatColor.LIGHT_PURPLE;
import static org.bukkit.ChatColor.RED;
import static org.bukkit.ChatColor.UNDERLINE;
import static org.bukkit.ChatColor.YELLOW;

public final class FancyApiExample {
	
	public static void main(String[] args) {
		System.out.println(welcome("Orbixitron"));
		System.out.println(advertisement());
		System.out.println(gui("Starbux42", 413000));
	}

	static String welcome(String playername) {
		return new FancyMessage("Hello, ")
			.color(YELLOW)
		.then(playername)
			.color(LIGHT_PURPLE)
			.style(ITALIC, UNDERLINE)
		.then("!")
			.color(YELLOW)
			.style(ITALIC)
		.toJSONString();
	}
	
	static String advertisement() {
		return new FancyMessage("Visit ")
			.color(GREEN)
		.then("our website")
			.color(YELLOW)
			.style(UNDERLINE)
			.link("http://awesome-server.net")
			.tooltip("AwesomeServer Forums")
		.then(" to win ")
			.color(GREEN)
		.then("big prizes!")
			.color(AQUA)
			.style(BOLD)
			.tooltip("Terms and conditions may apply. Offer not valid in Sweden.")
		.toJSONString();
	}
	
	static String gui(String playername, int blocksEdited) {
		return new FancyMessage("Player ")
			.color(DARK_RED)
		.then(playername)
			.color(RED)
			.style(ITALIC)
		.then(" changed ").color(DARK_RED)
		.then(blocksEdited).color(AQUA)
		.then(" blocks. ").color(DARK_RED)
		.then("Roll back?")
			.color(GOLD)
			.style(UNDERLINE)
			.suggest("/rollenbacken " + playername)
			.tooltip("Be careful, this might undo legitimate edits!")
		.then(" ")
		.then("Ban?")
			.color(RED)
			.style(UNDERLINE)
			.suggest("/banhammer " + playername)
			.tooltip("Remember: only ban if you have photographic evidence of grief.")
		.toJSONString();
	}
	
}
