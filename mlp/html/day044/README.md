
# day044~47
## thymeleaf 방식 

	- SpringBoot는 가볍고 독립적인 실행을 목표로 기존의 JSP방식보다 thymeleaf 방식을 권장함
		- JavaApplication과 웹 구동이 가능한 템플릿 엔진(Template Engine)이라는 HTML 데이터를 결합시켜 처리(https://sidepower.tistory.com/145)// ??



	- pom.xml에 아래 코드를 추가
		
		```<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>```
		
	- 이 구성에선 webapp\WEB-INF\views 구조를 사용하지 않으며 templates에 html파일로 뷰파일을 생성한다.
	- controller는 아래 방식으로 작성한다.
		```@Controller
		public class MainController {
			
			@RequestMapping("/")
			public String main(Model m){   
				return "main";
			}
			@RequestMapping("/html5")
			public String html5(Model m){
				m.addAttribute("center", "html5");
				return "main";
			}

		}```
		