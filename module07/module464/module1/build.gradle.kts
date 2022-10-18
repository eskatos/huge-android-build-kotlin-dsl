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
  api(project(":module07:module005:module8"))
  api(project(":module07:module023:module2:module1"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module257:module3"))
  api(project(":module07:module466:module1"))
  api(project(":module07:module464:module6"))
  api(project(":module16:module005:module1"))
  api(project(":module16:module011:module2"))
  api(project(":module16:module014:module1"))
  api(project(":module16:module022:module1"))
  api(project(":module16:module046:module1"))
  api(project(":module16:module047:module1"))
  api(project(":module16:module067:module1"))
  api(project(":module16:module076:module1"))
  api(project(":module16:module088:module1"))
  api(project(":module16:module093:module1"))
  api(project(":module16:module096:module1"))
  api("com.google.dagger:dagger:2.39.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module247:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module464:module7"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
}
