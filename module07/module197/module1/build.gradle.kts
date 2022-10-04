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
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module197:module3"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module197:module4"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module074:module2"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module132:module2"))
  implementation(project(":module07:module132:module5"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module197:module2"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module360:module2"))
  implementation(project(":module07:module422:module1"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module488:module3"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
