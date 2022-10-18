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
  api(project(":module07:module002:module3"))
  api(project(":module07:module005:module8"))
  api(project(":module07:module013:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module179:module5"))
  api(project(":module07:module183:module10"))
  api(project(":module07:module185:module4"))
  api(project(":module07:module259:module1"))
  api("androidx.appcompat:appcompat:1.3.1")
  api("androidx.work:work-runtime-ktx:2.7.0")
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module029:module2"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module186:module5"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module447:module1"))
  implementation(project(":module07:module521:module1"))
  implementation(project(":module07:module542:module2"))
  implementation("com.jakewharton.rxrelay2:rxrelay:2.1.0")
  implementation("com.jakewharton.threetenabp:threetenabp:1.4.0")
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("com.jakewharton:process-phoenix:2.0.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
