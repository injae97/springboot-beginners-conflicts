## 💡 SpringBoot-Beginners
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
* 맨위에  .msi로 다운 후 실행 진행 후 > cmd > java -version
```    
   
## 💡 Oracle DB Download
    a. https://www.oracle.com/kr/database/technologies/xe-downloads.html
        - OS에 맞게 설치 > setup.exe > DB PWD Setting
        * DB ID : SYS, SYSTEM 고정
        
    b. DBeaver 설치
        - Database : xe
            
## 💡 Spring Tool Suite Project Create
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

## 💡 How to add dependency in springboot?
    - https://start.spring.io/
    a. Project(Gradle, Maven 중 선택), Language(Java), Spring Boot Version 2.7.8 선택 
    b. 이제 여기서 dependency 할 것을 ADD DEPENDNECIES 클릭 후 입력(e.g MyBatis Framework)
        - EXPLORE > build.gradle > dependencies - implementation에 있는 implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0' 복사하여 사용
        
        