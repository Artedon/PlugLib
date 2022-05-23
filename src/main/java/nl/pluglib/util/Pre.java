package nl.pluglib.util;

import nl.pluglib.PlugLib;
import org.bukkit.entity.Player;

public class Pre {

    public static void send(Player player, String msg) {
        player.sendMessage(Color.translate(PlugLib.PRE + " " + msg));
    }

    public static boolean sendb(Player player, String msg) {
        player.sendMessage(Color.translate(PlugLib.PRE + " " + msg));
        return true;
    }

}
