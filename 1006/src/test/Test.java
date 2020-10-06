package test;

public class Test {
	private int a;
	
	public Test(int a) {
		this.a=a;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Test) {
			Test tmp=(Test) obj;
			return tmp.a==this.a;
		}else{
			return false;
		}//if~else end
				
	}
}
