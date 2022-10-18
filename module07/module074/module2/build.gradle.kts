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
  api(project(":module01:module15"))
  api(project(":module01:module19"))
  api(project(":module05:module23:module9"))
  api(project(":module06:module02:module3"))
  api(project(":module06:module07:module4"))
  api(project(":module06:module08:module3"))
  api(project(":module06:module20:module2"))
  api(project(":module07:module005:module6"))
  api(project(":module07:module014:module3"))
  api(project(":module07:module023:module1:module1"))
  api(project(":module07:module046:module1"))
  api(project(":module07:module065:module7"))
  api(project(":module07:module074:module1"))
  api(project(":module07:module074:module3"))
  api(project(":module07:module099"))
  api(project(":module07:module102"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module139"))
  api(project(":module07:module145"))
  api(project(":module07:module147:module7"))
  api(project(":module07:module162"))
  api(project(":module07:module161:module1"))
  api(project(":module07:module172:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module176:module2"))
  api(project(":module07:module193"))
  api(project(":module07:module195:module10:module2:module4"))
  api(project(":module07:module195:module10:module4:module3"))
  api(project(":module07:module215"))
  api(project(":module07:module224:module5"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module251"))
  api(project(":module07:module257:module2"))
  api(project(":module07:module260:module3"))
  api(project(":module07:module264:module5"))
  api(project(":module07:module269"))
  api(project(":module07:module271:module6"))
  api(project(":module07:module288"))
  api(project(":module07:module291:module1"))
  api(project(":module07:module299"))
  api(project(":module07:module298:module6"))
  api(project(":module07:module302:module5"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module349:module4"))
  api(project(":module07:module368:module3"))
  api(project(":module07:module383:module3"))
  api(project(":module07:module400:module5"))
  api(project(":module07:module405:module3"))
  api(project(":module07:module406:module3"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module430:module5"))
  api(project(":module07:module441:module1"))
  api(project(":module07:module448:module3"))
  api(project(":module07:module467:module3"))
  api(project(":module07:module464:module5"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module518:module03"))
  api(project(":module07:module518:module05"))
  api(project(":module07:module518:module07"))
  api(project(":module07:module518:module09"))
  api(project(":module07:module520:module3"))
  api(project(":module07:module522:module3"))
  api(project(":module07:module527"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module549:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module534:module1"))
  implementation(project(":module07:module536:module5"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
