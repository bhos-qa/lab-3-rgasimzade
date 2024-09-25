plugins {
    id("java")
    id("org.sonarqube") version "4.0.0.2929" // Ensure the SonarQube plugin version is specified
    id("jacoco")
}

sonarqube {
    properties {
        property("sonar.projectKey", "bhos-qa_lab-3-aCloverophile")
        property("sonar.organization", "bhos-qa")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test) // Ensure the test task is executed before generating the report
    reports {
        html.required.set(true)
        xml.required.set(true)
    }
}

jacoco {
    toolVersion = "0.8.7"
}