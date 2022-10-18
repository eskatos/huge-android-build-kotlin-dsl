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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module06:module01:module3"))
  api(project(":module06:module02:module3"))
  api(project(":module06:module05:module10:module3"))
  api(project(":module06:module10:module2"))
  api(project(":module07:module095:module6"))
  api(project(":module07:module258:module3"))
  api(project(":module07:module440:module5"))
  api(project(":module07:module534:module1"))
  api(project(":module07:module546:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module08:module09:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module03"))
  implementation(project(":module01:module10:module1"))
  implementation(project(":module01:module16"))
  implementation(project(":module01:module19"))
  implementation(project(":module06:module05:module03:module1"))
  implementation(project(":module06:module07:module4"))
  implementation(project(":module06:module12:module5"))
  implementation(project(":module06:module20:module2"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module084:module3"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module107:module2"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module165:module1"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module193"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module195:module05:module3:module4"))
  implementation(project(":module07:module195:module09:module3"))
  implementation(project(":module07:module195:module10:module2:module4"))
  implementation(project(":module07:module221:module1:module7"))
  implementation(project(":module07:module249"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module273:module3"))
  implementation(project(":module07:module287:module1"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module383:module3"))
  implementation(project(":module07:module406:module4"))
  implementation(project(":module07:module424:module1"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module07:module569"))
  implementation(project(":module08:module11:module14:module3:module4"))
  implementation(project(":module16:module011:module2"))
  implementation(project(":module16:module092:module1"))
  implementation(project(":module16:module104:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module025:module3"))
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module150:module2"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module175:module2"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
