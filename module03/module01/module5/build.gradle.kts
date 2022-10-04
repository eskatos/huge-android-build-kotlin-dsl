plugins {
  id("com.android.library")
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
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module03:module01:module3"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module02:module25:module1"))
  compileOnly(project(":module02:module32"))
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module02:module34:module3"))
  implementation(project(":module02:module35:module2"))
  implementation(project(":module02:module38:module1"))
  implementation(project(":module02:module43:module2"))
  implementation(project(":module02:module42:module1"))
  implementation(project(":module02:module48:module3"))
  implementation(project(":module03:module01:module6"))
  implementation(project(":module03:module01:module7"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module182"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module474"))
  implementation(project(":module08:module37"))
  implementation(project(":module15:module2"))
  implementation("androidx.sqlite:sqlite:2.1.0")
  implementation("com.f2prateek.rx.preferences2:rx-preferences:2.0.1-beta1")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("io.reactivex.rxjava2:rxjava:2.2.20")
}
