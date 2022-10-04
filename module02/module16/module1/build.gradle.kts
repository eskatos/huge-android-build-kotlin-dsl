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
  androidTestImplementation(project(":module02:module13:module3"))
  androidTestImplementation(project(":module02:module14:module3"))
  androidTestImplementation(project(":module02:module15:module2"))
  androidTestImplementation(project(":module02:module16:module3"))
  androidTestImplementation(project(":module02:module30:module1:module1"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module02:module16:module4"))
  api(project(":module07:module175:module1"))
  api("androidx.databinding:viewbinding:7.1.3")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module01:module2"))
  implementation(project(":module02:module07:module2"))
  implementation(project(":module02:module08:module6"))
  implementation(project(":module02:module12:module1"))
  implementation(project(":module02:module13:module2"))
  implementation(project(":module02:module14:module2"))
  implementation(project(":module02:module15:module3"))
  implementation(project(":module02:module16:module2"))
  implementation(project(":module02:module19:module3"))
  implementation(project(":module02:module20:module2"))
  implementation(project(":module02:module23:module2"))
  implementation(project(":module02:module28:module4"))
  implementation(project(":module02:module36:module8"))
  implementation(project(":module02:module37:module4"))
  implementation(project(":module02:module41:module01:module1"))
  implementation(project(":module02:module41:module07:module2"))
  implementation(project(":module02:module41:module08:module2"))
  implementation(project(":module02:module41:module09:module1"))
  implementation(project(":module02:module41:module18:module1"))
  implementation(project(":module02:module41:module19:module3"))
  implementation(project(":module02:module41:module24:module1"))
  implementation(project(":module02:module41:module32:module1"))
  implementation(project(":module02:module41:module38:module2"))
  implementation(project(":module02:module41:module41:module2"))
  implementation(project(":module02:module47:module1"))
  implementation(project(":module07:module014:module2"))
  implementation(project(":module07:module035:module1"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module121:module3"))
  implementation(project(":module07:module132:module4"))
  implementation(project(":module07:module134:module5"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module08:module52:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
