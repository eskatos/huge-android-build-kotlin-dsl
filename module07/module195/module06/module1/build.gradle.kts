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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module023:module2:module1"))
  api(project(":module07:module157:module2"))
  api(project(":module07:module195:module08:module1"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module569"))
  api(project(":module16:module072:module1"))
  api(project(":module16:module092:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module195:module01:module3"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module549:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module195:module06:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
