# html

6. pom.xml 추가

        ```xml
		<!-- @Inject -->
		<dependency>
			<groupId>javax.inject</groupId>
			<artifactId>javax.inject</artifactId>
			<version>1</version>
		</dependency>
		<!-- Servlet -->

		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
			<scope>provided</scope>
		</dependency>


		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.0.1</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
			<version>1.2</version>
		</dependency>
		
		<!-- json request -->   

		<dependency>
			<groupId>com.googlecode.json-simple</groupId>
			<artifactId>json-simple</artifactId>
			<version>1.1</version>
  		</dependency>

        <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		```

9. src/main/resources 에 applications.properties 파일 수정 (반드시 메모장으로 열것)

	```applications.properties
	server.port=80
	spring.mvc.view.prefix=/WEB-INF/views/
	spring.mvc.view.suffix=.jsp       
	```





    - ModelAndView 기능



---

#ERROR

    1 Project 'multi' is missing required source folder: 'src/main/resources'
        - 존재하지 않는 파일이라 경로와 상관없는 파일을 찾을 때 
            - 캐쉬를 삭제 해준다. (VSC 처음 에러 문구가 나올때 오른쪽 하단에서 ?? 선택 후 화면 상단 위에서 캐쉬 삭제 창이 나오면 클릭)
