plugins {
  id("com.android.library")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(25)
    targetSdkVersion(25)
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module07:module175:module1"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module546:module1"))
  api(project(":module23:module01:module36:module7"))
  api("com.google.code.gson:gson:2.8.6")
  api("com.google.dagger:dagger:2.39.1")
  api("com.jakewharton.timber:timber:4.6.1")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module025:module6"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module16:module061:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
