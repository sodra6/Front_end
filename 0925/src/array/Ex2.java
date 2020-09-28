package array;

public class Ex2 {

	public static void main(String[] args) {
		String a="A";
		String b=new String("A");
		String[] s = new String[3];
		
		s[0] =a;
		b=s[1];
		s[2]="A";
		//s[3]="B";
		System.out.println(s[0]==s[1]);
		System.out.println(s[1]==s[2]);
		System.out.println(s[2]==s[0]);
		System.out.println(a==b);
		System.out.println(s[0].equals(s[1]));
		//System.out.println(s[1].equals(s[2]));
		System.out.println(s[2].equals(s[0]));
	}
}
