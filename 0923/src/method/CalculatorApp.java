package method;

public class CalculatorApp {
public static void main(String[] args) {
	
	int a= 8;
	int b= 5;
	int result =Calculator.add(a,b);
	System.out.println(a+"+"+b+"="+Calculator.add(a, b));
	System.out.println(a + "-"+b+"="+Calculator.subtract(a, b));
	System.out.println(a + "*"+b+"="+Calculator.multiply(a, b));
	System.out.println(a + "/"+b+"="+Calculator.divide(a, b));

}//main end
}//CalculatorApp end
