plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.milktea"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.milktea"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation("com.google.firebase:firebase-analytics")
    implementation(platform("com.google.firebase:firebase-bom:34.3.0"))
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
    implementation("com.android.support:multidex:1.0.3")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:31.0.3"))
    implementation("com.google.firebase:firebase-database")
    implementation("com.google.firebase:firebase-auth")

    // Glide ImageLoader
    implementation("com.github.bumptech.glide:glide:4.12.0")

    // Circle Imageview
    implementation("de.hdodenhof:circleimageview:3.0.0")

    // Indicator
    implementation("me.relex:circleindicator:2.1.6")

    // MaterialDialog
    implementation("com.afollestad.material-dialogs:core:0.9.6.0")

    // Gson
    implementation("com.google.code.gson:gson:2.9.0")

    // EventBus
    implementation("org.greenrobot:eventbus:3.0.0")

    // Room database
    implementation("androidx.room:room-runtime:2.2.5")
    annotationProcessor("androidx.room:room-compiler:2.2.5")
}
