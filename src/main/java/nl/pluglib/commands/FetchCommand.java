package nl.pluglib.commands;

import nl.pluglib.PlugLib;
import nl.pluglib.util.Pre;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FetchCommand implements CommandExecutor {

    private PlugLib plugLib;

    public FetchCommand(PlugLib plugLib) {
        this.plugLib = plugLib;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) return plugLib.playerOnly();

        Player player = (Player) sender;

        if(args.length < 1) return Pre.sendb(player, "&cYou need to specify a plugin");



        return true;
    }

}
