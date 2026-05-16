fun getEnvOrProp(envVar: String, propName: String): String {
    val envProvider = providers.environmentVariable(envVar)
    val propProvider = providers.gradleProperty(propName)
    return envProvider.orElse(propProvider).orElse("").get()
}

fun getProp(propName: String): String {
    val propProvider = providers.gradleProperty(propName)
    return propProvider.orElse("").get()
}

plugins {
    id("java")
    id("maven-publish")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(25))
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.1.0")
}

publishing {
    repositories {
        maven("https://nexus.sirblobman.xyz/public") {
            credentials {
                username = getEnvOrProp("MAVEN_DEPLOY_USR", "maven.username.sirblobman")
                password = getEnvOrProp("MAVEN_DEPLOY_PSW", "maven.password.sirblobman")
            }
        }
    }

    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.combatlogx"
            artifactId = "api"
            version = getProp("api.version")
            from(components["java"])
        }
    }
}

tasks {
    withType<Javadoc> {
        val standardOptions = (options as StandardJavadocDocletOptions)
        standardOptions.addStringOption("Xdoclint:none", "-quiet")
    }
}
