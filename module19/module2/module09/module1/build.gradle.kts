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
  androidTestImplementation(project(":module07:module329:module1"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module563:module1:module1"))
  androidTestImplementation(project(":module19:module2:module11:module2"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module19:module2:module09:module3"))
  api(project(":module19:module2:module31:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module214:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module368:module1"))
  implementation(project(":module07:module376:module1:module2"))
  implementation(project(":module07:module376:module1:module4"))
  implementation(project(":module07:module376:module1:module5"))
  implementation(project(":module07:module415:module3"))
  implementation(project(":module07:module416:module2"))
  implementation(project(":module07:module414:module1"))
  implementation(project(":module07:module468:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module19:module2:module11:module1"))
  implementation(project(":module19:module2:module09:module2"))
  implementation(project(":module19:module2:module27:module2"))
  implementation(project(":module19:module2:module37:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
