object Versions {
    const val androidxCore = "1.8.0"
    const val compose = "1.3.0-beta01"
    const val activity = "1.5.1"
    const val material = "1.0.0-beta01"
    const val lifecycle = "2.5.1"
}

object BuildPlugins {
//    val android by lazy { "com.android.tools.build:gradle:${Versions.gradlePlugin}" }
//    val kotlin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}" }
}

object Dependencies {
    // androidx
    val androidxCore by lazy { "com.androidx.core:core-ktx:${Versions.androidxCore}" }
    // compose
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val composePreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:${Versions.compose}" }
    val composeMaterial by lazy { "androidx.compose.material3:material3:${Versions.compose}" }
    val composeActivity by lazy { "androidx.activity:activity-compose:${Versions.activity}" }
    // lifecycle
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" }

}