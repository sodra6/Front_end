package example;

import java.util.Scanner;

public class SelfEx2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수 2개를 입력하세요.");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	String a = num1>num2?"true":"false";
	System.out.println(num1+">"+num2+"="+a);
}
}
