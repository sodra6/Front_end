package exception;

public class Ex3 {

	public static void main(String[] args) {
		
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(3/0);
		System.out.println(4);//예외가 발생하면 밑에있는건 작동하지 않음, try구문은 최대한 짧게
		}catch(Exception e) {//catch는 여러개 사용가능 에러마다 메소드의 인자로 넣으면됨
		//예외가 발생했을 때만 작동
		System.out.println(5);
		}//try~catch end
		System.out.println(6);
	}
}
