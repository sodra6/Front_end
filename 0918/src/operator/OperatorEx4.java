package operator;

public class OperatorEx4 {
public static void main(String[] args) {
	
/*
 * 삼항연산자
 * 
 *  변수 = 논리값 ? 값1 : 값2;
 * 
 * 논리값이 true면 값1이 변수에 대입, 논리값이 false면 값2가 변수에 대입
 * 
 */
	
	int a = 3==5 ? 3 : 7;
	System.out.println(a);
	
	int b = 0;
	
	if(3==5) {
		b=4;
	}else {
		b=7;
	}//if~else end
	System.out.println(b);
	
}//main() end
}//OperatorEx4 end
