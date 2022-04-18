package sladeapi.club.skilled.slade.api.claim;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import sladeapi.club.skilled.slade.api.ability.Ability;
import sladeapi.club.skilled.slade.utils.Cuboid;

import java.util.*;

/**
 * Created by Mansitoh
 * Project: Slade Date: 27/16/2022 @ 16:06
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
@Getter
@Setter
public class Claim {

    @Getter
    public static List<Claim> claimList = new ArrayList<>();
    public static HashMap<UUID, String> claimmap = new HashMap<>();

    private final String key;
    private final Cuboid cuboid;
    private List<Ability> abilityWhitelist = new ArrayList<>();

    public Claim(String key, Cuboid cuboid, List<Ability> allowed) {
        this.key = key;
        this.cuboid = cuboid;
        this.abilityWhitelist = allowed;
    }

    public static boolean canUseAbility(Ability ability, Location loc) {
        return true;
    }

    public static boolean exist(String claimname) {
        return false;
    }

    public static Claim getByLocation(Location l) {
        return null;
    }


    public boolean canUse(Ability ability, Location loc) {
        return true;
    }


    public static void loadClaims() {
    }

    public static boolean hasWand(Player p) {
        return false;
    }

    public static boolean isWand(ItemStack item) {
        return false;
    }

    public static ItemStack getWand() {
        return null;
    }

    public void remove(Ability ability) {
    }
}
