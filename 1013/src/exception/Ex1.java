package exception;

import java.util.Random;

public class Ex1 {

	
	public static void main(String[] args) {
	
		//우리가 지금까지 봤더 예외들(런타임 에러)
		
		//nullPointerException
		//String str = null;		
		//System.out.println(str.substring(1));//예외가 뜨면 비정상적 종료로 인해 다음 코드가 작동 안됨
		
		//ArrayIndexOutOfBountsException, NegativeArraySizeException
		//int[] iArr = new int[-1];
		//System.out.println(iArr[4]);
		
		//StringIndexOutOfBoundException
		//String str = "123";
		//System.out.println(str.substring(5));
		
		//NumberForException
		//int i =  Integer.parseInt("AAA");
		
		//ClassNotFoundException
		//Class.forName("asdfasdf");
		
		
		//ClassCastException 
		//Object obj = new String("test");
		//Ex1 e = (Ex1)obj;


	}//main end
	
	
}//Ex1 end
