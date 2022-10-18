plugins {
  id("com.android.library") version "7.3.1" apply false
  id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false
  id("com.android.application") version "7.3.1" apply false
  id("org.jetbrains.kotlin.android") version "1.7.20" apply false
  id("org.jetbrains.kotlin.kapt") version "1.7.20" apply false
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
