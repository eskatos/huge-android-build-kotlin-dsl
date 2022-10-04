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
  api(project(":module07:module539:module1"))
  api(project(":module08:module28:module5"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module066:module3"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module358:module5"))
  implementation(project(":module07:module436:module4"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module556"))
  implementation(project(":module08:module03:module1"))
  implementation(project(":module08:module20:module3"))
  implementation(project(":module08:module28:module2"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
