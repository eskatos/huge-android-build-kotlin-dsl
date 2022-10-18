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
  androidTestImplementation(project(":module07:module086:module4"))
  androidTestImplementation(project(":module07:module147:module3"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module195:module02:module7:module5"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module293:module4"))
  androidTestImplementation(project(":module07:module321:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module086:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module016:module1"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module047:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module086:module5"))
  implementation(project(":module07:module118:module2"))
  implementation(project(":module07:module132:module2"))
  implementation(project(":module07:module132:module5"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module149:module1"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module183:module07"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module01:module2"))
  implementation(project(":module07:module195:module02:module2:module1"))
  implementation(project(":module07:module195:module02:module3:module2"))
  implementation(project(":module07:module195:module02:module4:module03"))
  implementation(project(":module07:module195:module02:module6:module1"))
  implementation(project(":module07:module195:module02:module7:module3"))
  implementation(project(":module07:module195:module03:module1"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module05:module3:module1"))
  implementation(project(":module07:module195:module07:module2"))
  implementation(project(":module07:module195:module09:module2"))
  implementation(project(":module07:module195:module10:module3:module5"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module224:module2"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module224:module5"))
  implementation(project(":module07:module240:module2"))
  implementation(project(":module07:module258:module1"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module270:module2"))
  implementation(project(":module07:module293:module3"))
  implementation(project(":module07:module292:module2"))
  implementation(project(":module07:module295:module1"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module360:module2"))
  implementation(project(":module07:module390:module3"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module420:module1"))
  implementation(project(":module07:module422:module1"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module464:module5"))
  implementation(project(":module07:module502:module1"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module14:module2:module1"))
  implementation(project(":module14:module6:module2"))
  implementation(project(":module18:module11:module4:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
