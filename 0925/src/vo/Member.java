package vo;

public class Member {
	// 멤버필드를 프라이빗으로 설정
	// setter, getter
	// 기본생성자 하나 만들기

	private String name;
	private String code;
	private char sex;
	private String major;
	
	//생성자는 멤버필드의 초기화
	public Member(String name, String code, char sex, String major) {
		this.name=name; this.code =code; this.sex=sex; this.major=major;
	};
	public Member() {
		// TODO Auto-generated constructor stub
	}
	public Member(String name, String code, char sex) {
		this(name,code,sex,"컴퓨터공학과");//이런식으로
	}	
	
	public Member(String name,char sex) {
		this(name,"20학번",sex);
	}
	public Member(String name) {
		this(name,'M');
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
