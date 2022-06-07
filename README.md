# ClipboardHealth_Amazon
Single Automation framework to automate web, mobile and api

Features:

Factory Design Pattern
Dockerization
Supports Web, Mobile, Local and Remote Executions
HTML Reports with Base64 Screencapture
Page Object Model (POM)

How to start?
Clone the repository and below are few dependencies which are required for the project to run:

Maven 3.8.1 or greater (preferably Maven 3.8.1)

Java 8 or 11 or higher (preferably Java 11)

Docker latest

Step by step actions

Required dependencies:

      <dependencies>
        <!-- https://mvnrepository.com/artifact/com.machinezoo.noexception/noexception -->
        <dependency>
            <groupId>com.machinezoo.noexception</groupId>
            <artifactId>noexception</artifactId>
            <version>${noexception.version}</version>
        </dependency>
        <dependency>
            <groupId>org.aeonbits.owner</groupId>
            <artifactId>owner</artifactId>
            <version>${owner.version}</version>
        </dependency>
        <dependency>
            <groupId>org.awaitility</groupId>
            <artifactId>awaitility</artifactId>
            <version>${awaitility.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.appium/java-client -->
        <dependency>
            <groupId>io.appium</groupId>
            <artifactId>java-client</artifactId>
            <version>${appium.java.version}</version>
        </dependency>
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>${extentreport.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
        <dependency>
            <groupId>io.rest-assured</groupId>
            <artifactId>rest-assured</artifactId>
            <version>${restassured.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations -->
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>${jackson.version}</version>
        </dependency>
        <dependency>
            <groupId>io.github.sskorol</groupId>
            <artifactId>test-data-supplier</artifactId>
            <version>${testdatasupplier.version}</version>
        </dependency>
        <dependency>
            <groupId>org.assertj</groupId>
            <artifactId>assertj-core</artifactId>
            <version>${assertjcore.version}</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>${testng.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>${webdrivermanager.version}</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>${selenium.version}</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>${lombok.version}</version>
        </dependency>
        <dependency>
            <groupId>com.github.javafaker</groupId>
            <artifactId>javafaker</artifactId>
            <version>${javafaker.version}</version>
        </dependency>
    </dependencies>
Jar dependencies version:

  <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
        <owner.version>1.0.12</owner.version>
        <appium.java.version>8.0.0</appium.java.version>
        <extentreport.version>5.0.9</extentreport.version>
        <restassured.version>5.0.1</restassured.version>
        <jackson.version>2.13.3</jackson.version>
        <testdatasupplier.version>1.9.7</testdatasupplier.version>
        <assertjcore.version>3.22.0</assertjcore.version>
        <testng.version>7.5</testng.version>
        <webdrivermanager.version>5.1.1</webdrivermanager.version>
        <selenium.version>4.1.4</selenium.version>
        <lombok.version>1.18.24</lombok.version>
        <javafaker.version>1.0.2</javafaker.version>
        <awaitility.version>4.2.0</awaitility.version>
        <noexception.version>1.8.0</noexception.version>

To Run the project
To see the output, just run below command and make sure that all prerequisites with regards to dependencies are completed

mvn dependency:resolve
-AND-
mvn install
-OR-
mvn package

Creating a docker image
The above command builds image for the dockerfile specified in the root project directory

docker build -t mydockerimage .

