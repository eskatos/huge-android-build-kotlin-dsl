plugins {
  id("com.android.application")
  id("org.jetbrains.kotlin.android")
  id("org.jetbrains.kotlin.kapt")
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
    buildConfig = true
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation(project(":module02:module13:module3"))
  androidTestImplementation(project(":module02:module26:module3"))
  androidTestImplementation(project(":module02:module30:module1:module1"))
  androidTestImplementation(project(":module02:module37:module3"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module02:module37:module4"))
  api(project(":module07:module175:module1"))
  api("androidx.databinding:viewbinding:7.3.1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module2"))
  implementation(project(":module02:module13:module2"))
  implementation(project(":module02:module26:module2"))
  implementation(project(":module02:module30:module2:module2"))
  implementation(project(":module02:module37:module2"))
  implementation(project(":module02:module41:module08:module2"))
  implementation(project(":module02:module41:module18:module1"))
  implementation(project(":module02:module41:module19:module3"))
  implementation(project(":module02:module41:module24:module1"))
  implementation(project(":module02:module41:module27:module1"))
  implementation(project(":module02:module41:module32:module1"))
  implementation(project(":module02:module41:module38:module2"))
  implementation(project(":module02:module41:module41:module2"))
  implementation(project(":module02:module47:module1"))
  implementation(project(":module07:module035:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module121:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module201:module1"))
  implementation(project(":module07:module339:module2"))
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
