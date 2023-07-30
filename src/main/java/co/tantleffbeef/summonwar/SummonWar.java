package co.tantleffbeef.summonwar;

import org.bukkit.plugin.java.JavaPlugin;

public final class SummonWar extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("startgame").setExecutor(new SummonCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}