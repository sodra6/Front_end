package exception;

public class Ex4 {

	public static void main(String[] args) {
	
		
	
		System.out.println(1);
		try {
		System.out.println(2/0);
		System.out.println(3);
		} catch (ArithmeticException e) {
		System.out.println(4);
		} catch (Exception e) {
		System.out.println(5);
		}//try~catch end
		System.out.println(6);
		
	}//main end
	
}//Ex4 end
