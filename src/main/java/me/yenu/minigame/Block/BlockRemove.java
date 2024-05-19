package me.yenu.minigame.Block;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BlockRemove extends BukkitCommand {

    public BlockRemove(@NotNull String name) {
        super(name);
    }

    @Override
    public boolean execute(@NotNull CommandSender commandSender, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player player) {
            Location location = player.getLocation().add(0, 10, 0); // 플레이어 기준 과녁 생성
            Location location1 = player.getLocation().add(1, 1 ,0); // 플레이어 기준 과녁 생성되는 방향 플레이어 앞 울타리 생성
            player.getInventory().clear();

            TargetRemove(location); // 과녁 생성 코드 불러오기
            FenceRemove(location1);


            return true;
        }
        return false;
    }

    public void TargetRemove(Location location) {
        World world = location.getWorld(); // 블록 생성할 월드 인지


        for (int z = -3; z <= 3; z++) { // 과녁이 생성될 z 좌표 -3부터 3과 같거나 이하일 때 까지
            for (int y = -3; y <= 3; y++) { // 과녁이 생성될 y 좌표
                world.getBlockAt(location.clone().add(20, y, z)).setType(Material.AIR);
            }
        }

    }

    private void FenceRemove(Location location) { // 1칸 앞에 울타리 생성 20칸이하가 되지않게 하는 것
        World world = location.getWorld();

        for (int z = -3; z <= 3; z++) {
            world.getBlockAt(location.clone().add(0, 0, z)).setType(Material.AIR);
        }
    }
}
