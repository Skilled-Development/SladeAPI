package sladeapi.club.skilled.slade.api.cooldown;

import org.bukkit.entity.Player;

import java.util.concurrent.TimeUnit;

public class GlobalCooldownManager {


    public boolean isGlobalCooldown() {
        return false;
    }

    public String getGlobalCooldownName() {
        return "None";
    }

    public void setGlobalCooldown(Player player) {

    }

    public boolean hasGlobalCooldown(Player player) {
        return false;
    }

    public String getGlobalCooldown(Player player) {
        return "None";
    }


}
