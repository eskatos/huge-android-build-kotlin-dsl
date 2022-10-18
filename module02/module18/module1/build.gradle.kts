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
  api(project(":module07:module033:module2"))
  api(project(":module07:module120:module2"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module07:module3"))
  implementation(project(":module02:module41:module03:module2"))
  implementation(project(":module02:module41:module06:module2"))
  implementation(project(":module02:module47:module4"))
  implementation(project(":module07:module025:module6"))
  implementation(project(":module07:module118:module3"))
  implementation(project(":module07:module127"))
  implementation(project(":module07:module139"))
  implementation(project(":module07:module152:module1"))
  implementation(project(":module07:module195:module06:module1"))
  implementation(project(":module07:module233:module1"))
  implementation(project(":module07:module288"))
  implementation(project(":module07:module311"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module431:module1"))
  implementation(project(":module07:module437:module2"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module527"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module557"))
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module128"))
  testImplementation(project(":module07:module132:module7"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module463:module3"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
}
