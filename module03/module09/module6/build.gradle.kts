plugins {
  id("com.android.library")
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
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  annotationProcessor("com.google.dagger:dagger-compiler:2.39.1")
  api(project(":module01:module03"))
  api(project(":module03:module09:module4"))
  api(project(":module07:module005:module6"))
  api(project(":module07:module017:module2"))
  api(project(":module07:module018:module3"))
  api(project(":module07:module070"))
  api(project(":module07:module084:module3"))
  api(project(":module07:module090:module6"))
  api(project(":module07:module114:module1"))
  api(project(":module07:module132:module5"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module199:module3"))
  api(project(":module07:module229:module5:module2"))
  api(project(":module07:module229:module4:module4"))
  api(project(":module07:module238:module3"))
  api(project(":module07:module239:module4"))
  api(project(":module07:module264:module4"))
  api(project(":module07:module298:module5"))
  api(project(":module07:module298:module6"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module308:module3"))
  api(project(":module07:module321:module5"))
  api(project(":module07:module337:module3"))
  api(project(":module07:module355:module2"))
  api(project(":module07:module357:module2"))
  api(project(":module07:module368:module5"))
  api(project(":module07:module383:module2"))
  api(project(":module07:module429:module3"))
  api(project(":module07:module469:module2"))
  api(project(":module07:module471"))
  api(project(":module07:module472:module3"))
  api(project(":module07:module474"))
  api(project(":module07:module500:module3"))
  api(project(":module07:module512:module7"))
  api(project(":module08:module01"))
  api(project(":module08:module05:module4"))
  api(project(":module08:module07"))
  api(project(":module08:module10:module5"))
  api(project(":module08:module24"))
  api(project(":module08:module26"))
  api(project(":module08:module30"))
  api(project(":module08:module32"))
  api(project(":module08:module35:module2"))
  api(project(":module08:module37"))
  api(project(":module08:module39:module2"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module43"))
  api(project(":module08:module45"))
  api(project(":module08:module44:module5"))
  api(project(":module08:module52:module4"))
  api(project(":module08:module56:module2"))
  api(project(":module08:module58"))
  api(project(":module08:module62:module4"))
  api(project(":module10:module2"))
  api(project(":module15:module1"))
  api(project(":module22:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly(project(":module08:module59"))
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module07:module185:module3"))
}
