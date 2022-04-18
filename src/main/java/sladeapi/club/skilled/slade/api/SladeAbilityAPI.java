package sladeapi.club.skilled.slade.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import sladeapi.club.skilled.slade.api.ability.Ability;
import sladeapi.club.skilled.slade.api.claim.Claim;
import sladeapi.club.skilled.slade.api.cooldown.GlobalCooldownManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SladeAbilityAPI  {

    /**
     * Gets all the abilities that are currently active on the server
     * @param player
     * @return
     */
    public List<Ability> getAbilityActive(Player player) {
        return new ArrayList<>();
    }

    /**
     * Gets a GlobalCooldownManager
     * @return
     */
    public GlobalCooldownManager getGlobalCooldown() {
        return null;
    }

    /**
     * Checks if a specific ability is active on that location
     * @param ability
     * @param loc
     * @return
     */
    public boolean canUseOnLocation(Ability ability, Location loc){
        return true;
    }

    /**
     * Gets all claims
     * @return
     */
    public List<Claim> getClaimList(){
        //TODO: Implement
        return new ArrayList<>();
    }

    /**
     * Add Ability to Claim
     * @param ability
     * @param claim
     */
    public void addAbilityToClaim(Ability ability,Claim claim){
    }

    /**
     * Remove Ability from Claim
     * @param ability
     * @param claim
     */
    public void removeAbilityToClaim(Ability ability,Claim claim){
    }
}
