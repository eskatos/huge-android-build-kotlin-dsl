plugins {
  id("com.android.library")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module07:module398:module3"))
  api(project(":module07:module399"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module56:module2"))
  api(project(":module23:module09:module2:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module055:module4"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module321:module5"))
  implementation(project(":module07:module320:module7"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module472:module3"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module08:module26"))
  implementation(project(":module08:module28:module5"))
  implementation(project(":module08:module39:module2"))
  implementation(project(":module10:module2"))
  implementation(project(":module20:module1:module1:module4"))
  implementation(project(":module20:module2:module03:module1"))
  implementation(project(":module20:module3:module6"))
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
