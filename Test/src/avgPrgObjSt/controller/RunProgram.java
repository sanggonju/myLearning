package avgPrgObjSt.controller;

import java.util.Scanner;

import avgPrgObjSt.service.ArgService;
import avgPrgObjSt.service.ArgServiceImpl;

public class RunProgram {

	public static void main(String[] args) {
		System.out.println("계산기");
		RunProgram runProgram = new RunProgram();
		runProgram.runProgram();

	}

	public void runProgram() {
		ArgService argService = new ArgServiceImpl();
		Scanner sc = new Scanner(System.in);
		int menuNum;
		do {
			argService.displayMenu();
			menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				argService.showAllStudentScore();
				break;
			
			case 2:
				System.out.println("입력받을 학생수 입력");
				int member = sc.nextInt();
				argService.insertStudentInfo(member);
				break;
			
			case 3:
				argService.getFirstGradeStudentInfo();
				
				break;
			
			case 4:
				System.out.println("끝");
				break;
			default:
				System.out.println("잘못된 번호 입력");
				break;
			}
			
		} while (menuNum!=4);
		sc.close();
	}

}
