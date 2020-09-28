package wrapper;

public class Ex4 {

	public static void main(String[] args) {
		Integer i= new Integer(3);//명시적 객체생성
		Integer i2=3;//암시적 객체생성(상수풀에 처음 3이 저장), 오토박싱
		int a=3;
		Integer i3=a;//이것도 암시적 객체생성(상수풀에 3이 있으므로 객체생성 x), 오토박싱
		Integer i4=3;//암시적 객체생성(상수풀에 3이 있으므로 객체생성 x), 오토박싱
		Integer b=i4;//언박싱
		
		System.out.println(i==i2);
		System.out.println(i==i3);
		System.out.println(i==i4);
		System.out.println(i2==i3);
		System.out.println(i3==i4);
		System.out.println(i2==i4);
		System.out.println(i.equals(i2));
		System.out.println(i.equals(i3));
		System.out.println(i.equals(i4));
		System.out.println(i2.equals(i3));
		System.out.println(i3.equals(i4));
		System.out.println(i2.equals(i4));
		System.out.println(i.equals(a));
	
	}//main end

}//Ex4 end
