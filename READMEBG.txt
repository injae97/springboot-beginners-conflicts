## ๐ก SpringBoot-Beginners Env
    - Framework: Spring boot
    - View: Thymeleaf
    - DBMS: MariaDB
    - Mapper: MyBatis
    - IDE: Spring Tool Suite
    
## ๐ก Spring Tool Suite Download 
https://github.com/spring-projects/sts4/wiki/Previous-Versions

    - ์ปจํธ๋กค + F > Spring Tools 4.13.1 > spring-tool-suite-4-4.13.1.RELEASE-e4.22.0-win32.win32.x86_64.zip
    
## ๐ก OpenJDK 1.8 Download
```java
- https://www.openlogic.com/openjdk-downloads?field_java_parent_version_target_id=416&field_operating_system_target_id=436&field_architecture_target_id=391&field_java_package_target_id=396
- Java Version: 8
- OPERATING SYSTEM: Windows
- ARCHITECTURE: x86 64-bit
- JAVA PACKAGE: JDK
* ๋งจ์์ .msi๋ก ๋ค์ด ํ ์คํ ์งํ ํ > cmd > java -version
```    

## ๐ก DB Download(MariaDB, Oracle)
    a. MariaDB 
        a. https://mariadb.org/download
            - OS์ ๋ง๊ฒ ์ค์น > MariaDB Server Version: 10.10.2 > Download
            - mariadb-10.10.2-winx64 ์คํ 
                * DB ID, PASSWORD : root > use UTF 8 as default server's character set ์ฒดํฌ > Next
                * Port: Mysql(3306) ๊ณผ ๋์ผ ํ๋ฏ๋ก 3307๋ก ์ค์  ํ > install
            
        b. HeidiSQL ์คํ
            a. HeidiSQL ์ค์ 
                - ์ธ์ ์ด๋ฆ: Springboot-Admin
                - ๋คํธ์ํฌ ์ ํ: MariaDB or MySQL(TCP/IP)
                - ํธ์คํธ๋ช / IP: 127.0.0.1
                - ์ฌ์ฉ์: root
                - ์ํธ: root
                - ํฌํธ: 3307

            b. ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์ฑ
                - Springboot-Admin์ ์ค๋ฅธ์ชฝ ๋ง์ฐ์ค > ์๋ก ์์ฑ > ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์ฑ 
                    - ์ด๋ฆ: boot
                    - ์กฐํฉ: utf8mb4_general_ci 
            
            c. ํด๋น ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ ๊ทผ ๊ถํ ์ค์ 
                - ์ฌ์ฉ์ ์ธ์ฆ ๋ฐ ๊ถํ ๊ด๋ฆฌ ํด๋ฆญ(์ฌ๋ ๋ชจ์) 
                    - ์ฌ์ฉ์ ๊ณ์  ์ถ๊ฐ > ์ฌ์ฉ์ ์ด๋ฆ, ์ํธ: boot, ํธ์คํธ์์: localhost
                    - ๊ฐ์ฒด ์ถ๊ฐ: ์๊น ๋ง๋ค์ด ๋์ ๋ฐ์ดํฐ๋ฒ ์ด์ค: boot > ์ ๊ทผ ํ์ฉ ๊ถํ ์ฒดํฌ > ์ ์ฅ > ๋ซ๊ธฐ 
                    
            d. ์์ฑํ ๊ณ์ ์ผ๋ก ๋ฐ์ดํฐ๋ฒ ์ด์ค ์ ์
                - ์ธ์ ์ด๋ฆ: Springboot-boot
                - ๋คํธ์ํฌ ์ ํ: MariaDB or MySQL(TCP/IP)
                - ํธ์คํธ๋ช / IP: 127.0.0.1
                - ์ฌ์ฉ์: boot
                - ์ํธ: boot
                - ํฌํธ: 3307
                * ๋ฐ์ดํฐ๋ฒ ์ด์ค: boot
    
    b. Oracle DB
        a. https://www.oracle.com/kr/database/technologies/xe-downloads.html
            - OS์ ๋ง๊ฒ ์ค์น > setup.exe > DB PWD Setting
            * DB ID : SYS, SYSTEM ๊ณ ์ 
            
        b. DBeaver ์ค์น
            - Database : xe

## ๐ก How to add dependency in springboot?
    - https://start.spring.io/
        a. Project(Gradle, Maven ์ค ์ ํ), Language(Java), Spring Boot Version 2.7.8 ์ ํ 
        b. ์ด์  ์ฌ๊ธฐ์ dependency ํ  ๊ฒ์ ADD DEPENDNECIES ํด๋ฆญ ํ ์๋ ฅ(e.g MyBatis Framework)
            - EXPLORE > build.gradle > dependencies - implementation์ ์๋ implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0' 
 
## ๐ก SpringBoot-Beginners Project Start !!!        
    a. ํ๋ก์ ํธ ์์ฑ 
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
                  
                  
    b. application.properties ์ค์ 
        # port setting
        server.port = 8080

        # Thymeleaf
        spring.thymeleaf.prefix=classpath:/templates
        spring.thymeleaf.suffix=.html
        spring.thymeleaf.cache=false

        # devtools reload(html, jsp)
        spring.devtools.livereload.enabled=true
        spring.devtools.restart.enabled=false

        # MariaDB
        spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
        spring.datasource.url=jdbc:mariadb://localhost:3307/boot
        spring.datasource.username=boot
        spring.datasource.password=boot

        # Oracle
        #spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
        #spring.datasource.url=jdbc:oracle:thin:@localhost:1521
        #spring.datasource.username=SYSTEM
        #spring.datasource.password=PASSWORD
         
        # Mybatis
        #mybatis.mapper-locations=classpath:sqlmapper/*.xml
        #mybatis.configuration.map-underscore-to-camel-case=true
        #mybatis.type-aliases-package=com.spring.boot.dto
    
    
    c.  ์๋ฐ๋จ - ํจํค์ง ์์ฑ(Controller, Service, Vo, dao)
        - /Sailing/src/main/java/com/boot/sailing/controller        
        - /Sailing/src/main/java/com/boot/sailing/service          
        - /Sailing/src/main/java/com/boot/sailing/vo                         
        - /Sailing/src/main/java/com/boot/sailing/dao(interface)
        * ๊ฐ Html ํ์ผ๋ง๋ค controller ์์ฑ(HomeCon, MemberCon, MenuCon, OrderCon - class)  


    d.  ํ๋ฉด๋จ - templates ๋ด์ ํจํค์ง ์์ฑ(home, member, menu, order)
        - /src/main/resources/templates/home   
        - /src/main/resources/templates/member         
        - /src/main/resources/templates/menu                    
        - /src/main/resources/templates/order
        * ํ๋ฉด๋จ ํ์ผ๋ค์ ํด๋๊ฐ ์๋ ํจํค์ง์ ๋ฃ์ด์ผํจ(ํด๋๋ก ์์ฑํด์ ๋ฃ์ ์ ํธ์ถ ๋ถ๊ฐ)  
        * ๊ฐ ํจํค์ง ์์ html ์์ฑ(home.html, member.html, menu.html, order.html)
        
## ๐ก How to set @Log4j2 in STS Using Gradle?
    a. dependency ์ถ๊ฐ
        - /Sailing/build.gradle
            implementation('org.slf4j:jcl-over-slf4j')
            implementation('ch.qos.logback:logback-classic')
    
    b. logback-spring.xml ์์ฑ
        - /src/main/resources/logback-spring.xml    
			<?xml version="1.0" encoding="UTF-8"?>
			<configuration>
				<appender name="console" class="ch.qos.logback.core.ConsoleAppender">
					<encoder>
						<Pattern>[%d{yyyy-MM-dd HH:mm:ss}:%-3relative] [%thread] %-5level %logger{36} - %msg%n</Pattern>
					</encoder>
				</appender>

				<!-- Logback ์ 5๋จ๊ณ์ ๋ก๊ทธ ๋ ๋ฒจ์ ๊ฐ์ง๋ค.
					์ฌ๊ฐ๋ ์์ค์ off > Error > Warn > Info > Debug > Trace ์ด๋ค.
				-->
				
				<!-- name์ package ์ด๋ฆ -->
				<logger name="com.boot.sailing" level="Info"/>
				<root level="Debug">
					<appender-ref ref="console"/>
				</root>
			</configuration>
    
    c. Project and External Dependencies 
        - ํ๋ก์ ํธ ๋ด์ Project and External Dependencies > lombok-1.18.24jar > Run As > Java Application > Proceed > Install / Update > Finish > Restart
        * Project > Clean > Restart

## ๐ก How to set utf-8 in STS?
    - Project ํด๋ฆญ > Alt + Enter > Resource > Text file encoding(Other: UTF-8) > Apply and close 
    
## ๐ก ํ๋ฉด ์ฐ๊ฒฐ ํ๋ฆ(View - html)    
    - ํด๋ผ์ด์ธํธ(Chrome) > request > Controller(์๋ด์) > View(.html) > response > ํด๋ผ์ด์ธํธ(Chrome)
    
    a. Controller ์ค์  
        - Sailing/src/main/java/com/boot/sailing/controller/HomeCon.java
  
            @Controller
            public class HomeCon {

                // URL์์ localhost/home๋ก ๋ค์ด์ค๋ฉด
                @GetMapping("/home")
                public String doHome() {
                    return "/home/home"; // template > home > home.html ํ๋ฉด์ ๋ณด์ฌ์ค
                }
            }
        
    b. html ์ค์ 
        - /Sailing/src/main/resources/templates/home/home.html
            - <a href="/home/home.html">Home</a> ๐ <a href="/home">Home</a> ๋ณ๊ฒฝ
                    
## ๐ก ๋ฐ์ดํฐ ์ฐ๊ฒฐ ํ๋ฆ(Backend ๐ View(Thymeleaf)์ ๋ฐ์ดํฐ ์ฃผ๊ธฐ)    
    - ํด๋ผ์ด์ธํธ(Chrome) > request > Controller(์๋ด์) > Data, Model > View(Thymeleaf) > 
        response > ํด๋ผ์ด์ธํธ(Chrome)

    a. MenuCon.java
        @GetMapping("/menu")
            public String doHome(Model model) {

            // Data Create - List, Map
            List<Map<String, Object>> list = new ArrayList<>();
            Map<String, Object> map = new HashMap<>();

            map.put("no", "1");
            map.put("coffee", "์์ด์ค์๋ฉ๋ฆฌ์นด๋ธ");
            map.put("kind", "์ปคํผ");
            map.put("price", "5,000");
            map.put("reg_day", "2020.10.29");
            map.put("mod_day", "2021.10.29");
            list.add(map);

            // Data ์ ์ก - Model
            model.addAttribute("list", list);
            model.addAttribute("hello", "========== MenuCon ==========");

            return "/menu/menu"; 
        }    
    
    b. Thymeleaf - Menu.html
        * <html lang="ko"  xmlns:th="http://www.thymeleaf.org">
            
        a. variable import 
            - <h3>[ Coffee menu Management <span style="font-size:30px;">&#9749;</span> ] <th:block th:text="${hello}"></th:block>  </h3>

        b. for loop
            <!--MenuCon์ list์ ๋ฃ์ ๊ฐ์ ํธ์ถ -->
            <!-- Thymeleaf - for loop -->      
            <tr th:each="prod : ${list}">
                <td>Chk</td>
                <td th:text="${prod.get('no')}">์ปคํผNo</th>
                <td th:text="${prod.get('coffee')}">๋ฉ๋ด๋ช</td>
                <td th:text="${prod.get('kind')}">์ข๋ฅ</td>
                <td th:text="${prod.get('price')}">๊ฐ๊ฒฉ</td>
                <td th:text="${prod.get('reg_day')}">๋ฑ๋ก์ผ</td>
                <td th:text="${prod.get('mod_day')}">์์ ์ผ</td>
                <td>์์ </td>
                <td>์ญ์ </td>
            </tr>
            
## ๐ก ๋ฐ์ดํฐ ์ฐ๊ฒฐ ํ๋ฆ - DI/Ioc(Controller > Service)    
    - ํด๋ผ์ด์ธํธ(Chrome) > request > Controller(์๋ด์) > Service(๋ก๊ทธ์ธ ์ฒ๋ฆฌ, ์ค์  ์๋ฌด์ฒ๋ฆฌ) > Controller(์๋ด์)
    
    a. Controller
        - /src/main/java/com/boot/sailing/controller/MenuCon.java
        
            @Autowired
            MenuSvc menuSvc;
            
            @GetMapping("/menu")
            public String doMenu(Model model) {

                // List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java์์ ์๋ก์ด ๊ฐ์ฒด๋ฅผ ์์ฑํ์ฌ doList ๋ฉ์๋ ํธ์ถ 
                List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc์ @Service๋ก Bean์ ๋ฑ๋กํ ๊ฒ์ ์ฃผ์(Injection)์ ํตํด ์ฌ์ฉ

                model.addAttribute("list", list);
                model.addAttribute("hello", "========== MenuCon ==========");

                return "/menu/menu"; 
            }  
            
    * Controller์์ ๋ง๋ค์๋ ์๋ฌด ๋ก์ง์ Service๋ก ๋บ
    
    b. Service
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            package com.boot.sailing.service;

            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Map;

            import org.springframework.stereotype.Service;

            import lombok.extern.log4j.Log4j2;

            @Service 
            @Log4j2
            public class MenuSvc {
                
                public MenuSvc() {
                    log.info("================ MenuSvc , ์์ฑ์ ===================");
                }
                
                // Data Create - List, Map
                public List<Map<String, Object>> doList() {
                    List<Map<String, Object>> list = new ArrayList<>();
                    Map<String, Object> map = new HashMap<>();

                    map.put("no", "1");
                    map.put("coffee", "์์ด์ค์๋ฉ");
                    map.put("kind", "์ปคํผ");
                    map.put("price", "5,000");
                    map.put("reg_day", "2020.10.29");
                    map.put("mod_day", "2021.10.29");
                    list.add(map);

                    Map<String, Object> map2 = new HashMap<>();

                    map2.put("no", "2");
                    map2.put("coffee", "์นดํธ์น๋ธ");
                    map2.put("kind", "์ปคํผ");
                    map2.put("price", "6,000");
                    map2.put("reg_day", "2020.10.29");
                    map2.put("mod_day", "2021.10.29");
                    list.add(map2);
                    
                    Map<String, Object> map3 = new HashMap<>();

                    map3.put("no", "3");
                    map3.put("coffee", "์นดํธ์น๋ธ");
                    map3.put("kind", "์ปคํผ");
                    map3.put("price", "6,000");
                    map3.put("reg_day", "2020.10.29");
                    map3.put("mod_day", "2021.10.29");
                    list.add(map3);
                    
                    log.info(list);

                    return list;
                }
            }
            
                            
## ๐ก ๋ฐ์ดํฐ๋ฒ ์ด์ค DB ์ฐ๋(Controller > Service > Dao > DBMS(MariaDB))
    - ํด๋ผ์ด์ธํธ(Chrome) > request > Controller(์๋ด์) > Service(๋ก๊ทธ์ธ ์ฒ๋ฆฌ, ์ค์  ์๋ฌด์ฒ๋ฆฌ) >  Dao(Data ์ฒ๋ฆฌ) > DBMS(MyBatis - MariaDB)
    
    a. Service
        - /src/main/java/com/boot/sailing/service/MenuSvc.java
        
            @Autowired
            MenuDao menuDao;
            
            public List<Map<String, Object>> doList() {

                List<Map<String, Object>> list = menuDao.doList();
                
                log.info(list);
                return list;    
            }
    
    b. Dao    
        - /src/main/java/com/boot/sailing/dao/MenuDao.java
        
            package com.boot.sailing.dao;

            import java.util.List;
            import java.util.Map;

            import org.apache.ibatis.annotations.Mapper;

            @Mapper
            public interface MenuDao {

                List<Map<String, Object>> doList();
            }
    
    c. sqlmapper
        - /src/main/resources/sqlmapper/CoffeeMenu.xml
        
            <?xml version="1.0" encoding="UTF-8" ?>
            <!DOCTYPE mapper
              PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
              "https://mybatis.org/dtd/mybatis-3-mapper.dtd">
              
            <!-- namespace = Dao ์์น -->  
            <mapper namespace="com.boot.sailing.dao.MenuDao">

                <!-- ๋ฉ๋ด ์กฐํ -->
                <!-- id๋ Dao์ ๋ฉ์๋ ์ด๋ฆ: doList -->
                <!-- resultType๋ Dao์ type: map -->
                <!-- List<Map<String, Object>> doList(); ์์ type์ map -->
                <select id="doList" resultType="map">
                    SELECT no, coffee, kind, price,
                        DATE_FORMAT(reg_day, '%Y-%m-%d') AS reg_day,
                        DATE_FORMAT(mod_day, '%Y-%m-%d') AS mod_day
                        FROM coffee_menu;
                </select>
              
            </mapper>
            
    * application.yml
        - /src/main/resources/application.yml
        
            # Configuration mybatis
            mybatis:
              mapper-locations: sqlmapper/**/*.xml
              configuration: 
                map-underscore-to-camel-case: true
                
    * build.gradle
        - implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.0'