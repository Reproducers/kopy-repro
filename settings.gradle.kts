pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        // mavenLocal()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        // mavenLocal()
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots")
    }
}

plugins { //
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "kopy-playground"

include(
    "library-a",
    "library-b",
    "library-c",
)
