package thisSuperExp;

public class HumanClass {
	
	private String gender;
	
	private int age;
	

	public HumanClass(String gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
		
	
}

/*
 * this는 자기자신을 가르킴  getter/setter의 경우에서 
 * this의 의미는 자신의 객체에 속한 멤버변수 에 매개변수로 받아온 값을 넣어주겠다는 의미이다.
 * 
 * 
 */