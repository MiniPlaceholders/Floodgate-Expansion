dependencies {
    compileOnly(libs.paper.api)
    compileOnly(libs.miniplaceholders)
    implementation(projects.floodgateExpansionCommon)
}

tasks {
    processResources {
        filesMatching("paper-plugin.yml") {
            expand("version" to project.version)
        }
    }
}
