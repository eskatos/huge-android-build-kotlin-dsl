plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
  api(project(":module03:module09:module4"))
  api(project(":module05:module14:module10"))
  api(project(":module05:module19:module3"))
  api(project(":module05:module24:module4"))
  api(project(":module06:module05:module05:module2"))
  api(project(":module06:module05:module12:module2"))
  api(project(":module06:module16:module09"))
  api(project(":module07:module022:module1:module2"))
  api(project(":module07:module022:module3:module4"))
  api(project(":module07:module022:module4:module2"))
  api(project(":module07:module022:module7:module3"))
  api(project(":module07:module025:module4"))
  api(project(":module07:module039:module5"))
  api(project(":module07:module040:module2"))
  api(project(":module07:module041:module5"))
  api(project(":module07:module037:module4"))
  api(project(":module07:module066:module3"))
  api(project(":module07:module076:module2"))
  api(project(":module07:module084:module2"))
  api(project(":module07:module088:module3"))
  api(project(":module07:module087:module5"))
  api(project(":module07:module089:module5"))
  api(project(":module07:module090:module5"))
  api(project(":module07:module147:module3"))
  api(project(":module07:module148:module08"))
  api(project(":module07:module171:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module186:module3"))
  api(project(":module07:module195:module10:module2:module3"))
  api(project(":module07:module220:module7"))
  api(project(":module07:module221:module2:module4"))
  api(project(":module07:module242:module3"))
  api(project(":module07:module243:module5"))
  api(project(":module07:module244:module3"))
  api(project(":module07:module297:module1"))
  api(project(":module07:module307:module4"))
  api(project(":module07:module308:module2"))
  api(project(":module07:module302:module4"))
  api(project(":module07:module322:module04:module4"))
  api(project(":module07:module322:module08:module4"))
  api(project(":module07:module322:module09:module2"))
  api(project(":module07:module363:module4"))
  api(project(":module07:module361:module4"))
  api(project(":module07:module384:module2"))
  api(project(":module07:module404:module1:module2"))
  api(project(":module07:module440:module3"))
  api(project(":module07:module476:module3"))
  api(project(":module07:module509:module1"))
  api(project(":module07:module514:module4"))
  api(project(":module07:module518:module02"))
  api(project(":module07:module526:module3:module3"))
  api(project(":module07:module533:module3"))
  api(project(":module07:module539:module1"))
  api(project(":module07:module545:module1"))
  api(project(":module08:module05:module3"))
  api(project(":module08:module11:module11:module4"))
  api(project(":module08:module11:module13:module3"))
  api(project(":module08:module14:module3"))
  api(project(":module08:module40:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module540:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
