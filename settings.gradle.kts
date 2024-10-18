pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven {
            url = uri("https://maven.springframework.org/release")
        }
        maven {
            url = uri("https://maven.restlet.com")
        }
    }
}

rootProject.name = "kotlin-multi-module"

include("module-adapters:adapter-http")
include("module-adapters:adapter-persistence")

include("module-apps:app-api")
include("module-apps:app-batch")

include("module-commons")

include("module-core:core-domain")
include("module-core:core-port")
include("module-core:core-service")
include("module-core:core-usecase")
