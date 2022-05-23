package nl.pluglib.util;

import org.bukkit.ChatColor;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Color {
    public static String translate(String message) {
        Pattern pattern = Pattern.compile("#[a-fA-F0-9]{6}");
        Matcher matcher = pattern.matcher(message);

        while (matcher.find()) {
            String color = message.substring(matcher.start(), matcher.end());
            message = message.replace(color, ChatColor.valueOf(color) + "");
            matcher = pattern.matcher(message);
        }

        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static ItemStack[] armor(ItemStack[] armor, org.bukkit.Color color) {
        ItemStack[] items = new ItemStack[armor.length];
        for(int i = 0; i < armor.length; i++) {
            ItemStack item = armor[i];
            LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
            meta.setColor(color);
            item.setItemMeta(meta);
            items[i] = item;
        }
        return items;
    }

}
