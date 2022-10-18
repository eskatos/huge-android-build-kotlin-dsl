plugins {
  id("com.android.application")
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
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation(project(":module23:module07:module07:module1"))
  androidTestImplementation(project(":module23:module07:module20:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module313:module4"))
  implementation(project(":module23:module07:module19"))
  implementation(project(":module23:module07:module20:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
