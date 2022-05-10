package app;

import java.util.HashSet;
import java.util.Scanner;

import check.Check;
import create.Create;


public class App {
    

	public static void main(String[] args) throws Exception {
        System.out.println("Start ...");
		HashSet<Integer> ln = null;
		HashSet<Integer> uln = null;

		int max = 0;
		int num = 0;

		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("Input cmd(Create c, Insert i, Check ck, Quit q) ...");
				String cmd = sc.next();
				if(cmd.equals("q")) {
					System.out.println("Bye");
					break;
				}else if(cmd.equals("c")) {
					Create ct = new Create();	
					while(true){
						System.out.println("로또 번호의 최대값을 지정해주세요( 1부터 시작합니다. 최대 100 )");
						max = Integer.parseInt(sc.next()); 
						System.out.println("로또 번호의 갯수을 지정해주세요( 최대값보다 작아야 합니다. || 10 이하로 입력해주세요)");
						num = Integer.parseInt(sc.next()); 
						
						if( max < num || max > 100 || num > 10 ){
							System.out.println("입력에 오류가 있습니다. 다시 입력해주세요");
						}else{
							break;
						}
					}
					ln = ct.createMax(max, num);
					System.out.println("로또 번호 확인 : " + ln.toString());
		
				}else if(cmd.equals("i")) {
					if( ln == null ){
						System.out.println("Create를 먼저 해주세요");
						continue;
					}
					uln = new HashSet<Integer>();
					System.out.println("로또 번호를 입력해주세요.( 최대값 : " + max +"이하로 입력해주세요 )");
					for (int i = 0; i < num; i++) {
						System.out.println( (i+1) + "번째 입력입니다. " + (num-i-1) + "번 남았습니다.");
						if( !(uln.add(Integer.parseInt(sc.next()))) ){
							System.out.println("중복입니다 다시 입력해주세요.");
							i--;
						}
					}
				
				}else if(cmd.equals("ck")) {
					if( ln == null ){
						System.out.println("Create를 먼저 해주세요");
						continue;
					}else if( uln == null ){
						System.out.println("Insert를 먼저 해주세요");
						continue;
					}
					Check check = new Check();
					

					count = check.ck(ln, uln);
					System.out.println("lotto 번호는 : " + ln );
					System.out.println("입력한 번호는 : " + uln );
					System.out.println("맞은 갯수는 : " + count );

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sc.close();
			System.out.println("End ...");
		}
    }
}
