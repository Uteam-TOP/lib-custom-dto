plugins {
    java
    id("maven-publish")
    idea
}

group = "ru.fvds.cdss13.lib"
version = "0.0.11-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Uteam-TOP/lib-custom-dto")
            credentials {
                  username = project.findProperty("gpr.user")?.toString()
                                     ?: throw GradleException("Set 'gpr.user' in gradle.properties")
                  password = project.findProperty("gpr.key")?.toString()
                                     ?: throw GradleException("Set 'gpr.key' in gradle.properties")
            }
        }
    }
}

idea {
    module {
        isDownloadSources = true
    }
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.2")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("org.springframework:spring-web:6.2.2")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.springframework:spring-context:6.2.2")
}





