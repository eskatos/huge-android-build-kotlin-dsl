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
  androidTestImplementation(project(":module07:module307:module4"))
  androidTestImplementation(project(":module07:module302:module4"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module025:module3"))
  api(project(":module07:module084:module1"))
  api(project(":module07:module118:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module183:module09"))
  api(project(":module07:module213:module3"))
  api(project(":module07:module224:module3"))
  api(project(":module07:module297:module2"))
  api(project(":module07:module304:module4"))
  api(project(":module07:module307:module2"))
  api(project(":module07:module307:module5"))
  api(project(":module07:module302:module1"))
  api(project(":module07:module302:module5"))
  api(project(":module07:module382:module2"))
  api(project(":module07:module463:module1"))
  api(project(":module07:module467:module2"))
  api(project(":module07:module501:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module195:module09:module1"))
  implementation(project(":module07:module260:module2"))
  implementation(project(":module07:module307:module2"))
  implementation(project(":module07:module342:module1"))
  implementation(project(":module07:module393:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module425:module1"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module567:module2"))
  implementation(project(":module16:module034:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
