package com.bmj.exam.app;

import java.util.Random;
import java.util.Set;

public class Ex07 {

	
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("★2020년 10월 17일 로또1등★");
		for(int i=1; i<7; i++) {
			int num = ran.nextInt(45)+1;
			
			System.out.println(num);
		}
		
	}
}
