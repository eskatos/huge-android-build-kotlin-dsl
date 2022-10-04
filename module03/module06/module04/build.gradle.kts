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
  api(project(":module01:module12:module2"))
  api(project(":module03:module06:module02"))
  api(project(":module03:module06:module08"))
  api(project(":module05:module01:module1"))
  api(project(":module05:module03:module1"))
  api(project(":module05:module11:module1"))
  api(project(":module05:module11:module3"))
  api(project(":module05:module14:module08"))
  api(project(":module05:module18:module1"))
  api(project(":module05:module20:module1"))
  api(project(":module05:module19:module2"))
  api(project(":module05:module24:module2"))
  api(project(":module05:module26:module4"))
  api(project(":module05:module28:module2"))
  api(project(":module05:module29:module4"))
  api(project(":module05:module30:module3"))
  api(project(":module05:module30:module7"))
  api(project(":module05:module31:module2"))
  api(project(":module05:module31:module5"))
  api(project(":module05:module39:module1"))
  api(project(":module05:module37:module1"))
  api(project(":module06:module01:module1"))
  api(project(":module06:module05:module01:module1"))
  api(project(":module06:module05:module02:module1"))
  api(project(":module06:module05:module03:module1"))
  api(project(":module06:module05:module04:module2"))
  api(project(":module06:module05:module05:module4"))
  api(project(":module06:module05:module06:module1"))
  api(project(":module06:module05:module07:module1"))
  api(project(":module06:module05:module09:module1"))
  api(project(":module06:module05:module08:module1"))
  api(project(":module06:module05:module10:module1"))
  api(project(":module06:module05:module12:module1"))
  api(project(":module06:module05:module14:module1"))
  api(project(":module06:module05:module13:module1"))
  api(project(":module06:module05:module15:module2"))
  api(project(":module06:module05:module16:module1"))
  api(project(":module06:module05:module17:module1"))
  api(project(":module06:module05:module18:module1"))
  api(project(":module06:module05:module19:module2"))
  api(project(":module06:module05:module20:module1"))
  api(project(":module06:module05:module21:module1"))
  api(project(":module06:module05:module21:module3"))
  api(project(":module06:module05:module22:module1"))
  api(project(":module06:module05:module24:module2"))
  api(project(":module06:module05:module25:module1"))
  api(project(":module06:module05:module23:module1"))
  api(project(":module06:module05:module26:module1"))
  api(project(":module06:module06:module1"))
  api(project(":module06:module07:module2"))
  api(project(":module06:module09:module1"))
  api(project(":module06:module12:module1"))
  api(project(":module06:module13:module1"))
  api(project(":module06:module14:module3"))
  api(project(":module06:module15:module1"))
  api(project(":module06:module16:module08"))
  api(project(":module06:module17:module2"))
  api(project(":module06:module19:module1:module1"))
  api(project(":module06:module19:module2:module1"))
  api(project(":module06:module19:module3:module1"))
  api(project(":module06:module20:module1"))
  api(project(":module07:module001:module2"))
  api(project(":module07:module002:module1"))
  api(project(":module07:module004:module1"))
  api(project(":module07:module007:module1"))
  api(project(":module07:module007:module2"))
  api(project(":module07:module009:module2"))
  api(project(":module07:module010:module1"))
  api(project(":module07:module005:module5"))
  api(project(":module07:module005:module6"))
  api(project(":module07:module011:module4"))
  api(project(":module07:module013:module3"))
  api(project(":module07:module014:module1"))
  api(project(":module07:module015:module1"))
  api(project(":module07:module018:module2"))
  api(project(":module07:module022:module3:module3"))
  api(project(":module07:module022:module5:module3"))
  api(project(":module07:module016:module3"))
  api(project(":module07:module023:module3:module1"))
  api(project(":module07:module023:module4:module2"))
  api(project(":module07:module024:module2"))
  api(project(":module07:module024:module3"))
  api(project(":module07:module025:module5"))
  api(project(":module07:module030:module1:module2"))
  api(project(":module07:module031:module1"))
  api(project(":module07:module032:module4"))
  api(project(":module07:module032:module6"))
  api(project(":module07:module033:module1"))
  api(project(":module07:module035:module1"))
  api(project(":module07:module036:module1"))
  api(project(":module07:module038:module4"))
  api(project(":module07:module039:module3"))
  api(project(":module07:module040:module4"))
  api(project(":module07:module041:module3"))
  api(project(":module07:module037:module5"))
  api(project(":module07:module045:module3"))
  api(project(":module07:module047:module1"))
  api(project(":module07:module049:module2"))
  api(project(":module07:module050:module3"))
  api(project(":module07:module052:module3"))
  api(project(":module07:module054:module4"))
  api(project(":module07:module056:module2"))
  api(project(":module07:module065:module6"))
  api(project(":module07:module066:module1"))
  api(project(":module07:module069:module1"))
  api(project(":module07:module070"))
  api(project(":module07:module072:module2"))
  api(project(":module07:module074:module2"))
  api(project(":module07:module076:module3"))
  api(project(":module07:module077:module4"))
  api(project(":module07:module080:module1"))
  api(project(":module07:module081:module2"))
  api(project(":module07:module082:module1"))
  api(project(":module07:module084:module1"))
  api(project(":module07:module088:module2"))
  api(project(":module07:module087:module4"))
  api(project(":module07:module089:module4"))
  api(project(":module07:module090:module4"))
  api(project(":module07:module091:module3"))
  api(project(":module07:module093:module6"))
  api(project(":module07:module097:module1"))
  api(project(":module07:module096:module1"))
  api(project(":module07:module103:module1"))
  api(project(":module07:module107:module1"))
  api(project(":module07:module109:module1"))
  api(project(":module07:module108:module1"))
  api(project(":module07:module108:module3"))
  api(project(":module07:module110:module1"))
  api(project(":module07:module106:module4"))
  api(project(":module07:module111:module1"))
  api(project(":module07:module115:module1"))
  api(project(":module07:module117:module1"))
  api(project(":module07:module118:module2"))
  api(project(":module07:module121:module4"))
  api(project(":module07:module125:module3"))
  api(project(":module07:module129:module1"))
  api(project(":module07:module130:module2"))
  api(project(":module07:module131:module1"))
  api(project(":module07:module133:module5"))
  api(project(":module07:module136:module1"))
  api(project(":module07:module141:module2"))
  api(project(":module07:module144:module2"))
  api(project(":module07:module146:module2"))
  api(project(":module07:module147:module7"))
  api(project(":module07:module148:module09"))
  api(project(":module07:module148:module11"))
  api(project(":module07:module153:module3"))
  api(project(":module07:module150:module1"))
  api(project(":module07:module154:module3"))
  api(project(":module07:module154:module5"))
  api(project(":module07:module157:module1"))
  api(project(":module07:module160:module2"))
  api(project(":module07:module163:module2"))
  api(project(":module07:module167:module1"))
  api(project(":module07:module171:module3"))
  api(project(":module07:module171:module6"))
  api(project(":module07:module174:module2"))
  api(project(":module07:module174:module4"))
  api(project(":module07:module175:module1"))
  api(project(":module07:module176:module2"))
  api(project(":module07:module176:module4"))
  api(project(":module07:module179:module2"))
  api(project(":module07:module180:module1"))
  api(project(":module07:module185:module1"))
  api(project(":module07:module185:module3"))
  api(project(":module07:module188:module1"))
  api(project(":module07:module190:module2"))
  api(project(":module07:module189:module3"))
  api(project(":module07:module195:module01:module1"))
  api(project(":module07:module195:module02:module1:module1"))
  api(project(":module07:module195:module02:module2:module1"))
  api(project(":module07:module195:module02:module3:module2"))
  api(project(":module07:module195:module02:module4:module03"))
  api(project(":module07:module195:module02:module5:module3"))
  api(project(":module07:module195:module02:module6:module1"))
  api(project(":module07:module195:module02:module7:module3"))
  api(project(":module07:module195:module02:module9:module1"))
  api(project(":module07:module195:module02:module8:module3"))
  api(project(":module07:module195:module03:module1"))
  api(project(":module07:module195:module04:module2"))
  api(project(":module07:module195:module05:module1:module2"))
  api(project(":module07:module195:module05:module3:module1"))
  api(project(":module07:module195:module05:module4:module2"))
  api(project(":module07:module195:module05:module5:module2"))
  api(project(":module07:module195:module07:module1"))
  api(project(":module07:module195:module09:module2"))
  api(project(":module07:module195:module10:module1:module3"))
  api(project(":module07:module195:module10:module2:module1"))
  api(project(":module07:module195:module10:module3:module5"))
  api(project(":module07:module195:module10:module4:module1"))
  api(project(":module07:module196:module2"))
  api(project(":module07:module197:module2"))
  api(project(":module07:module198:module2"))
  api(project(":module07:module199:module2"))
  api(project(":module07:module200:module2"))
  api(project(":module07:module201:module1"))
  api(project(":module07:module204:module1"))
  api(project(":module07:module208:module2"))
  api(project(":module07:module211:module2"))
  api(project(":module07:module212:module2"))
  api(project(":module07:module214:module2"))
  api(project(":module07:module213:module5"))
  api(project(":module07:module216:module4"))
  api(project(":module07:module218:module1"))
  api(project(":module07:module220:module8"))
  api(project(":module07:module221:module1:module3"))
  api(project(":module07:module221:module2:module3"))
  api(project(":module07:module221:module3:module3"))
  api(project(":module07:module224:module2"))
  api(project(":module07:module225:module2"))
  api(project(":module07:module226:module2"))
  api(project(":module07:module228:module3"))
  api(project(":module07:module229:module3:module2"))
  api(project(":module07:module229:module9:module1"))
  api(project(":module07:module236:module1"))
  api(project(":module07:module237:module5"))
  api(project(":module07:module242:module2"))
  api(project(":module07:module243:module3"))
  api(project(":module07:module244:module2"))
  api(project(":module07:module245:module1"))
  api(project(":module07:module240:module2"))
  api(project(":module07:module247:module1"))
  api(project(":module07:module253:module1"))
  api(project(":module07:module254:module2"))
  api(project(":module07:module256:module4"))
  api(project(":module07:module258:module1"))
  api(project(":module07:module260:module3"))
  api(project(":module07:module263:module2"))
  api(project(":module07:module264:module3"))
  api(project(":module07:module264:module5"))
  api(project(":module07:module265:module1"))
  api(project(":module07:module267:module2"))
  api(project(":module07:module270:module2"))
  api(project(":module07:module271:module2"))
  api(project(":module07:module272:module1"))
  api(project(":module07:module273:module2"))
  api(project(":module07:module278:module2"))
  api(project(":module07:module281:module1"))
  api(project(":module07:module282:module2"))
  api(project(":module07:module285:module4"))
  api(project(":module07:module289:module1"))
  api(project(":module07:module290:module2"))
  api(project(":module07:module293:module1"))
  api(project(":module07:module292:module2"))
  api(project(":module07:module294:module3"))
  api(project(":module07:module295:module1"))
  api(project(":module07:module297:module2"))
  api(project(":module07:module301:module3"))
  api(project(":module07:module300:module2"))
  api(project(":module07:module304:module2"))
  api(project(":module07:module304:module3"))
  api(project(":module07:module306:module1"))
  api(project(":module07:module307:module2"))
  api(project(":module07:module302:module5"))
  api(project(":module07:module318:module1"))
  api(project(":module07:module321:module1"))
  api(project(":module07:module322:module05:module2"))
  api(project(":module07:module322:module04:module2"))
  api(project(":module07:module322:module06:module1"))
  api(project(":module07:module322:module07:module1"))
  api(project(":module07:module322:module08:module2"))
  api(project(":module07:module322:module09:module1"))
  api(project(":module07:module322:module10:module1"))
  api(project(":module07:module322:module11:module1"))
  api(project(":module07:module320:module5"))
  api(project(":module07:module326:module1"))
  api(project(":module07:module327:module2"))
  api(project(":module07:module327:module4"))
  api(project(":module07:module332:module2"))
  api(project(":module07:module335:module1"))
  api(project(":module07:module336:module1"))
  api(project(":module07:module339:module2"))
  api(project(":module07:module345:module5"))
  api(project(":module07:module347:module1"))
  api(project(":module07:module348:module4"))
  api(project(":module07:module349:module2"))
  api(project(":module07:module349:module3"))
  api(project(":module07:module351:module3"))
  api(project(":module07:module350:module05"))
  api(project(":module07:module346:module1"))
  api(project(":module07:module358:module3"))
  api(project(":module07:module360:module2"))
  api(project(":module07:module362:module2"))
  api(project(":module07:module363:module3"))
  api(project(":module07:module364:module3"))
  api(project(":module07:module361:module3"))
  api(project(":module07:module370:module2"))
  api(project(":module07:module372:module3"))
  api(project(":module07:module373:module2"))
  api(project(":module07:module374:module2"))
  api(project(":module07:module375:module2"))
  api(project(":module07:module376:module1:module3"))
  api(project(":module07:module376:module1:module4"))
  api(project(":module07:module377:module1"))
  api(project(":module07:module378:module3"))
  api(project(":module07:module381:module1"))
  api(project(":module07:module382:module2"))
  api(project(":module07:module384:module1"))
  api(project(":module07:module387:module1"))
  api(project(":module07:module389:module3"))
  api(project(":module07:module390:module2"))
  api(project(":module07:module393:module1"))
  api(project(":module07:module396:module1"))
  api(project(":module07:module395:module1"))
  api(project(":module07:module398:module2"))
  api(project(":module07:module403:module1:module2"))
  api(project(":module07:module403:module1:module4"))
  api(project(":module07:module403:module2:module2"))
  api(project(":module07:module403:module4:module1"))
  api(project(":module07:module406:module3"))
  api(project(":module07:module404:module1:module1"))
  api(project(":module07:module411:module2"))
  api(project(":module07:module413:module1"))
  api(project(":module07:module415:module3"))
  api(project(":module07:module416:module2"))
  api(project(":module07:module416:module3"))
  api(project(":module07:module417:module2"))
  api(project(":module07:module420:module1"))
  api(project(":module07:module421:module4"))
  api(project(":module07:module422:module1"))
  api(project(":module07:module424:module1"))
  api(project(":module07:module427:module1"))
  api(project(":module07:module428:module3"))
  api(project(":module07:module430:module3"))
  api(project(":module07:module432:module1"))
  api(project(":module07:module437:module1"))
  api(project(":module07:module439:module2"))
  api(project(":module07:module440:module4"))
  api(project(":module07:module443:module1"))
  api(project(":module07:module444:module2"))
  api(project(":module07:module448:module3"))
  api(project(":module07:module449:module1"))
  api(project(":module07:module450:module2"))
  api(project(":module07:module452:module2"))
  api(project(":module07:module457:module2"))
  api(project(":module07:module456:module1"))
  api(project(":module07:module458:module2"))
  api(project(":module07:module455:module1"))
  api(project(":module07:module460:module1"))
  api(project(":module07:module459:module1"))
  api(project(":module07:module461:module1"))
  api(project(":module07:module463:module1"))
  api(project(":module07:module472:module1"))
  api(project(":module07:module477:module3"))
  api(project(":module07:module478:module3"))
  api(project(":module07:module479:module1"))
  api(project(":module07:module476:module2"))
  api(project(":module07:module468:module2"))
  api(project(":module07:module481:module4"))
  api(project(":module07:module483:module3"))
  api(project(":module07:module485:module3"))
  api(project(":module07:module488:module3"))
  api(project(":module07:module489:module1"))
  api(project(":module07:module490:module2"))
  api(project(":module07:module495:module1"))
  api(project(":module07:module497:module3"))
  api(project(":module07:module502:module1"))
  api(project(":module07:module501:module1"))
  api(project(":module07:module504:module2"))
  api(project(":module07:module503:module2"))
  api(project(":module07:module503:module4"))
  api(project(":module07:module506:module1"))
  api(project(":module07:module511:module1"))
  api(project(":module07:module509:module2"))
  api(project(":module07:module512:module4"))
  api(project(":module07:module514:module3"))
  api(project(":module07:module515:module3"))
  api(project(":module07:module517:module2"))
  api(project(":module07:module520:module1"))
  api(project(":module07:module525:module1"))
  api(project(":module07:module526:module1:module2"))
  api(project(":module07:module526:module2:module1"))
  api(project(":module07:module526:module3:module2"))
  api(project(":module07:module527"))
  api(project(":module07:module528:module1"))
  api(project(":module07:module531:module1"))
  api(project(":module07:module535:module1"))
  api(project(":module07:module537:module2"))
  api(project(":module07:module542:module1"))
  api(project(":module07:module543:module2"))
  api(project(":module07:module544:module2"))
  api(project(":module07:module545:module1"))
  api(project(":module07:module547:module2"))
  api(project(":module07:module553:module1"))
  api(project(":module07:module562:module1"))
  api(project(":module08:module02:module2"))
  api(project(":module08:module03:module1"))
  api(project(":module08:module05:module4"))
  api(project(":module08:module06:module1"))
  api(project(":module08:module12:module09:module3"))
  api(project(":module08:module12:module11:module2"))
  api(project(":module08:module12:module14:module3"))
  api(project(":module08:module11:module01:module7:module3"))
  api(project(":module08:module11:module14:module3:module3"))
  api(project(":module08:module14:module2"))
  api(project(":module08:module15:module1"))
  api(project(":module08:module18:module1"))
  api(project(":module08:module19:module1"))
  api(project(":module08:module21:module1"))
  api(project(":module08:module20:module1"))
  api(project(":module08:module20:module2"))
  api(project(":module08:module22:module2"))
  api(project(":module08:module23:module1"))
  api(project(":module08:module25:module2:module2"))
  api(project(":module08:module25:module4:module1"))
  api(project(":module08:module25:module5:module1"))
  api(project(":module08:module25:module3:module2"))
  api(project(":module08:module29:module1"))
  api(project(":module08:module31:module2"))
  api(project(":module08:module36:module3"))
  api(project(":module08:module38:module02:module1"))
  api(project(":module08:module38:module04:module4"))
  api(project(":module08:module38:module05:module2"))
  api(project(":module08:module38:module05:module6"))
  api(project(":module08:module38:module06:module1"))
  api(project(":module08:module38:module07:module1"))
  api(project(":module08:module38:module09:module1"))
  api(project(":module08:module38:module11:module1"))
  api(project(":module08:module38:module12:module1"))
  api(project(":module08:module38:module13:module4"))
  api(project(":module08:module38:module15:module1"))
  api(project(":module08:module38:module16:module1"))
  api(project(":module08:module38:module16:module2"))
  api(project(":module08:module39:module1"))
  api(project(":module08:module41:module3"))
  api(project(":module08:module42:module2"))
  api(project(":module08:module42:module3"))
  api(project(":module08:module42:module5"))
  api(project(":module08:module44:module2"))
  api(project(":module08:module44:module4"))
  api(project(":module08:module51:module2"))
  api(project(":module08:module55:module2"))
  api(project(":module08:module60:module2"))
  api(project(":module08:module61:module6"))
  api(project(":module10:module1"))
  api(project(":module10:module3:module1"))
  api(project(":module14:module2:module1"))
  api(project(":module14:module3:module2"))
  api(project(":module14:module4:module1"))
  api(project(":module14:module6:module2"))
  api(project(":module14:module8:module2"))
  api(project(":module18:module04:module2:module1"))
  api(project(":module19:module1:module01:module1"))
  api(project(":module19:module1:module02:module1"))
  api(project(":module19:module1:module03:module1"))
  api(project(":module19:module1:module04:module1"))
  api(project(":module19:module1:module07:module1"))
  api(project(":module19:module1:module08:module1"))
  api(project(":module19:module1:module09:module2"))
  api(project(":module19:module1:module10:module2"))
  api(project(":module19:module1:module11:module2"))
  api(project(":module19:module1:module14:module2"))
  api(project(":module19:module1:module15:module2"))
  api(project(":module19:module1:module16:module2"))
  api(project(":module19:module1:module18:module1"))
  api(project(":module19:module1:module19:module2"))
  api(project(":module19:module1:module20:module1"))
  api(project(":module19:module1:module22:module1"))
  api(project(":module19:module1:module21:module2"))
  api(project(":module19:module1:module24:module1"))
  api(project(":module19:module1:module26:module1"))
  api(project(":module19:module2:module01:module1"))
  api(project(":module19:module2:module01:module2"))
  api(project(":module19:module2:module02:module1"))
  api(project(":module19:module2:module03:module1"))
  api(project(":module19:module2:module05:module1"))
  api(project(":module19:module2:module04:module2"))
  api(project(":module19:module2:module08:module1"))
  api(project(":module19:module2:module07:module2"))
  api(project(":module19:module2:module10:module1"))
  api(project(":module19:module2:module10:module2"))
  api(project(":module19:module2:module10:module3"))
  api(project(":module19:module2:module11:module1"))
  api(project(":module19:module2:module09:module2"))
  api(project(":module19:module2:module12:module2"))
  api(project(":module19:module2:module14:module2"))
  api(project(":module19:module2:module15:module1"))
  api(project(":module19:module2:module18:module4"))
  api(project(":module19:module2:module19:module1"))
  api(project(":module19:module2:module20:module2"))
  api(project(":module19:module2:module22:module1"))
  api(project(":module19:module2:module21:module1"))
  api(project(":module19:module2:module23:module3"))
  api(project(":module19:module2:module24:module2"))
  api(project(":module19:module2:module24:module3"))
  api(project(":module19:module2:module26:module1"))
  api(project(":module19:module2:module27:module1"))
  api(project(":module19:module2:module28:module1"))
  api(project(":module19:module2:module30:module1"))
  api(project(":module19:module2:module29:module1"))
  api(project(":module19:module2:module31:module1"))
  api(project(":module19:module2:module33:module1"))
  api(project(":module19:module2:module32:module1"))
  api(project(":module19:module2:module32:module2"))
  api(project(":module19:module2:module36:module1"))
  api(project(":module19:module2:module35:module1"))
  api(project(":module19:module2:module37:module1"))
  api(project(":module19:module2:module34:module4"))
  api(project(":module19:module2:module38:module1"))
  api(project(":module19:module2:module39:module1"))
  api(project(":module19:module2:module41:module1"))
  api(project(":module19:module2:module43:module1"))
  api(project(":module19:module2:module44:module2"))
  api(project(":module19:module2:module45:module2"))
  api(project(":module19:module2:module46:module1"))
  api(project(":module19:module2:module47:module3"))
  api(project(":module19:module4:module1"))
  api("com.google.dagger:dagger:2.39.1")
  compileOnly("androidx.annotation:annotation:1.2.0")
  implementation("org.jetbrains.kotlin:kotlin-bom:1.6.10")
}
