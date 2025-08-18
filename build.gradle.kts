plugins {
    java
    id("maven-publish")
}

group = "ru.fvds.cdss13.lib"
version = "0.0.55"

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
            groupId = "ru.fvds.cdss13.lib"
            artifactId = "lib-custom-dto"
            version = version.toString()
        }
    }

    repositories {
        maven {
                    name = "GitHubPackages"
                    url = uri("https://maven.pkg.github.com/Uteam-TOP/lib-custom-dto")
                    credentials {
                        username = System.getenv("GITHUB_ACTOR") ?: "Uteam-TOP" // Ваш GitHub username или org name
                        password = System.getenv("GITHUB_TOKEN") ?: ""
                    }
                }
    }
}



dependencies {
    compileOnly("org.projectlombok:lombok:1.18.32")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.2")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("jakarta.annotation:jakarta.annotation-api:2.1.1")
    implementation("org.springframework:spring-web:6.2.2")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.springframework:spring-context:6.2.2")
    implementation("org.springframework.kafka:spring-kafka:3.3.8")
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.2")
    implementation("org.projectlombok:lombok:1.18.32")
    implementation("org.springframework.boot:spring-boot-starter-logging:3.4.2")
    implementation("org.telegram:telegrambots-client:9.0.0")
    implementation("org.telegram:telegrambots-longpolling:9.0.0")
    implementation("org.springframework.data:spring-data-commons:3.4.2")
}





