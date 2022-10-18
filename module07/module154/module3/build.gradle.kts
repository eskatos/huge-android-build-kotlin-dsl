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
  api(project(":module07:module154:module6"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module264:module6"))
  api(project(":module07:module388:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module467:module4"))
  api(project(":module07:module501:module3"))
  api("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module118:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module566:module2"))
  implementation("com.github.chrisbanes:PhotoView:2.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
