package club.skilled.slade.api.ability;

import club.skilled.slade.api.claim.Claim;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.IllegalPluginAccessException;
import org.bukkit.util.FileUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mansitoh
 * Project: SladeAPI Date: 18/10/2022 @ 10:30
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
@Getter
@Setter
public abstract class Ability implements Listener {


    public String getName() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean hasCooldown(Player player) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public void setCooldown(Player player, long time) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public String getCooldown(Player player) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnSpawn() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnKoth() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnCitadel() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnConquest() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnOverworld() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnNether() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnEnd() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public void setCanUse(boolean b,String s){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean isActivatedToWorksOnRegions() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean isAbility(Player player, ItemStack itemStack) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean isAbility(ItemStack itemStack){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean canUseOnClaim(Location loc) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean checkIfCan(Player user, Location l) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public void giveCooldown(Player player){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    public boolean isPermanent(){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }
}
