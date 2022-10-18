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
  api(project(":module07:module070"))
  api(project(":module07:module099"))
  api(project(":module07:module194"))
  api(project(":module07:module239:module2"))
  api(project(":module07:module311"))
  api(project(":module07:module349:module4"))
  api(project(":module07:module496"))
  api(project(":module07:module505:module1"))
  api(project(":module07:module524:module2"))
  api(project(":module07:module539:module1"))
  api(project(":module07:module556"))
  api(project(":module09:module2"))
  api(project(":module10:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module3"))
  implementation(project(":module05:module06:module1"))
  implementation(project(":module07:module023:module1:module1"))
  implementation(project(":module07:module032:module5"))
  implementation(project(":module07:module065:module7"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module10:module1:module6"))
  implementation(project(":module07:module224:module4"))
  implementation(project(":module07:module239:module4"))
  implementation(project(":module07:module301:module3"))
  implementation(project(":module07:module308:module3"))
  implementation(project(":module07:module327:module3"))
  implementation(project(":module07:module329:module3"))
  implementation(project(":module07:module333:module4"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module472:module2"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module08:module07"))
  implementation(project(":module08:module53"))
  implementation("androidx.test.espresso:espresso-intents:3.3.0")
  implementation("com.google.truth:truth:1.1.3")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
