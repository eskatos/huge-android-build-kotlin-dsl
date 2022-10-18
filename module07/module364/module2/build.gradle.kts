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
    compose = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module016:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module205:module1"))
  api(project(":module07:module362:module3"))
  api(project(":module07:module363:module6"))
  api(project(":module07:module364:module5"))
  api(project(":module07:module367:module2"))
  api(project(":module07:module417:module3"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module470:module3"))
  api(project(":module07:module527"))
  api(project(":module16:module028:module1"))
  api("androidx.databinding:viewbinding:7.3.1")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module04:module1"))
  implementation(project(":module07:module022:module5:module5"))
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module179:module5"))
  implementation(project(":module07:module203:module4"))
  implementation(project(":module07:module318:module2"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module366:module6"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module26:module2:module1"))
  implementation(project(":module26:module4:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module361:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
