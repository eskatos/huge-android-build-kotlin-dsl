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
  }
}
dependencies {
  androidTestImplementation(project(":module07:module057:module3"))
  androidTestImplementation(project(":module07:module063:module5"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module063:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module049:module2"))
  implementation(project(":module07:module050:module3"))
  implementation(project(":module07:module056:module1"))
  implementation(project(":module07:module057:module2"))
  implementation(project(":module07:module063:module2"))
  implementation(project(":module07:module063:module4"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module213:module3"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module263:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module526:module2:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
