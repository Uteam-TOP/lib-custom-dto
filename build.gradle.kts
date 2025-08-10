plugins {
    java
    id("java")
    id("maven-publish")
}

publishing {
    publications {
        // Define a publication named 'mavenJava' for Java/Kotlin JVM projects
        create<MavenPublication>("mavenJava") {
            // 'from(components["java"])' or 'from(components["kotlin"])'
            // depending on the component you want to publish
            from(components["java"]) // Or components["kotlin"] for Kotlin JVM

            // Optional: Override groupId, artifactId, or version for this specific publication
            // groupId = "com.example.override"
            // artifactId = "my-custom-library"
            // version = "1.0.1"

            // Optional: Add additional artifacts like sources or javadoc JARs
            artifact(tasks.jar) {
                classifier = "sources" // Example for a sources JAR
            }
            artifact(tasks.jar) {
                classifier = "javadoc" // Example for a javadoc JAR
            }
        }
    }
    repositories {
        // Define repositories where your artifacts will be published
        mavenLocal() // Publish to your local Maven repository (for testing)

        maven {
            name = "lib-custom-dto" // A descriptive name for your repository
            url = uri("https://github.com/uteam-top/lib-custom-dto") // URL of your remote repository
            credentials {
                username = "Uteam-TOP"
                password = "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"
            }
        }
    }
}


group = "ru.fvds.cdss13.lib"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}
dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.2")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("org.springframework:spring-web:6.2.2")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.springframework:spring-context:6.2.2")
}



repositories {
    mavenCentral()
}


