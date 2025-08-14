package io.github.miniplaceholders.expansion.floodgate.placeholder;

import io.github.miniplaceholders.api.resolver.GlobalTagResolver;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.geysermc.floodgate.api.FloodgateApi;
import org.jetbrains.annotations.NotNull;

public final class FloodgatePrefixPlaceholder implements GlobalTagResolver {
    @Override
    public Tag tag(
            final @NotNull ArgumentQueue queue,
            final @NotNull Context ctx
    ) {
        final String playerPrefix = FloodgateApi.getInstance().getPlayerPrefix();
        return Tag.preProcessParsed(playerPrefix);
    }
}
