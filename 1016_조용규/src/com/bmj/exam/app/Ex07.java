package com.bmj.exam.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex07 {

	
	public static void main(String[] args) {
		
		Random ran = new Random();
		//int[] iArr = new int[6];
		Set<Integer> integers = new TreeSet<>();
		System.out.println("★2020년 10월 17일 로또1등★");
		
			while(integers.size()<6) {
				Integer integer = ran.nextInt(45)+1;
				integers.add(integer.intValue());
			}//while end
			
			String string = new String();
			string = integers.toString();
			System.out.println(string.substring(1,string.length()-1));
			

//			for(int i=0; i<integers.size(); i++) {
//				if(i<integers.size()-1) {
//					System.out.print(", ");
//				}//if end
//			}//for end
//		
		
	}//main end
}
