plugins {
    java
    id("org.springframework.boot") version "3.4.2" apply false
    id("io.spring.dependency-management") version "1.1.0"
    id("java")
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


