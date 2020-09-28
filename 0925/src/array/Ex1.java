package array;

public class Ex1 {
	
	
	/*
	 * 
	 */

	
	public static void main(String[] args) {
		
//				↓↓↓↓↓↓배열 쓰는방법↓↓↓↓↓
		int[] a=new int[3];//배열이란 [] -> !!! '객체자료형' !!! heap영역에 생성
		int b=5;
		a[1]=3;
		a[2]=b;
		//a[3]=7; 배열의 범위를 넘어가면 exception 에러발생
		int[] c= {1,2,3};// -> 초기화까지 같이하는것
		System.out.println(a[2]);
	}//main() end
	
	
}//Ex1 end
