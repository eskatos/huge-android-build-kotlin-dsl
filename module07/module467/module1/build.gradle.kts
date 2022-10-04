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
  api(project(":module07:module005:module1"))
  api(project(":module07:module098:module1"))
  api(project(":module07:module127"))
  api(project(":module07:module132:module6"))
  api(project(":module07:module147:module2"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module247:module2"))
  api(project(":module07:module393:module2"))
  api(project(":module07:module411:module3"))
  api(project(":module07:module463:module2"))
  api(project(":module07:module467:module4"))
  api(project(":module07:module464:module1"))
  api(project(":module07:module522:module4"))
  api(project(":module07:module549:module3"))
  api("com.google.code.gson:gson:2.8.6")
  api("com.nimbusds:nimbus-jose-jwt:3.10")
  api("io.reactivex.rxjava2:rxjava:2.2.20")
  api("javax.inject:javax.inject:1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module094:module1"))
  implementation(project(":module07:module174:module1"))
  implementation(project(":module07:module274:module1"))
  implementation(project(":module07:module512:module2"))
  implementation(project(":module07:module519:module1"))
  implementation(project(":module07:module561:module1"))
  implementation(project(":module16:module061:module1"))
  implementation(project(":module16:module067:module1"))
  implementation(project(":module16:module069:module1"))
  implementation(project(":module16:module092:module1"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  testImplementation(project(":module07:module324:module1"))
  testImplementation(project(":module07:module467:module5"))
  testImplementation(project(":module07:module464:module7"))
  testImplementation(project(":module07:module547:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
