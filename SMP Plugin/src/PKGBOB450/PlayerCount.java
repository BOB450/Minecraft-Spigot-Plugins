package PKGBOB450;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerCount  implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            int i = 0;
            i =  Bukkit.getOnlinePlayers().size();
            // Here we need to give items to our player
            if( i > 1) {
                player.sendMessage(ChatColor.GREEN + "There are " + i + " Online players");
            }
            else
            {
                player.sendMessage(ChatColor.GREEN + "There is " + i + " Online player");
            }

        }
        return true;
    }

}
