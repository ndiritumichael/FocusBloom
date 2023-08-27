plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.compose.desktop.plugin)
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":feature:settings"))
    implementation(project(":feature:statistics"))
    implementation(project(":feature:calendar"))
    implementation(project(":feature:home"))

    implementation(compose.desktop.currentOs)

    testImplementation(libs.kotlin.test)
    testImplementation(libs.turbine)
    testImplementation(libs.ktor.mock)
    testImplementation(libs.mockk)
    testImplementation(libs.kotlinX.coroutines.test)
}

compose.desktop {
    application {
        mainClass = "DesktopApplicationKt"
        nativeDistributions {
            targetFormats(org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi, org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb)
            packageName = "focusbloom"
            packageName = "1.0.0"
        }
    }
}