package io.github.miniplaceholders.expansion.floodgate.common;

import io.github.miniplaceholders.api.Expansion;
import io.github.miniplaceholders.expansion.floodgate.common.placeholder.*;

public final class CommonExpansion {
    public static Expansion.Builder builder() {
        return Expansion.builder("floodgate")
                .globalPlaceholder("prefix", new FloodgatePrefixPlaceholder())
                .globalPlaceholder("player_count", new PlayerCountPlaceholder())
                .audiencePlaceholder("client_device", new ClientDevicePlaceholder())
                .audiencePlaceholder("client_locale", new ClientLocalePlaceholder())
                .audiencePlaceholder("client_version", new ClientVersionPlaceholder())
                .audiencePlaceholder("is_bedrock_player", new IsBedrockPlayerPlaceholder());
    }
}
