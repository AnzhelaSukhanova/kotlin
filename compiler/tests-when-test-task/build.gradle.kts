plugins {
    kotlin("jvm")
    id("jps-compatible")
}

dependencies {
    testImplementation(kotlinStdlib())

    testApiJUnit5()
    testImplementation(projectTests(":compiler:tests-common"))
    testImplementation(projectTests(":compiler:test-infrastructure"))
    testImplementation(projectTests(":compiler:tests-common-new"))
    testImplementation(projectTests(":compiler:fir:fir2ir"))
    testImplementation(projectTests(":compiler:fir:analysis-tests:legacy-fir-tests"))
    testImplementation(projectTests(":generators:test-generator"))
}

sourceSets {
    "main" {}
    "test" { projectDefault() }
}

val generateTests by generator("org.jetbrains.kotlin.test.generators.GenerateWhenTestsKt") {
    dependsOn(":compiler:generateTestData")
}

testsJar()
