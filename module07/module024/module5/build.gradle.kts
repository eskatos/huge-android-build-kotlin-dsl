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
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module152:module1"))
  api(project(":module07:module399"))
  api(project(":module07:module452:module4"))
  api(project(":module07:module519:module1"))
  api(project(":module07:module562:module2"))
  api(project(":module07:module563:module1:module1"))
  api(project(":module16:module061:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module102"))
  implementation(project(":module07:module115:module2"))
  implementation(project(":module07:module132:module6"))
  implementation(project(":module07:module223"))
  implementation(project(":module07:module289:module4"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module326:module2"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module452:module4"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module535:module3"))
  implementation(project(":module07:module542:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module147:module9"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module312"))
  testImplementation(project(":module07:module325:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
}
