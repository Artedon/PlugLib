package nl.pluglib.util;

import org.bukkit.inventory.Inventory;

import java.util.List;

public class InventoryBuilder {

    public static Inventory create(Inventory inventory, List<GUIItem> guiItemList) {
        for(GUIItem item : guiItemList) {
            inventory.setItem(item.getSlot(), item.getItem());
        }
        return inventory;
    }

}
