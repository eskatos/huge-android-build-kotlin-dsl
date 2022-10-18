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
  api(project(":module06:module16:module13"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module539:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module04:module1"))
  implementation(project(":module06:module16:module02"))
  implementation(project(":module06:module16:module12"))
  implementation(project(":module07:module012"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module174:module2"))
  implementation(project(":module07:module173:module1:module1"))
  implementation(project(":module07:module231:module1"))
  implementation(project(":module07:module317:module1"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module536:module3"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module540:module1"))
  implementation(project(":module07:module556"))
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
