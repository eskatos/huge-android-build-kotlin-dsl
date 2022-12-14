plugins {
  id("com.android.application")
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
  }
}
dependencies {
  androidTestImplementation(project(":module03:module09:module5"))
  androidTestImplementation(project(":module05:module01:module3"))
  androidTestImplementation(project(":module05:module06:module1"))
  androidTestImplementation(project(":module05:module13:module2"))
  androidTestImplementation(project(":module05:module14:module10"))
  androidTestImplementation(project(":module05:module19:module3"))
  androidTestImplementation(project(":module05:module24:module4"))
  androidTestImplementation(project(":module05:module30:module6"))
  androidTestImplementation(project(":module05:module34:module5"))
  androidTestImplementation(project(":module05:module38:module2"))
  androidTestImplementation(project(":module06:module05:module02:module2"))
  androidTestImplementation(project(":module06:module05:module03:module2"))
  androidTestImplementation(project(":module06:module05:module13:module2"))
  androidTestImplementation(project(":module06:module05:module21:module2"))
  androidTestImplementation(project(":module06:module05:module22:module2"))
  androidTestImplementation(project(":module06:module05:module23:module2"))
  androidTestImplementation(project(":module06:module05:module26:module2"))
  androidTestImplementation(project(":module06:module06:module2"))
  androidTestImplementation(project(":module06:module08:module2"))
  androidTestImplementation(project(":module06:module10:module1"))
  androidTestImplementation(project(":module06:module11:module1"))
  androidTestImplementation(project(":module06:module14:module2"))
  androidTestImplementation(project(":module06:module16:module09"))
  androidTestImplementation(project(":module06:module19:module1:module2"))
  androidTestImplementation(project(":module06:module19:module2:module2"))
  androidTestImplementation(project(":module07:module001:module3"))
  androidTestImplementation(project(":module07:module014:module3"))
  androidTestImplementation(project(":module07:module015:module2"))
  androidTestImplementation(project(":module07:module022:module1:module2"))
  androidTestImplementation(project(":module07:module022:module2:module3"))
  androidTestImplementation(project(":module07:module022:module3:module4"))
  androidTestImplementation(project(":module07:module022:module4:module2"))
  androidTestImplementation(project(":module07:module022:module5:module4"))
  androidTestImplementation(project(":module07:module022:module7:module3"))
  androidTestImplementation(project(":module07:module022:module8:module3"))
  androidTestImplementation(project(":module07:module025:module4"))
  androidTestImplementation(project(":module07:module032:module5"))
  androidTestImplementation(project(":module07:module041:module5"))
  androidTestImplementation(project(":module07:module048:module4"))
  androidTestImplementation(project(":module07:module050:module4"))
  androidTestImplementation(project(":module07:module052:module4"))
  androidTestImplementation(project(":module07:module053:module3"))
  androidTestImplementation(project(":module07:module058:module2"))
  androidTestImplementation(project(":module07:module059:module3"))
  androidTestImplementation(project(":module07:module061:module3"))
  androidTestImplementation(project(":module07:module057:module6"))
  androidTestImplementation(project(":module07:module062:module3"))
  androidTestImplementation(project(":module07:module063:module5"))
  androidTestImplementation(project(":module07:module065:module5"))
  androidTestImplementation(project(":module07:module076:module2"))
  androidTestImplementation(project(":module07:module084:module2"))
  androidTestImplementation(project(":module07:module086:module4"))
  androidTestImplementation(project(":module07:module088:module3"))
  androidTestImplementation(project(":module07:module087:module5"))
  androidTestImplementation(project(":module07:module094:module1"))
  androidTestImplementation(project(":module07:module104"))
  androidTestImplementation(project(":module07:module125:module4"))
  androidTestImplementation(project(":module07:module135:module4"))
  androidTestImplementation(project(":module07:module147:module3"))
  androidTestImplementation(project(":module07:module148:module08"))
  androidTestImplementation(project(":module07:module160:module1"))
  androidTestImplementation(project(":module07:module166:module1"))
  androidTestImplementation(project(":module07:module176:module5"))
  androidTestImplementation(project(":module07:module190:module3"))
  androidTestImplementation(project(":module07:module195:module02:module4:module05"))
  androidTestImplementation(project(":module07:module195:module02:module5:module5"))
  androidTestImplementation(project(":module07:module195:module02:module7:module5"))
  androidTestImplementation(project(":module07:module195:module02:module8:module5"))
  androidTestImplementation(project(":module07:module195:module03:module2"))
  androidTestImplementation(project(":module07:module195:module05:module4:module3"))
  androidTestImplementation(project(":module07:module195:module10:module1:module5"))
  androidTestImplementation(project(":module07:module195:module10:module2:module3"))
  androidTestImplementation(project(":module07:module195:module10:module4:module2"))
  androidTestImplementation(project(":module07:module208:module4"))
  androidTestImplementation(project(":module07:module211:module4"))
  androidTestImplementation(project(":module07:module212:module4"))
  androidTestImplementation(project(":module07:module220:module7"))
  androidTestImplementation(project(":module07:module221:module1:module5"))
  androidTestImplementation(project(":module07:module221:module2:module4"))
  androidTestImplementation(project(":module07:module224:module4"))
  androidTestImplementation(project(":module07:module226:module4"))
  androidTestImplementation(project(":module07:module231:module3"))
  androidTestImplementation(project(":module07:module237:module4"))
  androidTestImplementation(project(":module07:module242:module3"))
  androidTestImplementation(project(":module07:module243:module5"))
  androidTestImplementation(project(":module07:module244:module3"))
  androidTestImplementation(project(":module07:module253:module2"))
  androidTestImplementation(project(":module07:module263:module4"))
  androidTestImplementation(project(":module07:module267:module3"))
  androidTestImplementation(project(":module07:module271:module4"))
  androidTestImplementation(project(":module07:module277:module2"))
  androidTestImplementation(project(":module07:module280:module3"))
  androidTestImplementation(project(":module07:module282:module4"))
  androidTestImplementation(project(":module07:module304:module5"))
  androidTestImplementation(project(":module07:module307:module4"))
  androidTestImplementation(project(":module07:module308:module2"))
  androidTestImplementation(project(":module07:module302:module1"))
  androidTestImplementation(project(":module07:module302:module4"))
  androidTestImplementation(project(":module07:module310:module3"))
  androidTestImplementation(project(":module07:module317:module1"))
  androidTestImplementation(project(":module07:module322:module05:module3"))
  androidTestImplementation(project(":module07:module322:module04:module4"))
  androidTestImplementation(project(":module07:module322:module08:module4"))
  androidTestImplementation(project(":module07:module322:module09:module2"))
  androidTestImplementation(project(":module07:module327:module3"))
  androidTestImplementation(project(":module07:module333:module4"))
  androidTestImplementation(project(":module07:module339:module3"))
  androidTestImplementation(project(":module07:module351:module4"))
  androidTestImplementation(project(":module07:module363:module4"))
  androidTestImplementation(project(":module07:module364:module4"))
  androidTestImplementation(project(":module07:module361:module4"))
  androidTestImplementation(project(":module07:module371:module2"))
  androidTestImplementation(project(":module07:module404:module1:module2"))
  androidTestImplementation(project(":module07:module416:module1"))
  androidTestImplementation(project(":module07:module427:module2"))
  androidTestImplementation(project(":module07:module428:module2"))
  androidTestImplementation(project(":module07:module429:module4"))
  androidTestImplementation(project(":module07:module439:module3"))
  androidTestImplementation(project(":module07:module452:module3"))
  androidTestImplementation(project(":module07:module472:module2"))
  androidTestImplementation(project(":module07:module476:module3"))
  androidTestImplementation(project(":module07:module485:module5"))
  androidTestImplementation(project(":module07:module490:module4"))
  androidTestImplementation(project(":module07:module497:module5"))
  androidTestImplementation(project(":module07:module503:module3"))
  androidTestImplementation(project(":module07:module509:module1"))
  androidTestImplementation(project(":module07:module526:module1:module3"))
  androidTestImplementation(project(":module07:module526:module3:module3"))
  androidTestImplementation(project(":module07:module536:module3"))
  androidTestImplementation(project(":module07:module538:module1"))
  androidTestImplementation(project(":module07:module547:module4"))
  androidTestImplementation(project(":module08:module02:module3"))
  androidTestImplementation(project(":module08:module05:module3"))
  androidTestImplementation(project(":module08:module11:module01:module1:module4"))
  androidTestImplementation(project(":module08:module11:module01:module3:module2"))
  androidTestImplementation(project(":module08:module11:module01:module4:module2"))
  androidTestImplementation(project(":module08:module11:module01:module5:module3"))
  androidTestImplementation(project(":module08:module11:module01:module6:module3"))
  androidTestImplementation(project(":module08:module11:module01:module7:module4"))
  androidTestImplementation(project(":module08:module11:module02:module3"))
  androidTestImplementation(project(":module08:module11:module06:module3"))
  androidTestImplementation(project(":module08:module11:module07:module3"))
  androidTestImplementation(project(":module08:module11:module09:module2"))
  androidTestImplementation(project(":module08:module11:module10:module3"))
  androidTestImplementation(project(":module08:module11:module11:module4"))
  androidTestImplementation(project(":module08:module11:module13:module3"))
  androidTestImplementation(project(":module08:module11:module16:module3"))
  androidTestImplementation(project(":module08:module11:module15:module2:module3"))
  androidTestImplementation(project(":module08:module11:module15:module3:module3"))
  androidTestImplementation(project(":module08:module11:module15:module4:module2"))
  androidTestImplementation(project(":module08:module11:module18:module1:module3"))
  androidTestImplementation(project(":module08:module11:module18:module2:module3"))
  androidTestImplementation(project(":module08:module11:module20:module2"))
  androidTestImplementation(project(":module08:module14:module3"))
  androidTestImplementation(project(":module08:module22:module3"))
  androidTestImplementation(project(":module08:module27:module2"))
  androidTestImplementation(project(":module08:module28:module3"))
  androidTestImplementation(project(":module08:module29:module2"))
  androidTestImplementation(project(":module08:module31:module3"))
  androidTestImplementation(project(":module08:module33:module3"))
  androidTestImplementation(project(":module08:module36:module4"))
  androidTestImplementation(project(":module08:module40:module3"))
  androidTestImplementation(project(":module08:module46:module2"))
  androidTestImplementation(project(":module08:module51:module3"))
  androidTestImplementation(project(":module08:module61:module5"))
  androidTestImplementation(project(":module08:module62:module3"))
  androidTestImplementation(project(":module10:module4"))
  androidTestImplementation(project(":module11"))
  androidTestImplementation(project(":module14:module2:module3"))
  androidTestImplementation(project(":module15:module2"))
  androidTestImplementation(project(":module16:module075:module1"))
  androidTestImplementation(project(":module18:module10:module6:module2"))
  androidTestImplementation("androidx.annotation:annotation:1.2.0")
  androidTestImplementation("androidx.test.espresso:espresso-contrib:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
  androidTestImplementation("androidx.test.espresso:espresso-idling-resource:3.3.0")
  androidTestImplementation("androidx.test.ext:junit:1.1.3")
  androidTestImplementation("androidx.test:rules:1.4.0")
  androidTestImplementation("androidx.test:runner:1.4.0")
  androidTestImplementation("com.google.truth:truth:1.1.3")
  androidTestImplementation("junit:junit:4.13.2")
  androidTestImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.7.20")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation(project(":module03:module09:module6"))
  implementation(project(":module07:module313:module2"))
  implementation("org.jetbrains.kotlin:kotlin-bom:1.7.20")
}
