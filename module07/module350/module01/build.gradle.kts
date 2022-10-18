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
  androidTestImplementation(project(":module07:module220:module7"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module293:module4"))
  androidTestImplementation(project(":module07:module340"))
  androidTestImplementation(project(":module07:module348:module2"))
  androidTestImplementation(project(":module07:module353:module1"))
  androidTestImplementation(project(":module07:module353:module3"))
  androidTestImplementation(project(":module07:module350:module06"))
  androidTestImplementation(project(":module07:module493:module1"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module547:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-intents:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module07:module350:module09"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module01"))
  implementation(project(":module07:module016:module1"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module121:module4"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module220:module4"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module259:module1"))
  implementation(project(":module07:module293:module3"))
  implementation(project(":module07:module292:module2"))
  implementation(project(":module07:module308:module1"))
  implementation(project(":module07:module318:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module347:module1"))
  implementation(project(":module07:module348:module1"))
  implementation(project(":module07:module348:module4"))
  implementation(project(":module07:module353:module2"))
  implementation(project(":module07:module350:module02"))
  implementation(project(":module07:module350:module07"))
  implementation(project(":module07:module350:module08"))
  implementation(project(":module07:module346:module1"))
  implementation(project(":module07:module392:module1"))
  implementation(project(":module07:module393:module1"))
  implementation(project(":module07:module407:module2"))
  implementation(project(":module07:module422:module1"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation("com.veriff:veriff-library:3.21.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
