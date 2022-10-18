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
  androidTestImplementation(project(":module07:module066:module3"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module208:module4"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module242:module3"))
  androidTestImplementation(project(":module07:module243:module5"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module243:module8"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module1"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module066:module1"))
  implementation(project(":module07:module106:module3"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module208:module2"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module242:module2"))
  implementation(project(":module07:module243:module3"))
  implementation(project(":module07:module240:module2"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module296:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module420:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module502:module1"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module551"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
