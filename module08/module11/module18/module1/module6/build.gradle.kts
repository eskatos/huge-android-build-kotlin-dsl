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
  api(project(":module07:module013:module4"))
  api(project(":module07:module125:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module289:module4"))
  api(project(":module07:module535:module3"))
  api(project(":module07:module564:module1"))
  api(project(":module08:module12:module05:module1"))
  api(project(":module08:module12:module08:module4"))
  api(project(":module08:module12:module15:module3"))
  api(project(":module08:module11:module03:module1"))
  api(project(":module08:module11:module10:module4"))
  api(project(":module08:module11:module13:module4"))
  api(project(":module08:module11:module15:module1:module3"))
  api(project(":module08:module11:module18:module1:module7"))
  api(project(":module08:module11:module18:module2:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module542:module2"))
  implementation(project(":module08:module12:module11:module3"))
  implementation(project(":module08:module11:module04:module1"))
  implementation(project(":module08:module11:module05:module3"))
  implementation(project(":module08:module11:module03:module1"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("androidx.viewpager2:viewpager2:1.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
