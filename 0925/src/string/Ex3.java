package string;

import java.util.Scanner;
public class Ex3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 이메일을 입력하세요~!");
	
		String email = scan.nextLine();
		//입력받음
		int idx = email.indexOf("@");
		String id = email.substring(0,idx);

		//이메일중 아이디만 추출하여 출력
		System.out.println("당신의 아이디는 "+id+" 입니다.");
	}
}
