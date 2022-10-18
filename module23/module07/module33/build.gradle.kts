plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module15"))
  implementation(project(":module01:module19"))
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module500:module4"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation(project(":module07:module570"))
  implementation(project(":module23:module01:module31:module1"))
  implementation(project(":module23:module01:module36:module7"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
