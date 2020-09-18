package control;

import java.util.Scanner;

public class ControlEx2 {
public static void main(String[] args) {
	
	System.out.println("☆★☆★ 학점 계산기 ver0.99★☆★☆");
	
	Scanner scan = new Scanner(System.in);
	

	System.out.println("당신의 점수를 입력하세요.(0~100)");
	int score = scan.nextInt();
	char grade='F';
	if(score>90) {
		grade='A';
	}else if(score>80) {
		grade='B';
	}else if(score>70) {
		grade='C';
	}else if(score>60) {
		grade='D';
	}//if~else if end
	System.out.println("당신의 학점은 "+grade+"입니다.");

	
	
	/*
	 * 만약 입력한 점수가 100~91점이면 A
	 * 90~81이면 B
	 * 80~71점이면 C
	 * 70~61점이면 D학점
	 * 60학점 이하는 F
	 */
	
	
	
	
/*	if(조건식1) {
		조건식 1이 true일경우
	}
	else if(조건식2) {
		조건식 2가 true일 경우
	}
	else if(조건식3) {
		조건식 3이 true일 경우
	}
	else{
		조건식 전부 false일 경우
	}
*/
}
}
