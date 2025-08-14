package io.github.miniplaceholders.expansion.floodgate.placeholder;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.identity.Identity;
import net.kyori.adventure.text.minimessage.Context;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.ArgumentQueue;
import org.geysermc.floodgate.api.FloodgateApi;
import org.jetbrains.annotations.NotNull;

public final class IsBedrockPlayerPlaceholder implements FloodgatePlaceholder {
    @Override
    public Tag tag(
            final @NotNull Audience audience,
            final @NotNull ArgumentQueue queue,
            final @NotNull Context ctx
    ) {
        final boolean isBedrockPlayer = audience.get(Identity.UUID)
                .filter(FloodgateApi.getInstance()::isFloodgatePlayer)
                .isPresent();
        return Tag.preProcessParsed(Boolean.toString(isBedrockPlayer));
    }
}
