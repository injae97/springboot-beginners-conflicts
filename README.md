## 💡 SpringBoot-Beginners Env
    - Framework: Spring boot
    - View: Thymeleaf
    - DBMS: MariaDB
    - Mapper: MyBatis
    - IDE: Spring Tool Suite
    
## 💡 Spring Tool Suite Download 
https://github.com/spring-projects/sts4/wiki/Previous-Versions

    - 컨트롤 + F > Spring Tools 4.13.1 > spring-tool-suite-4-4.13.1.RELEASE-e4.22.0-win32.win32.x86_64.zip
    
## 💡 OpenJDK 1.8 Download
```java
- https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396
- Java Version: 8
- OPERATING SYSTEM: Windows
- ARCHITECTURE: x86 64-bit
- JAVA PACKAGE: JDK
* 맨위에 .msi로 다운 후 실행 진행 후 > cmd > java -version
```    
   
## 💡 Oracle DB Download
    a. https://www.oracle.com/kr/database/technologies/xe-downloads.html
        - OS에 맞게 설치 > setup.exe > DB PWD Setting
        * DB ID : SYS, SYSTEM 고정
        
    b. DBeaver 설치
        - Database : xe
          

## 💡 How to add dependency in springboot?
    - https://start.spring.io/
        a. Project(Gradle, Maven 중 선택), Language(Java), Spring Boot Version 2.7.8 선택 
        b. 이제 여기서 dependency 할 것을 ADD DEPENDNECIES 클릭 후 입력(e.g MyBatis Framework)
            - EXPLORE > build.gradle > dependencies - implementation에 있는 implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0' 
			        
## 💡 SpringBoot-Beginners Project Start !!!		
	a. 프로젝트 생성 
    ```java
	- File > New > Spring Starter Project
		- Service URL: https://start.spring.io
		- Name: Sailing
		- Type: Gradle - Groovy 
		- Packaging: Jar
		- Java Version: 8
		- Language: Java
		- Group: com.boot
		- Artifact: Sailing
		- Version: 0.0.1-SNAPSHOT
		- Description: springboot-beginners
		- Package: com.boot.sailing
		
	- Dependencies
		- Spring Boot Version: 2.7.8
		- Available: Spring Web, Spring Boot DevTools, Lombok, MariaDB Driver, Thymeleaf > Finish
	```
			
	b.  자바단 - 폴더 생성 및 코드 작성 
		 a. controller 폴더 경로까지 생성
			- /src/main/java/com/example/WebTransition/controller
							
		b. service 폴더 생성
			- /src/main/java/com/example/WebTransition/service
			
		c. vo 폴더 생성
			- /src/main/java/com/example/WebTransition/vo
								
		d. DB 연결 폴더 생성
			- /src/main/java/com/example/WebTransition/comm
			
	c. 화면단 - 폴더 생성 및 코드 작성 
		a. view 폴더 경로까지 생성
			- /src/main/webapp/WEB-INF/view

		b. image 폴더 생성
			- /src/main/webapp/img

		c. index 페이지 생성
			- /src/main/webapp/index.html
								
	d. application.properties 설정
		# Configuration Port
		server.port=8080

		# Configuration Thymeleaf
		spring.thymeleaf.prefix=classpath:/templates
		spring.thymeleaf.suffix=.html
		spring.thymeleaf.cache=false

		# Configuration Devtools
		spring.devtools.livereload.enabled=true

		# Configuration MariaDb
		spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
		spring.datasource.url=jdbc:mariadb://localhost:3307/boot
		spring.datasource.username=boot
		spring.datasource.password=boot

		# Configuration mybatis
		# mybatis.mapper-locations=classpath:sqlmap/**/*.xml
		# mybatis.configuration.map-underscore-to-camel-case=true