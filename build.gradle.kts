plugins {
  id("com.android.library") version "7.1.3" apply false
  kotlin("jvm") version "1.6.10" apply false
  id("com.android.application") version "7.1.3" apply false
  kotlin("android") version "1.6.10" apply false
  id("org.jetbrains.kotlin.kapt") version "1.6.10" apply false
}
allprojects {
  repositories {
    google()
    jcenter()
    maven {
      url = uri("https://jitpack.io")
    }
  }
}
dependencies {
}