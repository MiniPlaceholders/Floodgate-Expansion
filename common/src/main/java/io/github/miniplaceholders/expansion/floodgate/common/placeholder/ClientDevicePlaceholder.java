package io.github.miniplaceholders.expansion.floodgate.common.placeholder;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClientDevicePlaceholder implements FloodgatePlaceholder {
    @Override
    public @Nullable Tag tag(
            final @NotNull Audience audience,
            final @NotNull ArgumentQueue queue,
            final @NotNull Context ctx
    ) {
        final FloodgatePlayer player = player(audience);
        if (player == null) {
            return null;
        }
        return Tag.preProcessParsed(player.getDeviceOs().toString());
    }
}
