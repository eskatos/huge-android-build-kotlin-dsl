plugins {
  id("com.android.application")
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
  }
}
dependencies {
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module05:module02:module3"))
  api(project(":module05:module03:module1"))
  api(project(":module05:module10:module3"))
  api(project(":module07:module076:module3"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module249"))
  api(project(":module07:module420:module1"))
  api(project(":module07:module468:module2"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module05:module01:module2"))
  implementation(project(":module05:module09:module1"))
  implementation(project(":module05:module10:module2"))
  implementation(project(":module05:module11:module2"))
  implementation(project(":module05:module11:module3"))
  implementation(project(":module05:module18:module2"))
  implementation(project(":module05:module24:module2"))
  implementation(project(":module05:module35"))
  implementation(project(":module05:module39:module2"))
  implementation(project(":module05:module37:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module047:module1"))
  implementation(project(":module07:module077:module5"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module216:module4"))
  implementation(project(":module07:module228:module2"))
  implementation(project(":module07:module251"))
  implementation(project(":module07:module264:module5"))
  implementation(project(":module07:module341:module1"))
  implementation(project(":module07:module422:module1"))
  implementation(project(":module07:module446:module1"))
  implementation(project(":module07:module463:module2"))
  implementation(project(":module07:module502:module1"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module501:module2"))
  implementation(project(":module07:module518:module10"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module551"))
  implementation(project(":module07:module563:module2:module1"))
  implementation("com.jakewharton.timber:timber:4.6.1")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
