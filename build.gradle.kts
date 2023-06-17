plugins {
    id 'java'
}

group "ru.netology"
group "ru.netology.test"
version "1.0-SNAPSHOT"

sourceConpatibility = 11

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.testng:testng:7.3.0'
}

test {
    useTestNG()
}