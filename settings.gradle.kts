pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    // ← أضف هنا تعريف الإضافات ونسخها
    plugins {
        id("com.android.application") version "8.2.2"
        id("com.google.gms.google-services") version "4.3.14"
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GroceryListApp"
include(":app")
