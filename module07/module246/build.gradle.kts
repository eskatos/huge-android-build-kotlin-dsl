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
  api(project(":module07:module098:module1"))
  api(project(":module07:module509:module3"))
  api(project(":module07:module547:module3"))
  api("androidx.appcompat:appcompat:1.3.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module542:module2"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  testImplementation(project(":module07:module549:module4"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.glassfish.jaxb:jaxb-runtime:3.0.2")
  testImplementation("org.glassfish:javax.xml.stream:3.0.1")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
}
