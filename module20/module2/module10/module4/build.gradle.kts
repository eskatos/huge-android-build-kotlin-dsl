plugins {
  id("com.android.library")
  kotlin("android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(30)
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  kotlinOptions {
    jvmTarget = "1.8"
  }
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module07:module329:module3"))
  api(project(":module07:module340"))
  api(project(":module07:module539:module1"))
  api(project(":module20:module2:module10:module6"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module340"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module540:module1"))
  implementation(project(":module20:module2:module10:module2"))
  implementation(project(":module20:module2:module10:module3"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
