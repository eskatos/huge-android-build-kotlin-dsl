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
  api(project(":module02:module10:module2"))
  api(project(":module02:module26:module4"))
  api(project(":module02:module41:module06:module1"))
  api(project(":module02:module41:module10:module1"))
  api(project(":module02:module41:module12:module1"))
  api(project(":module02:module41:module14:module1"))
  api(project(":module02:module41:module17:module1"))
  api(project(":module02:module41:module16:module1"))
  api(project(":module02:module41:module16:module2"))
  api(project(":module02:module41:module19:module2"))
  api(project(":module02:module41:module19:module4"))
  api(project(":module02:module41:module20:module1"))
  api(project(":module02:module41:module23:module2"))
  api(project(":module02:module41:module27:module1"))
  api(project(":module02:module41:module30:module1"))
  api(project(":module02:module41:module34:module1"))
  api(project(":module02:module41:module35:module1"))
  api(project(":module02:module41:module37:module2"))
  api(project(":module02:module41:module38:module3"))
  api(project(":module02:module41:module39:module1"))
  api(project(":module02:module41:module42:module1"))
  api(project(":module02:module43:module1"))
  api(project(":module02:module42:module1"))
  api(project(":module02:module48:module1"))
  api(project(":module02:module48:module3"))
  api(project(":module02:module50:module2"))
  api(project(":module07:module025:module3"))
  api(project(":module07:module147:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module184:module3"))
  api(project(":module07:module213:module3"))
  api(project(":module07:module222:module1"))
  api(project(":module07:module224:module3"))
  api(project(":module07:module297:module2"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module331:module1"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module522:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
