package oop;

public class OverridingEx3 {

	
	public static void main(String[] args) {
		
		Object o = new String("TEST");
		String s = new String("TEST");
		
		System.out.println(o==s);
		System.out.println(s.equals(o));
	}
}
