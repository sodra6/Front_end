package exception;

import java.util.Random;

public class Ex2 {

	/*
	 * try{
	 * 예외가 발생할 가능성이 있는 구문
	 * }catch(Exception e){
	 * 예외가 발생했을떄 수행할 구문
	 * }
	 */
	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		for(int i =0; i<100; i++) {

			int num = ran.nextInt(5);
			
			try {
			System.out.println(i+") "+5/num);
			}catch(Exception e) {
				System.out.println(i+")번에서 0번");
			}//try~catch end
			
		}//for end
		
		
	}// main end
	
	
}//Ex2 end
