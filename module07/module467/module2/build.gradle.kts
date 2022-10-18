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
  api(project(":module07:module005:module1"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module127"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module160:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module302:module1"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module400:module1"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module467:module1"))
  api(project(":module07:module467:module4"))
  api(project(":module07:module464:module1"))
  api(project(":module07:module549:module3"))
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.nimbusds:nimbus-jose-jwt:3.10")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module269"))
  implementation(project(":module07:module302:module6"))
  implementation(project(":module16:module061:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
