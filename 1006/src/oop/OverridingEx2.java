package oop;

public class OverridingEx2 {

	public static void main(String[] args) {
		
		
		Object o = new String("TEST");
		Object o2 = new String("TEST");
		
		System.out.println(o.equals(o2));
		
		String s = new String("TEST");
		String s2= new String("TEST");
		System.out.println(s.equals(s2));
		
	}//main() end
	
	
}//OverridingEx2 end
