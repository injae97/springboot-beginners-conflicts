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

## 💡 MariaDB  Download
    a. https://mariadb.org/download
        - OS에 맞게 설치 > MariaDB Server Version: 10.10.2 > Download
        - mariadb-10.10.2-winx64 실행 
            * DB ID, PASSWORD : root > use UTF 8 as default server's character set 체크 > Next
            * Port: Mysql(3306) 과 동일 하므로 3307로 설정 후 > install
        
    b. HeidiSQL 실행
        a. HeidiSQL 설정
            - 세션 이름: Springboot-Admin
            - 네트워크 유형: MariaDB or MySQL(TCP/IP)
            - 호스트명 / IP: 127.0.0.1
            - 사용자: root
            - 암호: root
            - 포트: 3307

        b. 데이터베이스 생성
            - Springboot-Admin에 오른쪽 마우스 > 새로 생성 > 데이터베이스 생성 
                - 이름: boot
                - 조합: utf8mb4_general_ci 
        
        c. 해당 데이터베이스 접근 권한 설정
            - 사용자 인증 및 권한 관리 클릭(사람 모양) 
                - 사용자 계정 추가 > 사용자 이름, 암호: boot, 호스트에서: localhost
                - 객체 추가: 아까 만들어 놓은 데이터베이스: boot > 접근 허용 권한 체크 > 저장 > 닫기 
                
        d. 생성한 계정으로 데이터베이스 접속
            - 세션 이름: Springboot-boot
            - 네트워크 유형: MariaDB or MySQL(TCP/IP)
            - 호스트명 / IP: 127.0.0.1
            - 사용자: boot
            - 암호: boot
            - 포트: 3307
            * 데이터베이스: boot
    
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