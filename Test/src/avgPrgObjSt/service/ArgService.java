package avgPrgObjSt.service;

public interface ArgService {
	
	//메뉴 화면
	public void displayMenu();
		
	//전체 조회
	public void showAllStudentScore();
	
	//학생수 입력
	public void insertStudentInfo(int member);

	//1등출력
	public void getFirstGradeStudentInfo();
}

