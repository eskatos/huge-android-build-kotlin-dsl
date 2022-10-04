plugins {
  id("com.android.application")
  kotlin("android")
}
android {
  compileSdkVersion = "android-31"
  defaultConfig {
    minSdkVersion(24)
    targetSdkVersion(32)
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
  }
}
dependencies {
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.ext:junit:1.1.3")
  androidTestImplementation("androidx.test:core:1.4.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  compileOnly(project(":module18:module03"))
  compileOnly(project(":module18:module08"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module18:module01:module3"))
  implementation(project(":module18:module09:module1"))
  implementation(project(":module18:module07:module2"))
  implementation("androidx.activity:activity:1.3.1")
  implementation("androidx.appcompat:appcompat:1.3.1")
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("androidx.core:core-ktx:1.7.0")
  implementation("androidx.drawerlayout:drawerlayout:1.0.0")
  implementation("androidx.navigation:navigation-fragment-ktx:2.2.1")
  implementation("androidx.navigation:navigation-ui-ktx:2.2.1")
  implementation("androidx.preference:preference-ktx:1.1.0")
  implementation("androidx.recyclerview:recyclerview:1.0.0")
  implementation("com.google.android.material:material:1.2.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  runtimeOnly(project(":module18:module01:module2"))
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("junit:junit:4.13.2")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.6.10")
  testImplementation("org.mockito.kotlin:mockito-kotlin:3.2.0")
  testImplementation("org.mockito:mockito-core:3.12.4")
}
