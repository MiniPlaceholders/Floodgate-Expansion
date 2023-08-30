package io.github.miniplaceholders.expansion.floodgate.paper;

import io.github.miniplaceholders.expansion.floodgate.common.CommonExpansion;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PaperPlugin extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getSLF4JLogger().info("Starting Floodgate Expansion for Paper");

        CommonExpansion.builder()
                .filter(Player.class)
                .build()
                .register();
    }
}
