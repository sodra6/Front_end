package string;

public class Ex1 {
	/*
	 * 			!!!!!! String메소드들은 절대 원본 문자열을 회손하지 않음 !!!!!!!
	 * 
	 * 						!!!! 무적권 리턴받아서 사용 !!!!!!
	 * 
	 *  String의 주요 메소드
	 * - charAt(인덱스) : 해당 문자열중 해당인덱스의 문자를 구하는것
	 * - indexOf(문자(열)) : 문자열중 해당문자(열)의 시작점 인덱스를 구하는 것
	 * 						없는 값을 넣을 경우 -1이 나옴
	 * - lastIndexOf(문자(열)) : 뒤에서부터 만나는 첫번째 문자의 index값
	 * - length() : 문자열 길이 구함
	 * - substring(시작인덱스) : 시작인덱스부터 끝까지의 문자열을 리턴
	 * - substring(시작, 끝-1) : 
	 */
	public static void main(String[] args) {
		String s ="ABCDEFGHIJKLMSOPQRSTUVWXYZ";
		char c= s.charAt(25);	//charAt()
		System.out.println(c);
		
		String p="가나다라마바사";
		int idx = p.indexOf("마"); //indexOf()
		System.out.println(idx);
		
		String l = "Hello Java";
		System.out.println(l.indexOf("a"));//lastIndexOf()
		System.out.println(l.lastIndexOf("a"));
		
		String m = "asdftqrdhf";
				System.out.println(m.length());//length()
		
		String q="가나다라마바";
		q=q.substring(0,6);//substring()
		System.out.println(q);
				
		
		String o = "AB";
		o=o.concat("C마트");//더하는 메소드
		System.out.println(o);
		
		System.out.println(o.contains("마"));//포함했는지 알아보는 메소드
	
		
		
	}

}
