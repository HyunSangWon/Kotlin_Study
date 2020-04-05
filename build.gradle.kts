import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	val kotlinVersion = "1.3.71"
	val springBootVersion = "2.2.6.RELEASE"

	id("org.springframework.boot") version springBootVersion
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	kotlin("jvm") version kotlinVersion
	kotlin("plugin.spring") version kotlinVersion
	application
}

group = "com.cntech"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
	jcenter()
}

application{
	applicationName = "study"
	group = "com.cntech"
	mainClassName = "com.cntech.study.StudyApplicationKt" // web.xml
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}
	// Thymeleaf
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	// Devtools
	compile("org.springframework.boot:spring-boot-devtools")
	// JPA
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	// MySQL
	runtimeOnly("mysql:mysql-connector-java")
	//DB MariaDB
	runtimeOnly("org.mariadb.jdbc:mariadb-java-client")
	//JDBC
	implementation("org.springframework.boot:spring-boot-starter-jdbc")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
