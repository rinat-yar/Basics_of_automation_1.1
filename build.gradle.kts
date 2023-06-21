plugins {
    id ("java")
}

group "ru.netology"
version "1.0-SNAPSHOT"


repositories {
    mavenCentral()
}

dependencies {
<<<<<<< HEAD

    testImplementation("org.testng:testng:7.1.0")

=======
    testImplementation ("junit:junit:4.13")
>>>>>>> 310207b17e3a4c9a9a97dce479b4159cfc26d4b8
}

tasks.test {
    useJUnit()
}


