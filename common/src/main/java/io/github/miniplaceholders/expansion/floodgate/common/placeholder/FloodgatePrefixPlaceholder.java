package io.github.miniplaceholders.expansion.floodgate.common.placeholder;

import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.geysermc.floodgate.api.FloodgateApi;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiFunction;

public final class FloodgatePrefixPlaceholder implements BiFunction<ArgumentQueue, Context, Tag> {
    @Override
    public Tag apply(
            final @NotNull ArgumentQueue queue,
            final @NotNull Context ctx
    ) {
        final String playerPrefix = FloodgateApi.getInstance().getPlayerPrefix();
        return Tag.preProcessParsed(playerPrefix);
    }
}
