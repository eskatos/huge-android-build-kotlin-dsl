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
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module06:module05:module04:module6"))
  api(project(":module06:module08:module4"))
  api(project(":module06:module12:module5"))
  api(project(":module06:module13:module3"))
  api(project(":module07:module083:module7"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module095:module6"))
  api(project(":module07:module097:module4"))
  api(project(":module07:module144:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module09:module3"))
  api(project(":module07:module213:module6"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module302:module6"))
  api(project(":module07:module415:module4"))
  api(project(":module07:module455:module4"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module522:module4"))
  api(project(":module16:module039:module1"))
  api(project(":module24:module1:module3"))
  api(project(":module24:module3:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module05:module16:module3"))
  implementation(project(":module07:module094:module2"))
  implementation(project(":module07:module137:module2"))
  implementation(project(":module07:module210:module1"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module385:module2"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module417:module3"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module550:module1"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module26:module2:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module144:module1"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module302:module1"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module415:module5"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module522:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module24:module3:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
