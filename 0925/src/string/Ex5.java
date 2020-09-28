package string;

public class Ex5 {
private String str;

public Ex5() {
	this("Chupa Chups!");
	System.out.println("별");
}

public Ex5(String str) {
	this.str=str;
	System.out.println("원");
}
public void test(String str) {
	str ="Hello World";
}
public static void main(String[] args) {
	Ex5 ho =new Ex5();
	ho.test(ho.str);
	
	String str = ho.str.substring(2,5);
	System.out.println(str);
	System.out.println(ho.str);
}
}
