package token;

import java.util.StringTokenizer;

public class Ex3 {
	
	public static void main(String[] args) {
		
		
		StringTokenizer stok = new StringTokenizer("1,2,3,4,5,6,7",",");
		
		while(stok.hasMoreTokens()) {
			String num = stok.nextToken();
			System.out.println(num);
		}
		
		StringTokenizer spurs = new StringTokenizer("손흥민,라멜라"
				+ ",해리케인,델리알리,요리스,시소코,은돔벨레",",");
		
		while(spurs.hasMoreTokens()) {
			String name = spurs.nextToken();
			System.out.println(name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
	
}//Ex3 end
