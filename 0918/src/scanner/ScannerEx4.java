package scanner;

import java.util.Scanner;

public class ScannerEx4 {
public static void main(String[] args) {
	
	//스캐너 객체 생성
	Scanner scan = new Scanner(System.in);	
	System.out.println("정수 3개입력!");
	
	int a= scan.nextInt();
	int b= scan.nextInt();
	int c= scan.nextInt();	
	System.out.println(a+"*"+b+"*"+c+"="+(a*b*c));
}
}
