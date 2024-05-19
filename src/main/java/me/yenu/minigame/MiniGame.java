package me.yenu.minigame;

import me.yenu.minigame.Arrow.ArrowEvent;
import me.yenu.minigame.Block.BlockRemove;
import me.yenu.minigame.Block.BlockSpawn;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiniGame extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getCommandMap().register("target", new BlockSpawn("게임시작"));
        Bukkit.getCommandMap().register("remove", new BlockRemove("지우기"));
        Bukkit.getPluginManager().registerEvents(new ArrowEvent(), this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
