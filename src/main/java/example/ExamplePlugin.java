package example;

import club.skilled.slade.api.SladeAbilityAPI;
import club.skilled.slade.api.ability.Ability;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

/**
 * Created by Mansitoh
 * Project: SladeAPI Date: 18/10/2022 @ 10:52
 * Twitter: @Mansitoh_PY Github: https://github.com/Mansitoh
 * Discord: https://discord.link/Skilled
 * CEO: Skilled | Development
 */
@Getter
public class ExamplePlugin extends JavaPlugin {

    public SladeAbilityAPI sladeAbilityAPI;

    public static ExamplePlugin get(){
        return getPlugin(ExamplePlugin.class);
    }

    @Override
    public void onEnable() {
        sladeAbilityAPI = new SladeAbilityAPI();
    }

    public void exampleToAddOnScoreboard(Player p){
        ArrayList<String> scoreboard = new ArrayList<>();
        for(Ability ability : ExamplePlugin.get().getSladeAbilityAPI().getAbilityActive(p)){
            scoreboard.add(ability.getName()+" : "+ability.getCooldown(p));
        }
    }

}
