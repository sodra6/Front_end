package scanner;

import java.util.Scanner;

public class ScannerEx3 {
public static void main(String[] args) {
	
	
	//스캐너 객체 생성
	Scanner scanner = new Scanner(System.in);
	System.out.println("정수 2개 입력");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();
	System.out.println(num1+"+"+num2+"="+(num1+num2));
	
	
	
}//main()end
}//ScannerEx3 end
