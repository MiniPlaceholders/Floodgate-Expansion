package io.github.miniplaceholders.expansion.floodgate.sponge;

import com.google.inject.Inject;
import io.github.miniplaceholders.expansion.floodgate.common.CommonExpansion;
import org.apache.logging.log4j.Logger;
import org.spongepowered.api.Server;
import org.spongepowered.api.entity.living.player.server.ServerPlayer;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.lifecycle.StartingEngineEvent;
import org.spongepowered.plugin.builtin.jvm.Plugin;

@Plugin("miniplaceholders-floodgate-expansion")
public class SpongePlugin {
    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(final StartingEngineEvent<Server> event) {
        logger.info("Starting Floodgate Expansion for Sponge");

        CommonExpansion.builder()
                .filter(ServerPlayer.class)
                .build()
                .register();
    }
}
