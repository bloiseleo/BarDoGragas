import org.flywaydb.gradle.task.FlywayMigrateTask

plugins {
    java
    id("org.springframework.boot") version "3.4.0"
    id("io.spring.dependency-management") version "1.1.6"
    id("org.flywaydb.flyway") version "9.0.0"
}

group = "com.bardogragas"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

flyway {
    url = "jdbc:postgresql://localhost:5432/bardogragas"
    user = "root"
    password = "password"
    locations = arrayOf("classpath:db/migrations")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    runtimeOnly("org.postgresql:postgresql")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType(FlywayMigrateTask::class) {
    dependsOn("build")
}