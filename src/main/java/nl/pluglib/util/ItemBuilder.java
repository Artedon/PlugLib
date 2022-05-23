package nl.pluglib.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {

    private ItemStack item;

    public ItemBuilder(Material material, String displayName, String... lores) {
        item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(Color.translate(displayName));
        List<String> coloredLores = new ArrayList<>();
        for(String lore : lores) coloredLores.add(Color.translate(lore));
        meta.setLore(coloredLores);
        item.setItemMeta(meta);
    }

    public void setLore(String... lores) {
        List<String> coloredLores = new ArrayList<>();
        for(String lore : lores) coloredLores.add(Color.translate(lore));
        ItemMeta meta = item.getItemMeta();
        meta.setLore(coloredLores);
        item.setItemMeta(meta);
    }

    public ItemStack get() {
        return item;
    }
}
