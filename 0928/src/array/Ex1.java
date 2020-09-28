package array;

public class Ex1 {
	
	public static void main(String[] args) {
		/*
		 * 배열은 객체자료형입니다.
		 * 자바의 배열은 길이가 고정되어 있다.(명확한것을 조아함)
		 * 배열은 length속성을 갖고 있따.
		 * 
		 * 배열의 선언 
		 *  1) new 자료형[길이];
		 *  2) 생성 및 초기화 :{자료,자료,...};
		 *     선언과 함께 사용 구문 작성
		 */
		
		int[] iArr = new int[4];//길이를 무적권 싸줘야함;
		int[] iArr2 = {1,3,4,6,8,9};// 대입까지 해서 배열을 만듬;
		//iArr2 = {3,6,1,5,4,9};//{}은 배열의 생성은 선언과 함께 작성해야됨
		iArr[1] = 1;
		iArr[2] = 2;
		iArr[3] = 3;
		//for each문
		
		for (int i = 0; i < iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
		for(int i:iArr) {
			System.out.println(i);
		}
		iArr= new int[3];
		System.out.println(iArr[1]);
	}//main end

}//Ex1 end
