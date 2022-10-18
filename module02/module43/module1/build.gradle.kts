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
  api(project(":module02:module41:module17:module2"))
  api(project(":module02:module41:module16:module3"))
  api(project(":module02:module42:module1"))
  api(project(":module02:module49:module1"))
  api(project(":module07:module005:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module09:module1"))
  api(project(":module07:module222:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module464:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module16:module004:module1"))
  api("androidx.test.espresso:espresso-idling-resource:3.3.0")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module302:module1"))
  implementation(project(":module07:module465:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
