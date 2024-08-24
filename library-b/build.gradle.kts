plugins {
    application
    alias(libs.plugins.kotlin)
    alias(libs.plugins.kopy)
}

version = "1.0-SNAPSHOT"

application {
    mainClass = "com.javiersc.kopy.playground.library.b.MainKt"
}

dependencies {
    implementation(project(":library-a"))
}
