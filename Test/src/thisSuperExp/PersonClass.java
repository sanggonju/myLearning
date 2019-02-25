package thisSuperExp;

public class PersonClass extends HumanClass{
	


	public PersonClass(String gender, int age) {
		super(gender, age);
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "PersonClass [name=" + name + ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
	}
	
}


/*
 * 
 * 확인을 위해 HumanClass에는 default생성자를 만들어 두지 않았다.
 * 상속관계에서는 상위객체부터 하위객체까지 모두 인스턴스화 되어야 함으로
 * 해당 경우 PersonClass의 defualt생성자를 말들어도 HumanClass에는
 * default생성자를 만들어 두지 않았기때문에 PersonClass를 생성자를 통해
 * 인스턴스화 시킬경우 gender와 age를 매개변수로 받아 상위객체를 가르키는
 * super를 통해 상위객체를 인스턴스화 시켜주어야한다.
 * 
 * 
 * 
 * 
 */
