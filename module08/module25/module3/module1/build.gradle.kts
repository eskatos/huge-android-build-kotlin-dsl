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
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module567:module2"))
  androidTestImplementation(project(":module08:module25:module5:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.threeten:threetenbp:1.6.0")
  api(project(":module07:module175:module1"))
  api(project(":module08:module25:module3:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module077:module3"))
  implementation(project(":module07:module080:module1"))
  implementation(project(":module07:module147:module7"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module214:module1"))
  implementation(project(":module07:module213:module6"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module390:module1"))
  implementation(project(":module07:module390:module4"))
  implementation(project(":module07:module501:module2"))
  implementation(project(":module08:module25:module2:module1"))
  implementation(project(":module08:module25:module4:module1"))
  implementation(project(":module08:module25:module5:module3"))
  implementation(project(":module08:module25:module3:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
