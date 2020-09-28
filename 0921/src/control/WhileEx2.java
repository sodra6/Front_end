package control;

import java.util.Scanner;

public class WhileEx2 {
public static void main(String[] args) {
	
	//while문으로 2단출력
	Scanner scan = new Scanner(System.in);
	System.out.println("단을 입력하세요.");
	int num = scan.nextInt();
	
	int i = 1;
	while(i<10) {
		System.out.println(num+"*"+i+"="+num*i++);
	}//while end
	
}//main end
}
