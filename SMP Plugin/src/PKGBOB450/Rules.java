package PKGBOB450;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rules implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Here we need to give items to our player
            player.sendMessage(ChatColor.BLACK + "SERVER RULES");
            player.sendMessage(ChatColor.YELLOW + ">Don't cheat(don't be a dick)");
            player.sendMessage(ChatColor.YELLOW + ">Don't Bully or verbally abuse a other member of the server" +
                    "(again pretty simple just don't be a dick)");
            player.sendMessage(ChatColor.YELLOW + ">Don't make lag machines");
            player.sendMessage(ChatColor.YELLOW + "> Don't Use any exploits like (duping breaking bedrock etc...)");

        }
        return true;
    }
}
