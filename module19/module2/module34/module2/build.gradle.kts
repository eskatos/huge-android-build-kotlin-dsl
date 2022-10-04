plugins {
  id("com.android.application")
  kotlin("android")
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
  }
}
dependencies {
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module19:module2:module07:module1"))
  androidTestImplementation(project(":module19:module5:module1:module2"))
  androidTestImplementation(project(":module19:module5:module4"))
  androidTestImplementation(project(":module19:module5:module5"))
  androidTestImplementation(project(":module19:module5:module7"))
  androidTestImplementation(project(":module19:module5:module8"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module2"))
  api(project(":module07:module293:module3"))
  api(project(":module19:module2:module04:module4"))
  api(project(":module19:module2:module34:module3"))
  api(project(":module19:module2:module34:module8"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module19:module3:module1"))
  implementation(project(":module07:module109:module2"))
  implementation(project(":module07:module108:module2"))
  implementation(project(":module07:module198:module2"))
  implementation(project(":module07:module403:module1:module3"))
  implementation(project(":module07:module424:module1"))
  implementation(project(":module08:module25:module5:module3"))
  implementation(project(":module19:module1:module07:module1"))
  implementation(project(":module19:module1:module08:module2"))
  implementation(project(":module19:module1:module12:module1"))
  implementation(project(":module19:module1:module14:module3"))
  implementation(project(":module19:module1:module18:module2"))
  implementation(project(":module19:module1:module26:module2"))
  implementation(project(":module19:module2:module02:module3"))
  implementation(project(":module19:module2:module08:module3"))
  implementation(project(":module19:module2:module14:module4"))
  implementation(project(":module19:module2:module20:module4"))
  implementation(project(":module19:module2:module22:module3"))
  implementation(project(":module19:module2:module30:module3"))
  implementation(project(":module19:module2:module36:module3"))
  implementation(project(":module19:module2:module37:module3"))
  implementation(project(":module19:module2:module34:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
