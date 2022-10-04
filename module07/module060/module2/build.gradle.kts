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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module060:module4"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module342:module1"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module014:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module507:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
