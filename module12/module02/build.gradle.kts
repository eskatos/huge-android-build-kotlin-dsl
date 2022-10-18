plugins {
  id("com.android.library")
  id("org.jetbrains.kotlin.android")
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
    buildConfig = true
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module12:module08"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module12:module10"))
  implementation("androidx.activity:activity-ktx:1.3.1")
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0")
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.nds.threeds:widget:1.3.7")
  implementation("com.netcetera.android-3dssdk:3ds-sdk:2.3.5.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("androidx.arch.core:core-testing:2.1.0")
  testImplementation("androidx.test.ext:junit:1.1.3")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
