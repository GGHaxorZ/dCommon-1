package me.technopvp.common.commands;

import me.technopvp.common.dCommon;
import me.technopvp.common.utilities.StringUtils;
import me.technopvp.common.utilities.enums.Permissions;
import me.technopvp.common.utilities.enums.Permissions.Permission;
import me.technopvp.common.utilities.enums.Source;
import me.technopvp.common.utilities.enums.SourceType;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@Source(SourceType.PLAYER)
@Permissions(Permission.ANYONE)
public class Command_ranks extends CommonCommand {
	dCommon plugin = dCommon.instance;

	public boolean run(CommandSender sender, Command cmd, String[] args) {
		Player player = (Player)sender;
		player.sendMessage(Gray + "------ " + Red + Red + Bold + StringUtils.getServerName() + " Ranks " + Gray + "------");
		player.sendMessage(Blue + "- " + Gray + "All ranks are one time payments only.");
		player.sendMessage("                       �7Rank1: $x");
		player.sendMessage("                       �bRank2: $x");
		player.sendMessage("                       �aRank3: $x");
		player.sendMessage("                       �9Rank4: $xx");
		player.sendMessage("                       �6Rank5: $xx");
		player.sendMessage("                       �2Rank6: $xx");
		player.sendMessage("                       �1Rank7: $xxx ");
		player.sendMessage(Blue + "- " + Gray + "We only take payments by PayPal, to donate visit\n" + StringUtils.getDonationPage());
		player.sendMessage(Gray + "================================");
		return true;

}
}
