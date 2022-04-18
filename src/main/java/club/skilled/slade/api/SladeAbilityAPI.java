package club.skilled.slade.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import club.skilled.slade.api.ability.Ability;
import club.skilled.slade.api.claim.Claim;
import club.skilled.slade.api.cooldown.GlobalCooldownManager;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.ArrayList;
import java.util.List;

public final class SladeAbilityAPI  {

    /**
     * Gets all the abilities that are currently active on the server
     * @param player
     * @return
     */
    public List<Ability> getAbilityActive(Player player) {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    /**
     * Gets a GlobalCooldownManager
     * @return
     */
    public GlobalCooldownManager getGlobalCooldown() {
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    /**
     * Checks if a specific ability is active on that location
     * @param ability
     * @param loc
     * @return
     */
    public boolean canUseOnLocation(Ability ability, Location loc){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    /**
     * Gets all claims
     * @return
     */
    public List<Claim> getClaimList(){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    /**
     * Add Ability to Claim
     * @param ability
     * @param claim
     */
    public void addAbilityToClaim(Ability ability,Claim claim){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }

    /**
     * Remove Ability from Claim
     * @param ability
     * @param claim
     */
    public void removeAbilityToClaim(Ability ability,Claim claim){
        throw new IllegalPluginAccessException("SladeAPI is not registered");
    }
}
