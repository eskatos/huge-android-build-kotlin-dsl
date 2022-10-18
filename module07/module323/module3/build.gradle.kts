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
    buildConfig = true
    androidResources = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  api(project(":module07:module175:module1"))
  api(project(":module07:module323:module4"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  api("org.greenrobot:eventbus:3.1.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module013:module4"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module247:module2"))
  implementation(project(":module07:module328:module1"))
  implementation(project(":module07:module338:module1"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module542:module2"))
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
  implementation("androidx.lifecycle:lifecycle-viewmodel:2.4.0")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("com.miteksystems.misnap:api-release-jetified:4.0.0")
  implementation("com.miteksystems.misnap:imageutils-release-jetified:4.0.0")
  implementation("com.miteksystems.misnap:mibidata-release:4.0.0")
  implementation("com.miteksystems.misnap:misnapcamera-release-jetified:4.0.0")
  implementation("com.miteksystems.misnap:misnapscience-release:4.0.0")
  implementation("org.apache.sanselan:sanselan-release:0.97-misnap")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module013:module5"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
