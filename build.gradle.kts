plugins {
    java
    id("maven-publish")
}

group = "ru.fvds.cdss13.lib"
version = "0.0.31-SNAPSHOT"

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
            artifactId = project.name // Без ${}
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
    compileOnly("org.projectlombok:lombok:1.18.24")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.18.2")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("org.springframework:spring-web:6.2.2")
    implementation("org.mapstruct:mapstruct:1.6.3")
    implementation("org.springframework:spring-context:6.2.2")
}





