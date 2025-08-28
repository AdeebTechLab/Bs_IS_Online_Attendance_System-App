pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Bs.IS Attendance"

// Include app module and prepare for future modularity
include(":app")
// Example: include(":core", ":feature:attendance", ":feature:auth")