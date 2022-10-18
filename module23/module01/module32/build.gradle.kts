plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
  api(project(":module01:module18"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module251"))
  api(project(":module07:module523:module2"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module557"))
  api(project(":module07:module570"))
  api(project(":module23:module01:module06:module3"))
  api(project(":module23:module01:module16"))
  api(project(":module23:module01:module17:module1"))
  api(project(":module23:module01:module33:module5"))
  api(project(":module23:module01:module42"))
  api(project(":module23:module01:module50"))
  api(project(":module23:module01:module53"))
  api(project(":module23:module01:module54"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module19:module1:module3"))
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module297:module3"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module478:module4"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module23:module01:module20:module1"))
  implementation(project(":module23:module01:module36:module7"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module313:module4"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
