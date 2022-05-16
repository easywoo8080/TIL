
# day04

	## JSP 방식 

		- 관례적으로 webapp\WEB-INF\views 폴더 안에 jsp파일(html 뷰파일)을 저장하고 관리하며
			controller를 이용한다

		---

		- pom.xml에 추가 할 코드
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
		
		---

		- controller 설정 방식

			``` @RequestMapping("/")
				public ModelAndView main(ModelAndView mv){
					mv.addObject("center", "center");
					mv.setViewName("main");
					return mv;
				}```
			
			- 위와 같은 방식으로 파일을 연결
			- servlet(JSP) 해석과 관련된 모든 패키지를 포함하여 war로 압축됨
			- 무거움

		---
		
		- src\main\resources\application.properrties 파일 안에 아래 코드 추가

			server.port=80
			spring.mvc.view.prefix=/WEB-INF/views/
			spring.mvc.view.suffix=.jsp