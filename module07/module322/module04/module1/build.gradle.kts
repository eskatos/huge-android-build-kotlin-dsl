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
    viewBinding = true
  }
}
dependencies {
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module322:module04:module4"))
  androidTestImplementation(project(":module07:module322:module06:module2"))
  androidTestImplementation(project(":module07:module322:module08:module4"))
  androidTestImplementation(project(":module07:module322:module09:module2"))
  androidTestImplementation(project(":module07:module526:module1:module3"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module547:module4"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module074:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module322:module04:module5"))
  api("androidx.databinding:viewbinding:7.3.1")
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module016:module3"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module032:module4"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module091:module2"))
  implementation(project(":module07:module121:module3"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module218:module1"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module229:module3:module2"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module264:module5"))
  implementation(project(":module07:module273:module2"))
  implementation(project(":module07:module321:module1"))
  implementation(project(":module07:module322:module04:module2"))
  implementation(project(":module07:module322:module06:module1"))
  implementation(project(":module07:module322:module07:module1"))
  implementation(project(":module07:module322:module08:module3"))
  implementation(project(":module07:module322:module09:module1"))
  implementation(project(":module07:module322:module10:module1"))
  implementation(project(":module07:module322:module11:module1"))
  implementation(project(":module07:module320:module1"))
  implementation(project(":module07:module320:module5"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module332:module1"))
  implementation(project(":module07:module332:module3"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module346:module2"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module415:module3"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module509:module2"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module1:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module526:module3:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module07:module542:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module564:module1"))
  implementation(project(":module07:module567:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
