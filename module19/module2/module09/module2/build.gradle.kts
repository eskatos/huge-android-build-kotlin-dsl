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
  api(project(":module01:module19"))
  api(project(":module07:module109:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module195:module02:module5:module6"))
  api(project(":module07:module214:module3"))
  api(project(":module07:module292:module3"))
  api(project(":module07:module294:module5"))
  api(project(":module07:module390:module4"))
  api(project(":module07:module403:module4:module2"))
  api(project(":module07:module424:module2"))
  api(project(":module08:module25:module3:module3"))
  api(project(":module08:module38:module03:module1"))
  api(project(":module08:module38:module06:module6"))
  api(project(":module08:module38:module07:module6"))
  api(project(":module08:module38:module16:module3"))
  api(project(":module08:module38:module17:module1"))
  api(project(":module08:module38:module18:module1"))
  api(project(":module08:module40:module5"))
  api(project(":module08:module46:module6"))
  api(project(":module19:module1:module07:module2"))
  api(project(":module19:module1:module08:module3"))
  api(project(":module19:module1:module21:module3"))
  api(project(":module19:module2:module10:module4"))
  api(project(":module19:module2:module11:module4"))
  api(project(":module19:module2:module09:module3"))
  api(project(":module19:module2:module12:module4"))
  api(project(":module19:module2:module15:module2"))
  api(project(":module19:module2:module19:module3"))
  api(project(":module19:module2:module23:module4"))
  api(project(":module19:module2:module24:module6"))
  api(project(":module19:module2:module26:module3"))
  api(project(":module19:module2:module27:module2"))
  api(project(":module19:module2:module32:module4"))
  api(project(":module19:module2:module34:module8"))
  api(project(":module19:module2:module39:module3"))
  api(project(":module19:module2:module46:module3"))
  api(project(":module19:module2:module47:module5"))
  api("com.google.dagger:dagger:2.39.1")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module102"))
  implementation(project(":module07:module112"))
  implementation(project(":module19:module2:module01:module5"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module224:module7"))
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module467:module1"))
  testImplementation(project(":module19:module2:module25:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
