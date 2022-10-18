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
  api(project(":module05:module10:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module232:module3"))
  api(project(":module07:module231:module4"))
  api(project(":module07:module283:module5"))
  api(project(":module07:module399"))
  api(project(":module07:module421:module6"))
  api(project(":module07:module534:module1"))
  api(project(":module07:module536:module5"))
  api(project(":module08:module12:module02:module2:module3"))
  api(project(":module08:module12:module08:module4"))
  api(project(":module08:module12:module11:module3"))
  api(project(":module08:module12:module15:module3"))
  api(project(":module08:module11:module11:module7"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module03"))
  implementation(project(":module01:module19"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module06:module05:module21:module5"))
  implementation(project(":module06:module05:module23:module5"))
  implementation(project(":module06:module05:module26:module5"))
  implementation(project(":module06:module10:module2"))
  implementation(project(":module07:module215"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module226:module5"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module327:module5"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module08:module10:module5"))
  implementation(project(":module08:module20:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
