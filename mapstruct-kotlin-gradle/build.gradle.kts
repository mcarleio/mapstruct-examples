import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    kotlin("kapt") version "1.5.10"
}

group = "org.mapstruct.examples"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.mapstruct:mapstruct:1.5.0.Beta2")
    kapt("org.mapstruct:mapstruct-processor:1.5.0.Beta2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.3.1")
    testImplementation("org.assertj:assertj-core:3.11.1")
}


kapt {
    arguments {
        // Set Mapstruct Configuration options here
        // https://kotlinlang.org/docs/reference/kapt.html#annotation-processor-arguments
        // https://mapstruct.org/documentation/stable/reference/html/#configuration-options
        // arg("mapstruct.defaultComponentModel", "spring")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
}
