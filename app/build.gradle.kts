/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("lampdev.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("lampdev.app.AppKt")
}
