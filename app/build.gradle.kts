import org.jetbrains.kotlin.kapt3.base.Kapt.kapt


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-kapt")
//    id("com.google.devtools.ksp")

}

android {
    namespace = "com.esj.farmrecordsapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.esj.farmrecordsapp"
        minSdk = 26
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    dataBinding{
        enable = true
    }
}

dependencies {


    val lifecycle_version = "2.6.1"
    val room_version = "2.5.2"



    // To use Kotlin annotation processing tool (kapt)
        // Room
    implementation ("androidx.room:room-runtime:$room_version")
//    ksp("androidx.room:room-compiler:2.5.0")
    kapt ("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")

    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")

    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("de.hdodenhof:circleimageview:3.1.0")
}



//plugins {
//    id ("com.android.application")
//    id ("org.jetbrains.kotlin.android")
//    id ("kotlin-kapt")
//}
//
//android {
//    namespace = "com.esj.farmrecordsapp"
//    compileSdk 33
//
//    defaultConfig {
//        applicationId "com.esj.farmrecordsapp"
//        minSdk 24
//        targetSdk 33
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }
//    }
//    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//                targetCompatibility JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = '1.8'
//    }
//    dataBinding{
//        enabled = true
//    }
//}
//
//dependencies {
//    val lifecycle_version = "2.6.1"
//    val room_version = "2.5.2"
////    def lifecycle_version = "2.6.0-alpha01"
////    def room_version = "2.4.3"
//
//    implementation ("androidx.core:core-ktx:1.10.1")
//    implementation ("androidx.appcompat:appcompat:1.6.1")
//    implementation ("com.google.android.material:material:1.9.0")
//    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
//
//    // ViewModel & LiveData
//
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
//    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
//    implementation ("androidx.lifecycle:lifecycle-common-java8:$lifecycle_version")
//    // Room
//    implementation ("androidx.room:room-runtime:$room_version")
//    kapt ("androidx.room:room-compiler:$room_version")
//    implementation ("androidx.room:room-ktx:$room_version")
//
//    //Coroutines
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
//
//    testImplementation ("junit:junit:4.13.2")
//
//    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
//    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
//    implementation ("de.hdodenhof:circleimageview:3.1.0")
//}