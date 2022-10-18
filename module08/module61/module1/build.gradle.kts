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
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module515:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module08:module61:module5"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module08:module61:module7"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module118:module2"))
  implementation(project(":module07:module121:module3"))
  implementation(project(":module07:module131:module1"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module406:module4"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module515:module2"))
  implementation(project(":module07:module515:module3"))
  implementation(project(":module07:module522:module1"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module522:module4"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module08:module60:module4"))
  implementation(project(":module08:module61:module6"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
