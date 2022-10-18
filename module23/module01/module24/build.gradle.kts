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
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module224:module4"))
  implementation(project(":module07:module317:module1"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module472:module2"))
  implementation(project(":module07:module523:module1"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module558"))
  implementation(project(":module10:module4"))
  implementation(project(":module23:module01:module23"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
