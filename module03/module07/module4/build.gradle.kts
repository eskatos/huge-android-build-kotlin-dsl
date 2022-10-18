plugins {
  id("com.android.library")
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
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module03:module07:module3"))
  api(project(":module07:module002:module3"))
  api(project(":module07:module006:module1"))
  api(project(":module07:module009:module1"))
  api(project(":module07:module005:module2"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module027:module1"))
  api(project(":module07:module074:module2"))
  api(project(":module07:module078:module1"))
  api(project(":module07:module149:module2"))
  api(project(":module07:module152:module1"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module162"))
  api(project(":module07:module163:module2"))
  api(project(":module07:module163:module3"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module186:module2"))
  api(project(":module07:module186:module5"))
  api(project(":module07:module188:module1"))
  api(project(":module07:module188:module3"))
  api(project(":module07:module192"))
  api(project(":module07:module194"))
  api(project(":module07:module216:module4"))
  api(project(":module07:module216:module5"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module229:module6"))
  api(project(":module07:module229:module9:module1"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module251"))
  api(project(":module07:module257:module1"))
  api(project(":module07:module257:module2"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module298:module1"))
  api(project(":module07:module298:module3"))
  api(project(":module07:module298:module4"))
  api(project(":module07:module298:module7"))
  api(project(":module07:module300:module3"))
  api(project(":module07:module328:module1"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module422:module2"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module467:module2"))
  api(project(":module07:module467:module4"))
  api(project(":module07:module464:module1"))
  api(project(":module07:module464:module5"))
  api(project(":module07:module468:module1"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module468:module3"))
  api(project(":module07:module481:module2"))
  api(project(":module07:module518:module04"))
  api(project(":module07:module518:module07"))
  api(project(":module07:module518:module09"))
  api(project(":module07:module518:module10"))
  api(project(":module07:module547:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module547:module3"))
  api(project(":module07:module562:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module19:module3:module4:module2"))
  api(project(":module19:module3:module5:module2"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("com.google.android.gms:play-services-base:17.1.0")
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module005:module6"))
  implementation(project(":module07:module074:module3"))
  implementation(project(":module07:module299"))
  implementation(project(":module07:module298:module2"))
  implementation(project(":module07:module298:module6"))
  implementation(project(":module07:module389:module2"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module466:module1"))
  implementation(project(":module07:module481:module4"))
  implementation(project(":module07:module518:module03"))
  implementation(project(":module07:module518:module05"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module563:module1:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
