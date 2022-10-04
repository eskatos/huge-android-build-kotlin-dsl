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
  api(project(":module07:module091:module4"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module318:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module08:module52:module7"))
  api(project(":module13:module02:module3"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module150:module2"))
  implementation(project(":module07:module270:module4"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module318:module2"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module394:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module542:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module566:module2"))
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("androidx.gridlayout:gridlayout:1.0.0")
  implementation("androidx.viewpager2:viewpager2:1.0.0")
  implementation("com.google.android.flexbox:flexbox:3.0.0")
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}