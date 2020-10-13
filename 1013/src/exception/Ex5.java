package exception;

public class Ex5 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(2/0);
		System.out.println(3);
		} catch (Exception e) {
		System.out.println(4);
		} finally {
			//예외가 발생하거나 발생하지 않더라도 무적권 작동
		System.out.println(5);
		}//try~catch~finally end
		System.out.println(6);
	}
}
