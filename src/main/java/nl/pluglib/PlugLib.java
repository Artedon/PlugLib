package nl.pluglib;

import nl.pluglib.commands.FetchCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlugLib extends JavaPlugin {

    public static final String PRE = "&7&l[&2PlugLib&7&l]";

    @Override
    public void onEnable() {
        // Plugin startup logic

        // listeners

        // commands
        getCommand("fetch").setExecutor(new FetchCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public boolean playerOnly() {
        getLogger().warning("Player only command");
        return true;
    }
}
