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
    compose = true
  }
}
dependencies {
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.2.0-alpha07")
  api(project(":module07:module032:module7"))
  api(project(":module07:module048:module6"))
  api(project(":module07:module050:module6"))
  api(project(":module07:module065:module7"))
  api(project(":module07:module133:module7"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module224:module6"))
  api(project(":module07:module332:module4"))
  api(project(":module07:module562:module2"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module07:module031:module3"))
  implementation(project(":module07:module049:module4"))
  implementation(project(":module07:module051:module3"))
  implementation(project(":module07:module052:module6"))
  implementation(project(":module07:module055:module4"))
  implementation(project(":module07:module056:module2"))
  implementation(project(":module07:module060:module4"))
  implementation(project(":module07:module057:module7"))
  implementation(project(":module07:module062:module4"))
  implementation(project(":module07:module063:module6"))
  implementation(project(":module07:module077:module7"))
  implementation(project(":module07:module092:module5"))
  implementation(project(":module07:module130:module4"))
  implementation(project(":module07:module153:module3"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module176:module6"))
  implementation(project(":module07:module178"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module319:module3"))
  implementation(project(":module07:module329:module1"))
  implementation(project(":module07:module399"))
  implementation(project(":module07:module411:module3"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module505:module1"))
  implementation(project(":module07:module517:module3"))
  implementation(project(":module07:module533:module4"))
  implementation(project(":module07:module549:module3"))
  implementation(project(":module07:module546:module1"))
  implementation(project(":module07:module565:module2"))
  implementation(project(":module07:module566:module2"))
  implementation(project(":module16:module061:module1"))
  implementation("androidx.compose.foundation:foundation:1.2.0-alpha07")
  implementation("com.google.android.material:material:1.2.1")
  implementation("com.google.dagger:dagger:2.39.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx2:1.5.0")
  testImplementation(project(":module07:module005:module9"))
  testImplementation(project(":module07:module057:module8"))
  testImplementation(project(":module07:module150:module3"))
  testImplementation(project(":module07:module213:module7"))
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module411:module4"))
  testImplementation(project(":module07:module447:module2"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module468:module4"))
  testImplementation(project(":module07:module542:module3"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
  testImplementation("org.robolectric:robolectric:4.7.3")
}
