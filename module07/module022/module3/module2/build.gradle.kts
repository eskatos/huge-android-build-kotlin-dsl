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
  api(project(":module07:module022:module1:module3"))
  api(project(":module07:module022:module2:module4"))
  api(project(":module07:module022:module3:module5"))
  api(project(":module07:module022:module4:module3"))
  api(project(":module07:module022:module7:module4"))
  api(project(":module07:module022:module8:module4"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module135:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module390:module4"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module526:module3:module4"))
  api(project(":module07:module563:module2:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module022:module2:module4"))
  implementation(project(":module07:module330:module1"))
  implementation(project(":module07:module329:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
