package nl.pluglib.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GUIItem {
    private int slot;
    private ItemStack item;

    public GUIItem(int slot, Material material, int amount, boolean glowing, String name, String... lores) {
        this.slot = slot;
        ItemStack item = new ItemStack(material, amount);
        ItemMeta meta = item.getItemMeta();
        if(glowing) {
            item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 1);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        }
        meta.setDisplayName(Color.translate(name));
        List<String> coloredLores = new ArrayList<>();
        for(String lore : lores) coloredLores.add(Color.translate(lore));
        meta.setLore(coloredLores);
        item.setItemMeta(meta);

        this.item = item;
    }

    public GUIItem(int slot, Material material, int amount, String name, String... lores) {
        this(slot, material, amount, false, name, lores);
    }

    public GUIItem(int slot, Material material, boolean glowing, String name, String... lores) {
        this(slot, material, 1, glowing, name, lores);
    }

    public GUIItem(int slot, Material material, String name, String... lores) {
        this(slot, material, 1, false, name, lores);
    }

    public GUIItem(int slot, ItemStack playerHead, String name, String... lores) {
        this.slot = slot;

        ItemStack item = playerHead;
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Color.translate(name));
        List<String> coloredLores = new ArrayList<>();
        for(String lore : lores) coloredLores.add(Color.translate(lore));
        meta.setLore(coloredLores);
        item.setItemMeta(meta);

        this.item = item;
    }

    public GUIItem(int slot, ItemStack item) {
        this.slot = slot;
        this.item = item;
    }

    public int getSlot() {
        return slot;
    }

    public ItemStack getItem() {
        return item;
    }
}

