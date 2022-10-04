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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module166:module2"))
  api(project(":module07:module539:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module094:module1"))
  implementation(project(":module07:module159:module1"))
  implementation(project(":module07:module195:module02:module4:module10"))
  implementation(project(":module07:module195:module05:module2:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module224:module4"))
  implementation(project(":module07:module271:module6"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module538:module1"))
  implementation(project(":module07:module556"))
  implementation(project(":module07:module558"))
  implementation("androidx.test.espresso:espresso-contrib:3.3.0")
  implementation("androidx.test.espresso:espresso-core:3.3.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
