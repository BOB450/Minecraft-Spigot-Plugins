package PKGBOB450;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("THIS PLUGin HAS BEEN ENABLED");
        this.getCommand("helpsmp").setExecutor(new CommandKit());
        this.getCommand("heal").setExecutor(new HealC());
        super.onEnable();

    }

}
