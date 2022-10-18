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
  api(project(":module03:module05:module2"))
  api(project(":module05:module01:module1"))
  api(project(":module05:module11:module2"))
  api(project(":module05:module16:module2"))
  api(project(":module05:module14:module11"))
  api(project(":module05:module39:module2"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module025:module5"))
  api(project(":module07:module045:module3"))
  api(project(":module07:module076:module3"))
  api(project(":module07:module121:module4"))
  api(project(":module07:module143:module3"))
  api(project(":module07:module147:module7"))
  api(project(":module07:module149:module1"))
  api(project(":module07:module163:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module2"))
  api(project(":module07:module200:module3"))
  api(project(":module07:module216:module4"))
  api(project(":module07:module228:module3"))
  api(project(":module07:module229:module9:module2"))
  api(project(":module07:module236:module2"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module264:module5"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module389:module2"))
  api(project(":module07:module395:module1"))
  api(project(":module07:module420:module1"))
  api(project(":module07:module443:module1"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module18:module02:module1"))
  api(project(":module18:module04:module1:module1"))
  api(project(":module18:module04:module2:module1"))
  api(project(":module18:module10:module2:module1"))
  api(project(":module18:module10:module4:module1"))
  api(project(":module18:module10:module5:module1"))
  api(project(":module18:module10:module6:module1"))
  api(project(":module18:module11:module1:module1"))
  api(project(":module18:module11:module4:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
