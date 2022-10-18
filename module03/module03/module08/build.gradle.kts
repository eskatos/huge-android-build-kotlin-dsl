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
  api(project(":module13:module11"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module03:module02"))
  implementation(project(":module07:module032:module5"))
  implementation(project(":module07:module041:module5"))
  implementation(project(":module07:module065:module5"))
  implementation(project(":module07:module195:module02:module5:module5"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module277:module2"))
  implementation(project(":module07:module333:module4"))
  implementation(project(":module07:module558"))
  implementation(project(":module09:module3"))
  implementation(project(":module08:module26"))
  implementation(project(":module08:module27:module2"))
  implementation(project(":module10:module4"))
  implementation(project(":module11"))
  implementation(project(":module13:module06"))
  implementation(project(":module13:module12"))
  implementation(project(":module13:module17"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
