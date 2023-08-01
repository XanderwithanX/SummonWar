package co.tantleffbeef.summonwar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class SummonCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Don't do this with the console, please!");
            return true;
        }

        Player player = (Player) sender;
        Server server = player.getServer();

        ItemStack I1 = new ItemStack(Material.CRIMSON_STEM);
        I1.getItemMeta().addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ItemStack I2 = new ItemStack(Material.OBSIDIAN);
        ItemStack I3 = new ItemStack(Material.WARPED_STEM);
        I3.getItemMeta().addItemFlags(ItemFlag.HIDE_ENCHANTS);

        Inventory inv = Bukkit.createInventory(player, 9, ChatColor.DARK_BLUE + "Choose your team!");
        inv.setItem(2, I1);
        inv.setItem(4, I2);
        inv.setItem(6, I3);

        player.openInventory(inv);


        List<Player> players = new ArrayList<>();

        for(Player p : server.getOnlinePlayers()) {
            players.add(p);
        }
        return true;
    }

}
