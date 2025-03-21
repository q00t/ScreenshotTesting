// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.android.library) apply false
}

allprojects {
    tasks.withType<Test>().configureEach {
        maxParallelForks = Runtime.getRuntime()?.availableProcessors()?.div(2) ?: 1
        forkEvery = 1
        reports.html.required = false
    }
}