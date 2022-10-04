plugins {
  id("com.android.library")
  kotlin("android")
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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module10:module1"))
  api(project(":module07:module562:module2"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module16"))
  implementation(project(":module01:module19"))
  implementation(project(":module05:module35"))
  implementation(project(":module06:module01:module3"))
  implementation(project(":module06:module02:module3"))
  implementation(project(":module06:module05:module10:module3"))
  implementation(project(":module06:module05:module15:module5"))
  implementation(project(":module06:module13:module3"))
  implementation(project(":module06:module19:module3:module2"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module046:module2"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module094:module2"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module157:module2"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module177:module1"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module234:module1"))
  implementation(project(":module07:module235:module1"))
  implementation(project(":module07:module242:module4"))
  implementation(project(":module07:module240:module3"))
  implementation(project(":module07:module246"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module468:module3"))
  implementation(project(":module07:module501:module3"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module569"))
  implementation(project(":module16:module031:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
