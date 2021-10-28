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
            player.sendMessage(ChatColor.RED + ">Dont cheat(dont be a dick)");
            player.sendMessage(ChatColor.RED + ">Dont Bully or verbally abuse a other member of the server" +
                    "(again pretty simple just dont be a dick)");
            player.sendMessage(ChatColor.RED + ">Dont make lag machines");

        }
        return true;
    }
}
