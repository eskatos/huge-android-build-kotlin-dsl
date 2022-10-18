pluginManagement {
  repositories {
    gradlePluginPortal()
    google()
  }
}


file("settings-includes.txt").forEachLine { include(it) }

