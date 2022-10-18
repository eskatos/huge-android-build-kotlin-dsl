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
  api(project(":module07:module050:module6"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module012"))
  implementation(project(":module07:module050:module2"))
  implementation(project(":module07:module055:module3"))
  implementation(project(":module07:module056:module1"))
  implementation(project(":module07:module057:module6"))
  implementation(project(":module07:module092:module5"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module263:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module317:module1"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module496"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module533:module2"))
  implementation(project(":module07:module541:module1"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module558"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
