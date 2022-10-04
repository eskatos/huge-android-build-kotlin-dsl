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
  androidTestImplementation(project(":module07:module483:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module204:module1"))
  api(project(":module07:module483:module5"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module2"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module036:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module203:module3"))
  implementation(project(":module07:module258:module1"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module318:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module332:module1"))
  implementation(project(":module07:module332:module3"))
  implementation(project(":module07:module374:module3"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module467:module1"))
  implementation(project(":module07:module484:module1"))
  implementation(project(":module07:module483:module2"))
  implementation(project(":module07:module488:module3"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module14:module2:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
