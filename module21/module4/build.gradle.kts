plugins {
  id("com.android.application")
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
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module329:module3"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module546:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  api(project(":module07:module329:module1"))
  api(project(":module07:module338:module1"))
  api(project(":module07:module425:module1"))
  api(project(":module07:module550:module1"))
  api(project(":module26:module1:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("androidx.core:core-ktx:1.7.0")
  api("androidx.databinding:viewbinding:7.1.3")
  api("androidx.recyclerview:recyclerview:1.0.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module313:module4"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module426"))
  implementation(project(":module07:module518:module01"))
  implementation(project(":module07:module550:module1"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  testImplementation("junit:junit:4.13.2")
}
