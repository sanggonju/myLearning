package staticExam;

public class Test {

	public static void main(String[] args) {
		System.out.println("width="+Card.width+" height="+Card.height);
		Card spaceA = new Card("CloverA");
		Card space2 = new Card("Clover2");
		Card space3 = new Card("Clover3");
		System.out.println(spaceA);
		System.out.println(space2);
		System.out.println(space3);
		
		
		Card.width = 3;
		Card.height = 5;
		System.out.println();
		System.out.println("width="+Card.width+" height="+Card.height);
		
		
//		Card spaceA = new Card("CloverA");
//		Card space2 = new Card("Clover2");
//		Card space3 = new Card("Clover3");
		Card space4 = new Card("Clover4");
		Card space5 = new Card("Clover5");
		
		
		System.out.println(space4);
		System.out.println(space5);
	}

}



/*
 * 1)일반 멤버변수(NON-STATIC)
 * --공간적)멤버는 객체마다 별도로 존재 (인스턴스 멤버)
 * --시간적)객체 생성시 멤버 생성
 * --공유적)공유되지않음.(각 인스턴스마다 각각 다른 별도의 공간을 지님)
 * 
 * 2)STATIC
 * --공간적)클래스당 하나만 생성(클래스 멤버)
 * --시간적)클래스 로딩 시 생성됨.
 *   따라서, 객체 생성 전에도 접근 가능하고 사용도 가능하다.
 *   프로그램 종료시 사라진다.
 * --공유적)동일한 클래스의 모든 객체들에 의해 공유됨.
 * 
 * 
 * 
 * **static 메서드는 static 멤버만 접근 가능하다.
 * **static 메서드 에서는 this 키워드 사용 불가 (why? this 호출 당시 실행 중인 객체를 가리키는 키워드로 클래스 멤버인 static 메서드에서는 this사용불가)
 * 
 * 
 */