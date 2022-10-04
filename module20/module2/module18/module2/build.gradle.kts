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
  api(project(":module07:module132:module6"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module295:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module20:module2:module18:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module195:module05:module3:module4"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module314:module1"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module547:module3"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module21:module2"))
  implementation(project(":module08:module28:module5"))
  implementation(project(":module08:module38:module15:module2"))
  implementation(project(":module16:module091:module1"))
  implementation(project(":module20:module1:module5:module1"))
  implementation(project(":module20:module1:module6:module1"))
  implementation(project(":module20:module1:module7:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("androidx.viewpager2:viewpager2:1.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module127"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module198:module1"))
  testImplementation(project(":module07:module198:module4"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module401"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module517:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation(project(":module07:module567:module3"))
  testImplementation(project(":module16:module031:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
