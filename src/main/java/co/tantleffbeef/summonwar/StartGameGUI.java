package co.tantleffbeef.summonwar;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class StartGameGUI implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent event) {
//        Player player = (Player) event.getWhoClicked();
//        if(event.getInventory().getSize() == 9 && event.getInventory().getLocation() == null) {
//            event.setCancelled(true);
//            int temp = event.getSlot();
//
//            if(temp == 2) {
//                // tell thing that player is on team Crimson
//                event.getInventory().getItem(2).addEnchantment(Enchantment.DURABILITY, 1);
//            } else if (temp == 4) {
//                // tell thing that player is not on team
//                player.closeInventory();
//            } else if (temp == 6) {
//                // tell thing that player is on team Warped
//                event.getInventory().getItem(2).addEnchantment(Enchantment.DURABILITY, 1);
//
//            }
//        }
    }

    @EventHandler
    public void OnClose(InventoryCloseEvent event) {
//        Player player = (Player) event.getPlayer();
//        if(event.getInventory().getType() == InventoryType.HOPPER && event.getInventory().getLocation() == null) {
//
//        }
    }

    //    private ItemStack makeItem(Material mat, String name, String... lore) {
//        ItemStack item = new ItemStack
//    }
}
