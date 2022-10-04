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
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module08:module44:module3"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module05:module09:module1"))
  api(project(":module07:module025:module3"))
  api(project(":module07:module107:module1"))
  api(project(":module07:module109:module2"))
  api(project(":module07:module108:module2"))
  api(project(":module07:module106:module3"))
  api(project(":module07:module149:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module199:module2"))
  api(project(":module07:module213:module1"))
  api(project(":module07:module220:module8"))
  api(project(":module07:module258:module2"))
  api(project(":module07:module264:module3"))
  api(project(":module07:module302:module1"))
  api(project(":module07:module399"))
  api(project(":module07:module439:module2"))
  api(project(":module07:module515:module2"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module522:module3"))
  api(project(":module08:module44:module5"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module14:module11"))
  implementation(project(":module07:module011:module2"))
  implementation(project(":module07:module018:module2"))
  implementation(project(":module07:module022:module3:module3"))
  implementation(project(":module07:module016:module3"))
  implementation(project(":module07:module031:module2"))
  implementation(project(":module07:module032:module2"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module072:module2"))
  implementation(project(":module07:module077:module3"))
  implementation(project(":module07:module090:module2"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module130:module3"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module183:module07"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module3"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module226:module3"))
  implementation(project(":module07:module240:module2"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module430:module2"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module449:module2"))
  implementation(project(":module07:module450:module1"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module467:module4"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module514:module2"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module535:module2"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module08:module45"))
  implementation(project(":module08:module44:module4"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
