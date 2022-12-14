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
  androidTestImplementation(project(":module05:module06:module4"))
  androidTestImplementation(project(":module05:module14:module04"))
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module05:module26:module1"))
  androidTestImplementation(project(":module07:module048:module4"))
  androidTestImplementation(project(":module07:module050:module4"))
  androidTestImplementation(project(":module07:module051:module2"))
  androidTestImplementation(project(":module07:module052:module4"))
  androidTestImplementation(project(":module07:module055:module3"))
  androidTestImplementation(project(":module07:module058:module2"))
  androidTestImplementation(project(":module07:module060:module3"))
  androidTestImplementation(project(":module07:module061:module3"))
  androidTestImplementation(project(":module07:module057:module6"))
  androidTestImplementation(project(":module07:module063:module5"))
  androidTestImplementation(project(":module07:module077:module2"))
  androidTestImplementation(project(":module07:module183:module05"))
  androidTestImplementation(project(":module07:module183:module08"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module540:module1"))
  androidTestImplementation(project(":module07:module541:module1"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.dagger:dagger:2.39.1")
  androidTestImplementation("junit:junit:4.13.2")
  api(project(":module07:module050:module6"))
  api(project(":module07:module175:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module01:module14"))
  implementation(project(":module05:module09:module1"))
  implementation(project(":module05:module10:module3"))
  implementation(project(":module07:module005:module2"))
  implementation(project(":module07:module011:module2"))
  implementation(project(":module07:module023:module3:module1"))
  implementation(project(":module07:module023:module4:module2"))
  implementation(project(":module07:module025:module3"))
  implementation(project(":module07:module027:module1"))
  implementation(project(":module07:module032:module4"))
  implementation(project(":module07:module049:module2"))
  implementation(project(":module07:module050:module5"))
  implementation(project(":module07:module051:module1"))
  implementation(project(":module07:module052:module5"))
  implementation(project(":module07:module053:module2"))
  implementation(project(":module07:module054:module4"))
  implementation(project(":module07:module055:module2"))
  implementation(project(":module07:module056:module1"))
  implementation(project(":module07:module058:module1"))
  implementation(project(":module07:module059:module2"))
  implementation(project(":module07:module061:module2"))
  implementation(project(":module07:module057:module4"))
  implementation(project(":module07:module062:module2"))
  implementation(project(":module07:module063:module2"))
  implementation(project(":module07:module063:module4"))
  implementation(project(":module07:module065:module6"))
  implementation(project(":module07:module077:module1"))
  implementation(project(":module07:module079:module1"))
  implementation(project(":module07:module092:module2"))
  implementation(project(":module07:module099"))
  implementation(project(":module07:module118:module1"))
  implementation(project(":module07:module124:module2"))
  implementation(project(":module07:module130:module3"))
  implementation(project(":module07:module135:module5"))
  implementation(project(":module07:module133:module3"))
  implementation(project(":module07:module133:module6"))
  implementation(project(":module07:module147:module6"))
  implementation(project(":module07:module157:module1"))
  implementation(project(":module07:module176:module2"))
  implementation(project(":module07:module176:module4"))
  implementation(project(":module07:module179:module2"))
  implementation(project(":module07:module183:module09"))
  implementation(project(":module07:module189:module4"))
  implementation(project(":module07:module192"))
  implementation(project(":module07:module194"))
  implementation(project(":module07:module213:module1"))
  implementation(project(":module07:module220:module4"))
  implementation(project(":module07:module224:module3"))
  implementation(project(":module07:module226:module3"))
  implementation(project(":module07:module229:module5:module2"))
  implementation(project(":module07:module229:module4:module4"))
  implementation(project(":module07:module258:module1"))
  implementation(project(":module07:module260:module3"))
  implementation(project(":module07:module263:module1"))
  implementation(project(":module07:module263:module2"))
  implementation(project(":module07:module291:module1"))
  implementation(project(":module07:module310:module2"))
  implementation(project(":module07:module318:module1"))
  implementation(project(":module07:module319:module1"))
  implementation(project(":module07:module319:module2"))
  implementation(project(":module07:module323:module3"))
  implementation(project(":module07:module326:module1"))
  implementation(project(":module07:module332:module1"))
  implementation(project(":module07:module332:module2"))
  implementation(project(":module07:module339:module2"))
  implementation(project(":module07:module393:module1"))
  implementation(project(":module07:module411:module2"))
  implementation(project(":module07:module415:module3"))
  implementation(project(":module07:module420:module1"))
  implementation(project(":module07:module433"))
  implementation(project(":module07:module467:module2"))
  implementation(project(":module07:module488:module3"))
  implementation(project(":module07:module502:module1"))
  implementation(project(":module07:module501:module1"))
  implementation(project(":module07:module503:module2"))
  implementation(project(":module07:module503:module4"))
  implementation(project(":module07:module509:module1"))
  implementation(project(":module07:module517:module2"))
  implementation(project(":module07:module522:module3"))
  implementation(project(":module07:module526:module2:module2"))
  implementation(project(":module07:module533:module2"))
  implementation(project(":module07:module551"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
  kapt("com.google.dagger:dagger-compiler:2.39.1")
}
