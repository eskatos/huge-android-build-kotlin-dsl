plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
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
  api(project(":module05:module14:module10"))
  api(project(":module06:module05:module03:module2"))
  api(project(":module06:module05:module21:module2"))
  api(project(":module06:module05:module22:module2"))
  api(project(":module06:module05:module23:module2"))
  api(project(":module06:module10:module1"))
  api(project(":module06:module12:module2"))
  api(project(":module06:module16:module09"))
  api(project(":module06:module19:module2:module2"))
  api(project(":module07:module001:module3"))
  api(project(":module07:module015:module2"))
  api(project(":module07:module082:module2"))
  api(project(":module07:module083:module4"))
  api(project(":module07:module166:module1"))
  api(project(":module07:module186:module5"))
  api(project(":module07:module195:module02:module4:module07"))
  api(project(":module07:module195:module02:module5:module5"))
  api(project(":module07:module195:module03:module2"))
  api(project(":module07:module208:module6"))
  api(project(":module07:module211:module4"))
  api(project(":module07:module212:module4"))
  api(project(":module07:module224:module4"))
  api(project(":module07:module231:module1"))
  api(project(":module07:module231:module3"))
  api(project(":module07:module253:module2"))
  api(project(":module07:module301:module2"))
  api(project(":module07:module306:module2"))
  api(project(":module07:module306:module3"))
  api(project(":module07:module350:module06"))
  api(project(":module07:module536:module3"))
  api(project(":module07:module541:module1"))
  api(project(":module09:module3"))
  api(project(":module08:module11:module01:module4:module1"))
  api(project(":module08:module11:module01:module4:module2"))
  api(project(":module08:module13:module1"))
  api(project(":module08:module17"))
  api(project(":module08:module28:module3"))
  api(project(":module08:module29:module2"))
  api(project(":module08:module30"))
  api(project(":module08:module61:module5"))
  api(project(":module10:module4"))
  api(project(":module11"))
  api(project(":module23:module01:module23"))
  api(project(":module23:module01:module24"))
  api(project(":module23:module01:module27:module4"))
  api(project(":module23:module01:module33:module3"))
  api(project(":module23:module01:module35"))
  api(project(":module23:module01:module48"))
  api(project(":module23:module07:module03:module2"))
  api(project(":module23:module07:module07:module1"))
  api(project(":module23:module07:module13:module1"))
  api(project(":module23:module07:module16:module1"))
  api(project(":module23:module07:module19"))
  api(project(":module23:module07:module20:module1"))
  api(project(":module23:module07:module29"))
  api(project(":module23:module07:module31"))
  api(project(":module23:module07:module33"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module317:module1"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
