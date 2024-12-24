import org.spongepowered.gradle.plugin.config.PluginLoaders
import org.spongepowered.plugin.metadata.model.PluginDependency

plugins {
    id("org.spongepowered.gradle.plugin") version "2.3.0"
}

dependencies {
    compileOnly(libs.miniplaceholders)
    implementation(projects.floodgateExpansionCommon)
}

sponge {
    apiVersion("8.1.0")
    license("GPL-3")
    loader {
        name(PluginLoaders.JAVA_PLAIN)
        version("1.0")
    }
    plugin("miniplaceholders-floodgate-expansion") {
        displayName("Miniplaceholders-Floodgate-Expansion")
        entrypoint("io.github.miniplaceholders.expansion.floodgate.sponge.SpongePlugin")
        description(project.description)
        links {
            homepage("https://github.com/MiniPlaceholders/Floodgate-Expansion")
            source("https://github.com/MiniPlaceholders/Floodgate-Expansion")
            issues("https://github.com/MiniPlaceholders/Floodgate-Expansion/issues")
        }
        contributor("4drian3d") {
            description("Lead Developer")
        }
        dependency("spongeapi") {
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
        }
        dependency("miniplaceholders") {
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
            version("2.2.1")
        }
        dependency("floodgate") {
            loadOrder(PluginDependency.LoadOrder.AFTER)
            optional(false)
            version("2.2.0-SNAPSHOT")
        }
    }
}
