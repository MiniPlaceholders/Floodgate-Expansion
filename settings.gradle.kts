enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Floodgate-Expansion"

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}

arrayOf("common", "paper", "velocity", "sponge").forEach {
    include("floodgate-expansion-$it")

    project(":floodgate-expansion-$it").projectDir = file(it)
}

