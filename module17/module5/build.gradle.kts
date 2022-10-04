plugins {
  id("com.android.application")
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
  buildFeatures {
    buildConfig = false
  }
}
dependencies {
  androidTestImplementation(project(":module03:module04:module1"))
  androidTestImplementation(project(":module05:module01:module3"))
  androidTestImplementation(project(":module05:module06:module1"))
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module06:module05:module22:module2"))
  androidTestImplementation(project(":module06:module05:module23:module2"))
  androidTestImplementation(project(":module06:module05:module26:module2"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module186:module3"))
  androidTestImplementation(project(":module07:module224:module5"))
  androidTestImplementation(project(":module07:module240:module1"))
  androidTestImplementation(project(":module07:module383:module3"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module09:module2"))
  androidTestImplementation(project(":module09:module3"))
  androidTestImplementation(project(":module08:module13:module1"))
  androidTestImplementation(project(":module10:module4"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module16:module033:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-contrib:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module094:module1"))
  implementation(project(":module07:module313:module4"))
  implementation(project(":module17:module4"))
}
