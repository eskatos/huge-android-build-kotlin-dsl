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
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module01:module03"))
  api(project(":module03:module03:module04"))
  api(project(":module07:module055:module2"))
  api(project(":module07:module062:module2"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module130:module4"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module199:module3"))
  api(project(":module07:module227:module2:module2"))
  api(project(":module07:module229:module5:module2"))
  api(project(":module07:module229:module4:module4"))
  api(project(":module07:module264:module4"))
  api(project(":module07:module298:module5"))
  api(project(":module07:module298:module6"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module368:module4"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module429:module6"))
  api(project(":module07:module500:module3"))
  api(project(":module07:module501:module1"))
  api(project(":module08:module24"))
  api(project(":module08:module26"))
  api(project(":module08:module30"))
  api(project(":module08:module32"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module43"))
  api(project(":module08:module45"))
  api(project(":module08:module52:module6"))
  api(project(":module08:module56:module2"))
  api(project(":module08:module58"))
  api(project(":module10:module2"))
  api(project(":module13:module05:module5"))
  api(project(":module13:module13:module5"))
  api(project(":module13:module13:module6"))
  api(project(":module13:module18:module1"))
  api(project(":module15:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module07:module383:module3"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module03:module07"))
  implementation(project(":module07:module070"))
  implementation(project(":module07:module175:module1"))
  implementation(project(":module07:module185:module3"))
  implementation(project(":module07:module262:module1"))
  implementation(project(":module07:module445:module1"))
  implementation(project(":module07:module471"))
  implementation(project(":module07:module474"))
  implementation(project(":module08:module01"))
  implementation(project(":module08:module07"))
  implementation(project(":module08:module37"))
  implementation(project(":module08:module52:module7"))
  implementation(project(":module13:module01"))
  implementation(project(":module13:module06"))
  implementation(project(":module13:module08:module3"))
  implementation(project(":module13:module09"))
  implementation(project(":module13:module10"))
  implementation(project(":module13:module11"))
  implementation(project(":module13:module12"))
  implementation(project(":module13:module15"))
  implementation(project(":module13:module16"))
  implementation(project(":module13:module17"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
