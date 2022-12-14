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
  api(project(":module05:module10:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module420:module2"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module564:module1"))
  api(project(":module18:module10:module2:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module098:module1"))
  implementation(project(":module07:module147:module8"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module240:module3"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module18:module04:module2:module2"))
  implementation(project(":module18:module10:module5:module2"))
  implementation(project(":module18:module11:module4:module2"))
  implementation("androidx.lifecycle:lifecycle-common-java8:2.4.0")
  implementation("androidx.lifecycle:lifecycle-common:2.4.0")
  implementation("androidx.lifecycle:lifecycle-process:2.4.0")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module188:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module3"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
