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
  api(project(":module07:module098:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module06:module1"))
  api(project(":module07:module464:module6"))
  api(project(":module16:module006:module1"))
  api(project(":module16:module029:module1"))
  api(project(":module16:module044:module1"))
  api(project(":module16:module050:module1"))
  api(project(":module16:module092:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module465:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
