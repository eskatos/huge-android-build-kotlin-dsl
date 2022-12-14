plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module070"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module289:module4"))
  api(project(":module19:module2:module10:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module111:module3"))
  implementation(project(":module07:module195:module05:module3:module4"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module258:module3"))
  implementation(project(":module07:module399"))
  implementation(project(":module08:module45"))
  implementation(project(":module19:module1:module02:module3"))
  implementation(project(":module19:module1:module21:module3"))
  implementation(project(":module19:module1:module26:module3"))
  implementation(project(":module19:module2:module09:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
