package me.yenu.minigame.Arrow;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemManger {

    private static ItemStack Arrow(Material type, int amount, String s, String... args) {
        ItemStack stack = new ItemStack(type, amount);
        ItemMeta meta = stack.getItemMeta();
        meta.setDisplayName(s);
        meta.setLore(Arrays.asList(args));
        stack.setItemMeta(meta);
        return stack;
    }

    public static final ItemStack arrow1 = Arrow(Material.ARROW, 30,ChatColor.WHITE + "기본 화살", ChatColor.WHITE + "기본적인 화살");

    public static final ItemStack arrow2 = Arrow(Material.SPECTRAL_ARROW, 10,ChatColor.YELLOW + "좌우 화살", ChatColor.WHITE + "양 옆을 제거하는 화살");

    public static final ItemStack arrow3 = Arrow(Material.TIPPED_ARROW, 10, ChatColor.AQUA + "상하 화살", ChatColor.WHITE + "상하를 제거하는 화살");

    public static final ItemStack bow = Arrow(Material.BOW, 1, ChatColor.WHITE + "활", ChatColor.WHITE + "기본적인 활");
}
