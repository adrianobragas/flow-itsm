plugins {
    alias(libs.plugins.spring.boot) apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
