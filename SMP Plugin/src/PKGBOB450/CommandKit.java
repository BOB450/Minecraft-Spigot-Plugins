package PKGBOB450;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandKit implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // Here we need to give items to our player
            player.sendMessage(ChatColor.BLACK + "SERVER INFO");
            player.sendMessage(ChatColor.GOLD + "ON our server the goal is to preserve the vanilla " +
                    "experience without sacrificing competitiveness and a functioning economy");
            player.sendMessage(ChatColor.LIGHT_PURPLE + "We achieve this by implementing a few plugins and " +
                    "rules(FOR RULES type /rules) The plugins we use are worldgurd to allow players to claim land" +
                    "to stop other players from stealing items or grefing builds. we also use shopkeepers witch allows" +
                    "players to set up shops so they can sell items to other players.");

        }
        return true;
    }
}
