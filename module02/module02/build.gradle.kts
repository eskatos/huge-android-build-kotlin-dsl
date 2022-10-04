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
  api(project(":module02:module30:module1:module1"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module08:module6"))
  implementation(project(":module02:module11:module3"))
  implementation(project(":module02:module14:module3"))
  implementation(project(":module02:module16:module2"))
  implementation(project(":module02:module19:module4"))
  implementation(project(":module02:module34:module1"))
  implementation(project(":module02:module35:module2"))
  implementation(project(":module02:module36:module8"))
  implementation(project(":module02:module50:module3"))
  implementation(project(":module07:module032:module5"))
  implementation(project(":module07:module333:module4"))
  implementation(project(":module07:module340"))
  implementation(project(":module07:module523:module1"))
  implementation(project(":module07:module556"))
  implementation(project(":module09:module3"))
  implementation(project(":module11"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
