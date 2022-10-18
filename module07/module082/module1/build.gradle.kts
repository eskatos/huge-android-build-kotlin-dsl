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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module082:module2"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module07:module527"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
