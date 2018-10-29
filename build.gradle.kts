plugins {
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    id("org.springframework.boot") version "2.1.0.RC1"
    id("java")
}

dependencies {
    implementation("org.springframework.fu:spring-fu-jafu:0.0.3.BUILD-SNAPSHOT")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.springframework:spring-test")
    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

repositories {
    mavenLocal()
    mavenCentral()
    maven("https://repo.spring.io/milestone")
    maven("https://repo.spring.io/snapshot")
    maven("http://dl.bintray.com/kotlin/kotlin-eap")
}