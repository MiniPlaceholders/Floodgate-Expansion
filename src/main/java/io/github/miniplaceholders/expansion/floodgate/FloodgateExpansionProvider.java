package io.github.miniplaceholders.expansion.floodgate;

import io.github.miniplaceholders.api.Expansion;
import io.github.miniplaceholders.api.provider.ExpansionProvider;
import io.github.miniplaceholders.api.provider.LoadRequirement;
import io.github.miniplaceholders.expansion.floodgate.placeholder.*;

public final class FloodgateExpansionProvider implements ExpansionProvider {

    @Override
    public Expansion provideExpansion() {
        return Expansion.builder("floodgate")
                .author("MiniPlaceholders Contributors")
                .version("2.0.0")
                .globalPlaceholder("prefix", new FloodgatePrefixPlaceholder())
                .globalPlaceholder("player_count", new PlayerCountPlaceholder())
                .audiencePlaceholder("client_device", new ClientDevicePlaceholder())
                .audiencePlaceholder("client_locale", new ClientLocalePlaceholder())
                .audiencePlaceholder("client_version", new ClientVersionPlaceholder())
                .audiencePlaceholder("is_bedrock_player", new IsBedrockPlayerPlaceholder())
                .build();
    }

    @Override
    public LoadRequirement loadRequirement() {
        return LoadRequirement.requiredComplement("floodgate");
    }
}
