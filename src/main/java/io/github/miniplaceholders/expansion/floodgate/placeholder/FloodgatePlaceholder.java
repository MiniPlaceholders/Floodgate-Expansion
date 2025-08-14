package io.github.miniplaceholders.expansion.floodgate.placeholder;

import io.github.miniplaceholders.api.resolver.AudienceTagResolver;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.identity.Identity;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public sealed interface FloodgatePlaceholder
        extends AudienceTagResolver<@NotNull Audience>
        permits ClientDevicePlaceholder,
                ClientLocalePlaceholder,
                ClientVersionPlaceholder,
                IsBedrockPlayerPlaceholder
{
    default @Nullable FloodgatePlayer player(final @NotNull Audience audience) {
        return audience.get(Identity.UUID)
                .map(FloodgateApi.getInstance()::getPlayer)
                .orElse(null);
    }
}
