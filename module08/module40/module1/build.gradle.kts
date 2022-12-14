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
  androidTestImplementation(project(":module07:module023:module4:module3"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module08:module19:module2"))
  androidTestImplementation(project(":module08:module40:module3"))
  androidTestImplementation(project(":module08:module40:module4"))
  androidTestImplementation(project(":module14:module2:module3"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module175:module1"))
  api(project(":module08:module40:module5"))
  api(project(":module14:module2:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module31:module3"))
  implementation(project(":module07:module011:module4"))
  implementation(project(":module07:module014:module2"))
  implementation(project(":module07:module023:module2:module1"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module031:module2"))
  implementation(project(":module07:module047:module1"))
  implementation(project(":module07:module072:module2"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module2"))
  implementation(project(":module07:module114:module1"))
  implementation(project(":module07:module132:module2"))
  implementation(project(":module07:module132:module5"))
  implementation(project(":module07:module147:module7"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module213:module3"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module258:module1"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module260:module4"))
  implementation(project(":module07:module297:module2"))
  implementation(project(":module07:module322:module04:module3"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module345:module3"))
  implementation(project(":module07:module360:module2"))
  implementation(project(":module07:module368:module4"))
  implementation(project(":module07:module370:module3"))
  implementation(project(":module07:module374:module2"))
  implementation(project(":module07:module375:module2"))
  implementation(project(":module07:module376:module1:module3"))
  implementation(project(":module07:module376:module1:module4"))
  implementation(project(":module07:module378:module3"))
  implementation(project(":module07:module390:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module415:module3"))
  implementation(project(":module07:module416:module2"))
  implementation(project(":module07:module414:module1"))
  implementation(project(":module07:module440:module2"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module468:module2"))
  implementation(project(":module07:module483:module3"))
  implementation(project(":module07:module514:module3"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module08:module19:module1"))
  implementation(project(":module08:module40:module2"))
  implementation(project(":module08:module42:module1"))
  implementation(project(":module08:module42:module5"))
  implementation(project(":module14:module3:module2"))
  implementation(project(":module14:module4:module1"))
  implementation(project(":module14:module6:module2"))
  implementation(project(":module14:module8:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation("androidx.test.uiautomator:uiautomator:2.2.0")
}
