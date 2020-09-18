package example;

import java.util.Scanner;

public class SelfEx3 {
public static void main(String[] args) {
	System.out.println("단을 입력하세요(2~9)");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	for(int i=1; i<10; ++i) {
		System.out.println(num+"*"+i+"="+i*num);
	}
}
}
