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
  api(project(":module06:module05:module14:module2"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module05:module02:module3"))
  implementation(project(":module06:module05:module03:module3"))
  implementation(project(":module06:module05:module04:module6"))
  implementation(project(":module06:module05:module09:module2"))
  implementation(project(":module06:module05:module08:module2"))
  implementation(project(":module06:module05:module10:module3"))
  implementation(project(":module06:module05:module16:module3"))
  implementation(project(":module06:module05:module18:module3"))
  implementation(project(":module06:module05:module23:module5"))
  implementation(project(":module06:module05:module26:module5"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module06:module16:module13"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module490:module5"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module16:module031:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module06:module07:module5"))
}
