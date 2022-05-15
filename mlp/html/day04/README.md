
# day04
## JSP 방식 

	- 관례적으로 webapp\WEB-INF\views 폴더 안에 jsp파일(html 뷰파일)을 저장하고 관리하며
		controller를 이용한다

		``` @RequestMapping("/")
			public ModelAndView main(ModelAndView mv){
				mv.addObject("center", "center");
				mv.setViewName("main");
				return mv;
			}```
		
		- 위와 같은 방식으로 파일을 연결
		- servlet(JSP) 해석과 관련된 모든 패키지를 포함하여 war로 압축됨
		- 무거움