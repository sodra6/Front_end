package ah;

public class AHApp {
	
	public static void main(String[] args) {
		
		Animal[] rooms =new Animal[5];//추상화는 이럴때 사용
		
		rooms[0]= new Dog();
		rooms[1]= new Cat();
		rooms[2]= new Snake();
		rooms[3]= new Crocodile();
		rooms[4]= new Fox();
		
		for(int i=0	;rooms.length>i	; i++) {
			
			rooms[i].cry();
			
//			if(rooms[i] instanceof Dog) {
//				Dog d = (Dog)rooms[i];
//				d.cry();
//			}else if(rooms[i] instanceof Cat) {
//				Cat c = (Cat)rooms[i];
//				c.cry();
//			}else if(rooms[i] instanceof Snake) {
//				Snake s = (Snake)rooms[i];
//				s.cry();
//			}else if(rooms[i] instanceof Fox) {
//				Fox f= (Fox)rooms[i];
//				f.cry();
//			}else if(rooms[i] instanceof Crocodile) {
//				Crocodile c2=(Crocodile)rooms[i];
//				c2.cry();
//			}//if end

			
		}//for end
		
		
	}//main end

}//AHApp
