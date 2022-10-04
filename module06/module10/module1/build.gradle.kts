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
  api(project(":module06:module10:module2"))
  api(project(":module07:module539:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module127"))
  implementation(project(":module07:module231:module1"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module317:module1"))
  implementation(project(":module07:module536:module3"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module557"))
  implementation(project(":module16:module031:module1"))
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
