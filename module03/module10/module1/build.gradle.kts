plugins {
  id("com.android.application")
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
    buildConfig = true
  }
}
dependencies {
  androidTestImplementation(project(":module03:module10:module2"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module539:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.ext:junit:1.1.3")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module10:module3"))
  implementation(project(":module03:module10:module4"))
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module313:module2"))
  implementation(project(":module07:module313:module3"))
  implementation(project(":module07:module316:module1"))
  implementation(project(":module07:module478:module4"))
  implementation(project(":module07:module518:module03"))
  implementation(project(":module07:module518:module07"))
  implementation(project(":module07:module518:module09"))
  implementation(project(":module07:module523:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module547:module2"))
  implementation(project(":module07:module570"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module23:module01:module06:module2"))
  implementation(project(":module23:module01:module08:module3"))
  implementation(project(":module23:module01:module16"))
  implementation(project(":module23:module01:module17:module1"))
  implementation(project(":module23:module01:module26:module1"))
  implementation(project(":module23:module01:module31:module1"))
  implementation(project(":module23:module01:module32"))
  implementation(project(":module23:module01:module36:module7"))
  implementation(project(":module23:module01:module39:module2"))
  implementation(project(":module23:module01:module41"))
  implementation(project(":module23:module01:module42"))
  implementation(project(":module23:module01:module50"))
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
