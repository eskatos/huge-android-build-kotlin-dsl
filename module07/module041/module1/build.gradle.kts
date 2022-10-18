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
  androidTestImplementation(project(":module07:module038:module2"))
  androidTestImplementation(project(":module07:module040:module2"))
  androidTestImplementation(project(":module07:module041:module5"))
  androidTestImplementation(project(":module07:module093:module1"))
  androidTestImplementation(project(":module07:module093:module2"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module293:module4"))
  androidTestImplementation(project(":module07:module494:module1"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module26:module2:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module041:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module8"))
  implementation(project(":module07:module038:module1"))
  implementation(project(":module07:module041:module3"))
  implementation(project(":module07:module037:module1"))
  implementation(project(":module07:module037:module5"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module077:module3"))
  implementation(project(":module07:module093:module7"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module192"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module293:module3"))
  implementation(project(":module07:module292:module2"))
  implementation(project(":module07:module298:module2"))
  implementation(project(":module07:module300:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module393:module1"))
  implementation(project(":module07:module417:module2"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module548:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module566:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
