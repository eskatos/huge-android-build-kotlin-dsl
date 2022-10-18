plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module07:module539:module1"))
  api(project(":module23:module09:module2:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module070"))
  implementation(project(":module07:module271:module1"))
  implementation(project(":module08:module26"))
  implementation(project(":module08:module28:module2"))
  implementation(project(":module08:module45"))
  implementation(project(":module10:module2"))
  implementation(project(":module20:module2:module02:module1"))
  implementation(project(":module20:module3:module6"))
  implementation(project(":module23:module09:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
