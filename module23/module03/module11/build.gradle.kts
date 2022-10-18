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
  api(project(":module01:module12:module3"))
  api(project(":module06:module05:module22:module2"))
  api(project(":module07:module538:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module14:module10"))
  implementation(project(":module06:module05:module02:module2"))
  implementation(project(":module06:module05:module21:module2"))
  implementation(project(":module06:module05:module23:module2"))
  implementation(project(":module06:module05:module26:module2"))
  implementation(project(":module06:module06:module2"))
  implementation(project(":module06:module16:module09"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module455:module4"))
  implementation(project(":module07:module536:module3"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module558"))
  implementation(project(":module09:module3"))
  implementation(project(":module11"))
  implementation(project(":module23:module01:module32"))
  implementation(project(":module23:module01:module33:module3"))
  implementation(project(":module23:module03:module03"))
  implementation(project(":module23:module03:module06"))
  implementation(project(":module23:module03:module09"))
  implementation(project(":module23:module03:module12"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
