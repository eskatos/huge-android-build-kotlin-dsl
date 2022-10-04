plugins {
  id("com.android.library")
  kotlin("android")
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
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module01:module03"))
  api(project(":module02:module50:module2"))
  api(project(":module02:module51:module3"))
  api(project(":module02:module52:module1"))
  api(project(":module03:module01:module4"))
  api(project(":module05:module23:module5"))
  api(project(":module07:module022:module6:module3"))
  api(project(":module07:module118:module3"))
  api(project(":module07:module120:module2"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module166:module2"))
  api(project(":module07:module199:module3"))
  api(project(":module07:module229:module5:module2"))
  api(project(":module07:module229:module4:module4"))
  api(project(":module07:module264:module4"))
  api(project(":module07:module298:module5"))
  api(project(":module07:module298:module6"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module469:module2"))
  api(project(":module07:module500:module3"))
  api(project(":module08:module24"))
  api(project(":module08:module26"))
  api(project(":module08:module30"))
  api(project(":module08:module32"))
  api(project(":module08:module34:module2"))
  api(project(":module08:module37"))
  api(project(":module08:module39:module2"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module43"))
  api(project(":module08:module45"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module52:module6"))
  api(project(":module08:module56:module2"))
  api(project(":module08:module58"))
  api(project(":module10:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module07:module033:module2"))
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module22:module4"))
  implementation(project(":module02:module25:module1"))
  implementation(project(":module02:module32"))
  implementation(project(":module02:module35:module2"))
  implementation(project(":module02:module42:module1"))
  implementation(project(":module02:module48:module3"))
  implementation(project(":module03:module01:module7"))
  implementation(project(":module07:module185:module3"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module474"))
  implementation(project(":module08:module01"))
  implementation(project(":module08:module07"))
  implementation(project(":module08:module37"))
  implementation(project(":module15:module1"))
  implementation("androidx.sqlite:sqlite:2.1.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
