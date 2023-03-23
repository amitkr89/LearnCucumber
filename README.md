# LearnCucumber
#pom.xml for mvn project

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>test</groupId>
  <artifactId>SeleniumJavaCucumber</artifactId>
  <version>0.0.1-SNAPSHOT</version>

 <build>
  	<plugins>
  	 <plugin>
		<groupId>org.apache.maven.plugins</groupId>
		<artifactId>maven-compiler-plugin</artifactId>
		<version>3.5.1</version>
			<configuration>
				<source>1.7</source>
				<target>1.7</target>
			</configuration>
	</plugin>
  	</plugins>
  </build>

  	<properties>
    	<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    	<maven.compiler.target>1.7</maven.compiler.target>
    	<maven.compiler.source>1.7</maven.compiler.source>
    	<JAVA_1_7_HOME>D:\EclipseProject\JAVA\JAVA_1.7</JAVA_1_7_HOME>
	</properties>
  <dependencies>
	  <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.8.1</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.30</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.sikulix/sikulixapi -->
		<dependency>
    		<groupId>com.sikulix</groupId>
    		<artifactId>sikulixapi</artifactId>
    		<version>2.0.4</version>
		</dependency>
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi</artifactId>
			<version>3.6</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml-schemas -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml-schemas</artifactId>
			<version>3.6</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
		<dependency>
			<groupId>org.apache.poi</groupId>
			<artifactId>poi-ooxml</artifactId>
			<version>3.6</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
		<dependency>
    		<groupId>io.cucumber</groupId>
    		<artifactId>cucumber-java</artifactId>
    		<version>7.11.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
		<dependency>
    		<groupId>io.cucumber</groupId>
    		<artifactId>cucumber-testng</artifactId>
    		<version>7.11.1</version>
		</dependency>
		<dependency>
    		<groupId>net.masterthought</groupId>
    		<artifactId>cucumber-reporting</artifactId>
    		<version>5.7.5</version>
    	</dependency>
		<dependency>
    		<groupId>org.apache.logging.log4j</groupId>
    		<artifactId>log4j-api</artifactId>
    		<version>2.20.0</version>
  		</dependency>
  		<dependency>
    		<groupId>org.apache.logging.log4j</groupId>
    		<artifactId>log4j-core</artifactId>
    		<version>2.20.0</version>
  		</dependency>
		<dependency>
  			<groupId>org.apache.maven.plugins</groupId>
  			<artifactId>maven-compiler-plugin</artifactId>
  			<version>3.11.0</version>
  			<type>maven-plugin</type>
		</dependency>
        <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
		<dependency>
    		<groupId>com.aventstack</groupId>
    		<artifactId>extentreports</artifactId>
    		<version>5.0.9</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter -->
		<dependency>
    		<groupId>tech.grasshopper</groupId>
    		<artifactId>extentreports-cucumber7-adapter</artifactId>
    		<version>1.10.1</version>
		</dependency>
		<dependency>
			<groupId>stuff</groupId>
			<artifactId>library</artifactId>
			<version>1.0</version>
			<systemPath>D:\EclipseProject\Eclipse_WorkSpace\SeleniumJavaCucumber\Library\ShineXLS.jar</systemPath>
			<scope>system</scope>
		</dependency>
		<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
		<dependency>
    		<groupId>commons-io</groupId>
    		<artifactId>commons-io</artifactId>
    		<version>2.11.0</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.assertthat/selenium-shutterbug -->
		<dependency>
    		<groupId>com.assertthat</groupId>
    		<artifactId>selenium-shutterbug</artifactId>
    		<version>1.6</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/com.vimalselvam/cucumber-extentsreport -->
		<dependency>
    		<groupId>com.vimalselvam</groupId>
    		<artifactId>cucumber-extentsreport</artifactId>
    		<version>3.1.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/junit/junit -->
		<dependency>
		    <groupId>junit</groupId>
		    <artifactId>junit</artifactId>
		    <version>4.13.2</version>
		    <scope>test</scope>
		</dependency>



  </dependencies>

</project>
