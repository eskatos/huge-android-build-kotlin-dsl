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
  androidTestImplementation(project(":module06:module16:module03"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module07:module013:module2"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module06:module01:module2"))
  api(project(":module06:module16:module13"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module06:module02:module3"))
  implementation(project(":module06:module07:module1"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module06:module16:module02"))
  implementation(project(":module06:module16:module06"))
  implementation(project(":module06:module16:module12"))
  implementation(project(":module07:module005:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module037:module6"))
  implementation(project(":module07:module084:module1"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module174:module1"))
  implementation(project(":module07:module174:module2"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module195:module10:module2:module2"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module260:module2"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module297:module2"))
  implementation(project(":module07:module302:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module383:module3"))
  implementation(project(":module07:module393:module1"))
  implementation(project(":module07:module463:module1"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module07:module563:module2:module1"))
  implementation(project(":module08:module41:module3"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
