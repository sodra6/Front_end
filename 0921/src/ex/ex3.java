package ex;

import java.util.Scanner;

public class ex3 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("단을 입력하세요");
	int dan = scan.nextInt();
	
	for(int i=1	;i<10;i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
	}//
	
	
}//main end
}//ex3 end
