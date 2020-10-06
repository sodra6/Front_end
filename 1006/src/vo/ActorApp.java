package vo;

public class ActorApp {
	
	public static void main(String[] args) {
		
		Actor actor1 = 
				new Actor("마동석",178,100);
		
		System.out.println(actor1);
		
		Actor actor2=new Actor("마동석",178,100);
		
		System.out.println(actor2);
		
		/*
		 * Object가 가긴 equals()메소드를 호출하기 떄문에 ==비교
		 * 레퍼런스비교이기때문에 false인데 우리가 equals()메소드를 overriding해서
		 * 이름,키,몸무게가 같을경우 true가 되게 만들어보자
		 */
		System.out.println(actor1.equals(actor2));
		
	}//main() end
	
	
}//ActorApp end
