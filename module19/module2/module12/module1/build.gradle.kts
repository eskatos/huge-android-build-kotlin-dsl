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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module19:module2:module12:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module17"))
  implementation(project(":module07:module072:module3"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module131:module2"))
  implementation(project(":module07:module172:module4"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module257:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module339:module4"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module464:module6"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module08:module38:module16:module3"))
  implementation(project(":module16:module030:module1"))
  implementation(project(":module19:module1:module21:module3"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
  testImplementation("org.threeten:threetenbp:1.6.0")
}
