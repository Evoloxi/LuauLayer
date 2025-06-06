plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.ksp)
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(kotlin("stdlib"))
}

kotlin {
    jvmToolchain(21)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
