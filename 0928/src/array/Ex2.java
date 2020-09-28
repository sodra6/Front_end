package array;

public class Ex2 {

	
	public static void main(String[] args) {
		
		String[] sArr = new String[3];// 배열 위치는 자료형+배열 변수명 임
		System.out.println(sArr[0].substring(0,1));//nullPointException 떨어짐(객체는 초기값이 널값!)

		sArr[0]="TEST";
		//System.out.println(sArr[0].substring(0,1));
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		for(String str:sArr) {
			System.out.println(str);
		}
		
	}//main() end
	
}//Ex2 end
