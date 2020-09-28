package call;

public class CallByReferance {
	
	int a;
	
	void test(CallByReferance c) {
		c.a++;
		
	}//test() end
	public static void main(String[] args) {
		
		CallByReferance c = new CallByReferance();
		c.a=10;
		c.test(c);
		
	}//main() end
}//CallByReferance end
