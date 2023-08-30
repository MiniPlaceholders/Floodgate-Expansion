plugins {
    java
    alias(libs.plugins.shadow)
}

dependencies {
    implementation(projects.floodgateExpansionVelocity)
    implementation(projects.floodgateExpansionPaper)
    implementation(projects.floodgateExpansionSponge)
}

subprojects {
    apply<JavaPlugin>()
    repositories {
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://repo.opencollab.dev/main/")
    }
    java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    tasks {
        compileJava {
            options.encoding = Charsets.UTF_8.name()
            options.release.set(17)
        }
    }
}

tasks {
    shadowJar {
        archiveFileName.set("${rootProject.name}-${project.version}.jar")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }
    build {
        dependsOn(shadowJar)
    }
}
