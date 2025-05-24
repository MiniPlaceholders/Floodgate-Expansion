enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Floodgate-Expansion"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

arrayOf("common", "paper", "velocity", "sponge").forEach {
    include("floodgate-expansion-$it")

    project(":floodgate-expansion-$it").projectDir = file(it)
}

