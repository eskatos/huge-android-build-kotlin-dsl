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
  api(project(":module05:module14:module14"))
  api(project(":module05:module37:module2"))
  api(project(":module07:module072:module1"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module12:module1"))
  implementation(project(":module05:module01:module3"))
  implementation(project(":module05:module02:module4"))
  implementation(project(":module05:module05"))
  implementation(project(":module05:module06:module1"))
  implementation(project(":module05:module07"))
  implementation(project(":module05:module08:module2"))
  implementation(project(":module05:module09:module4"))
  implementation(project(":module05:module14:module13"))
  implementation(project(":module05:module26:module1"))
  implementation(project(":module07:module002:module3"))
  implementation(project(":module07:module047:module3"))
  implementation(project(":module07:module094:module1"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module185:module4"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module217"))
  implementation(project(":module07:module224:module6"))
  implementation(project(":module07:module228:module4"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module467:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module557"))
  implementation(project(":module07:module554:module1"))
  implementation(project(":module16:module012:module1"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module224:module7"))
}
