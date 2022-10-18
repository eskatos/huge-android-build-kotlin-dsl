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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module077:module7"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module5"))
  api(project(":module07:module195:module01:module3"))
  api(project(":module07:module195:module04:module3"))
  api(project(":module07:module195:module05:module3:module4"))
  api(project(":module07:module195:module09:module3"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module233:module1"))
  api(project(":module07:module344:module4"))
  api(project(":module07:module399"))
  api(project(":module07:module431:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module565:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module07:module563:module2:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  compileOnly("org.threeten:threetenbp:1.6.0")
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module16:module028:module1"))
  implementation(project(":module16:module092:module1"))
  implementation(project(":module26:module3:module2"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("androidx.compose.ui:ui:1.2.0-alpha07")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
