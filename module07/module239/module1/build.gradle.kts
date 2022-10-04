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
  api(project(":module07:module130:module4"))
  api(project(":module07:module239:module4"))
  api(project(":module07:module260:module4"))
  api(project(":module07:module478:module4"))
  api(project(":module07:module557"))
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module022:module6:module5"))
  implementation(project(":module07:module022:module5:module5"))
  implementation(project(":module07:module091:module4"))
  implementation(project(":module07:module208:module8"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module425:module1"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module559:module1"))
  implementation(project(":module16:module031:module1"))
  implementation("com.github.chrisbanes:PhotoView:2.3.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
