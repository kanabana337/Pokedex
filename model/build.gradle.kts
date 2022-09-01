import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(BuildPlugins.jvm)
    kotlin("plugin.serialization")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(Dependencies.json)
}
