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
  api(project(":module04:module01:module3"))
  api(project(":module04:module06:module2"))
  api(project(":module04:module07:module2"))
  api(project(":module04:module09:module2"))
  api(project(":module04:module11:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module07:module563:module2:module1"))
  api("androidx.constraintlayout:constraintlayout:1.1.3")
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module465:module1"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module16:module031:module1"))
  implementation(project(":module16:module034:module1"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
