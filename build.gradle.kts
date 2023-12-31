plugins {
    kotlin("jvm") version "1.9.21"
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-client-core:2.2.4")
    implementation("io.ktor:ktor-client-cio:2.2.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0-RC")
    implementation(kotlin("reflect"))
    testImplementation("io.kotest:kotest-runner-junit5-jvm:5.5.5")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

group = "ddj.adventofcode"
version = "0.3.0"