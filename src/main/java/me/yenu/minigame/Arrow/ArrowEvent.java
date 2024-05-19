package me.yenu.minigame.Arrow;

import io.papermc.paper.math.BlockPosition;

import me.yenu.minigame.Block.BlockRemove;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import static me.yenu.minigame.Arrow.ItemManger.*;


public class ArrowEvent implements Listener {

    private ArrowEffect arrowEffect;

    public ArrowEvent(ArrowEffect arrowEffect) {
        this.arrowEffect = arrowEffect;
    }

    public ArrowEvent() {
        this.arrowEffect = new ArrowEffect();
    }



    @EventHandler
    public void HitBlock(ProjectileHitEvent event) {

        if (event.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) event.getEntity();

            if (arrow.getShooter() instanceof Player) {
                Player player = (Player) arrow.getShooter();
                ItemStack handItem = player.getInventory().getItemInOffHand();
                Block block = event.getHitBlock();

                if (block != null && block.getType() == Material.TARGET) { // 맞힌 블럭 타입이 과녁이라면
                    Material material1 = block.getType();
                    Location location = block.getLocation();

                    if (event.getEntity() instanceof Arrow && handItem.isSimilar(arrow1)) {
                        player.sendMessage("1");
                        arrowEffect.Effect(block);
                        handItem.setAmount(handItem.getAmount() - 1);
//                    } else if (event.getEntity() instanceof SpectralArrow && handItem.isSimilar(arrow2)) {
//                        player.sendMessage("2");
//                        block(location.add(1, 0, 0));
//                        player.sendMessage("2.5");
//                        block(location.add(-1, 0, 0));
//                        arrowEffect.Effect(block);
//                        handItem.setAmount(handItem.getAmount() - 1);
//                    } else if (event.getEntity() instanceof TippedArrow && handItem.isSimilar(arrow3)) {
//                        player.sendMessage("3");
//                        block(location.add(0, 1,0));
//                        block(location.add(0,-1,0));
//                        arrowEffect.Effect(block);
//                        handItem.setAmount(handItem.getAmount() - 1);
//                    }


                }
            }
        }


    }
//    public void removeBlock(Location location) {
//        Block block = location.getBlock();
//        if (block.getType() != Material.AIR) {
//            block.setType(Material.AIR);
//        }
//    }


    }
}
