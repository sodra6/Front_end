package control;

import java.util.Scanner;

public class ControlEx1 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("당신의 나이는?");
	int age = scan.nextInt();
	String msg="";
	if(age>=20) {
		msg="입";
	}else {
		msg="이 아닙";
	}//if~else end
	System.out.println("당신은 성인"+msg+"니다.");
	
	//만약 나이가 20살이상이면 당신은 성인입니다
	//20살 미만이면 당신은 성인이 아닙니다.
}//main() end
}//ContralEx1 end
