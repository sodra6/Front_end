package array;

public class Ex3 {

	public static void main(String[] args) {
	

			
			//String[] names = {"RM","비","수가","진","제이콥","정국","지만"};
			//for문과 배열의 궁합은 매우 훌륭하다. for문과 배열은 땔수 없는 관계
			
			String[] bts= new String[7];
			bts[0]="끄";
			bts[1]="비";
			bts[2]="수가";
			bts[3]="진";
			bts[4]="제이콥";
			bts[5]="정국";
			bts[6]="지만";
			
		//for문 
		for(int i=0; i<bts.length; i++) {
			
			System.out.println(bts[i]);
		}
		
		//for each문
		for(String name:bts) {
			System.out.println(name);
		}
//		System.out.println(bts[0]);
//		System.out.println(bts[1]);
//		System.out.println(bts[2]);
//		System.out.println(bts[3]);
//		System.out.println(bts[4]);
//		System.out.println(bts[5]);
//		System.out.println(bts[6]);
		
		
		
	}//main end
	
}//Ex3 end
