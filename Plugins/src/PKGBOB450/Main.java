package PKGBOB450;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getLogger().info("THIS PLUGin HAS BEEN ENABLED");
        Bukkit.getPluginManager().registerEvents(this,this);
        this.getCommand("helpsmp").setExecutor(new CommandKit());
        this.getCommand("heal").setExecutor(new HealC());
        super.onEnable();

    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Player plr = event.getPlayer();
        event.setJoinMessage(ChatColor.AQUA + "Welcome to the server " + plr.getDisplayName() + " use the /helpsmp command to get more info " );
    return;
    }


}
