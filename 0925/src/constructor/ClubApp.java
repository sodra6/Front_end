package constructor;

import vo.Member;

public class ClubApp {

	public static void main(String[] args) {
		
	//한 멤버에 대한 정보
		Member m1= new Member();
		m1.setName("최민식");
		m1.setCode("20학번");
		m1.setSex('M');
		m1.setMajor("행정학과");
		
		System.out.println(m1.getName());
		System.out.println(m1.getCode());
		System.out.println(m1.getSex());
		System.out.println(m1.getMajor());

		Member m2 = new Member("이정재","17학번",'M',"컴퓨터공학과");
		
		System.out.println(m2.getName());
		System.out.println(m2.getCode());
		System.out.println(m2.getSex());
		System.out.println(m2.getMajor());
		
		Member m3 = new Member("황창민","15학번",'M');
		System.out.println(m3.getName());
		System.out.println(m3.getCode());
		System.out.println(m3.getSex());
		System.out.println(m3.getMajor());
		
		Member m4 = new Member("고수",'M');
		System.out.println(m4.getName());
		System.out.println(m4.getCode());
		System.out.println(m4.getSex());
		System.out.println(m4.getMajor());
		
		Member m5=new Member("박정민");
		System.out.println(m5.getName());
		System.out.println(m5.getCode());
		System.out.println(m5.getSex());
		System.out.println(m5.getMajor());
		
	
	}//main() end
		
}//ClubApp end
