package javaTest.avgPrg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LogicClass {
	
	public void runCal() {
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		ArrayList<StuScoreInfo> stuScoreList = new ArrayList<>();
		LogicClass logic = new LogicClass();
		System.out.println("*** 평균 성적 계산기 ***");
		do {
			System.out.println("메뉴를 선택하세요.[(1)조회/ (2)입력/ (3)1등/ (4) 종료 ]");
			menuNum = sc.nextInt();
			logic.averageScoreCalculator(sc, menuNum, stuScoreList);
		} while (menuNum!=4);
	}
	
	public void averageScoreCalculator(Scanner sc, int menuNum, ArrayList<StuScoreInfo> stuScoreList) {
		switch (menuNum) {
		case 1:
			if(stuScoreList.size()<1) {
				System.out.println("입력된 점수가 없습니다.");
			}else {
				System.out.println("번호   국어  수학  영어  평균");
				for (StuScoreInfo stuScoreInfo : stuScoreList) {
					System.out.println(stuScoreInfo.toString());
				}
			}
			break;
		case 2:
			System.out.println("입력받을 학생수 입력");
			int insStuNum = sc.nextInt();
			for (int i = 1; i <= insStuNum; i++) {
				StuScoreInfo ssi = new StuScoreInfo();
				ssi.setStuNum(i);
				System.out.println(i+"번 학생의 국어 점수 :");
				int korSco = sc.nextInt();
				ssi.setKorScore(korSco);
				System.out.println(i+"번 학생의 수학 점수 :");
				int mathSco = sc.nextInt();
				ssi.setMathScore(mathSco);
				System.out.println(i+"번 학생의 영어 점수 :");
				int engSco = sc.nextInt();
				ssi.setEngScore(engSco);
				
				ssi.setScoAvg((korSco+mathSco+engSco)/3.0);
				stuScoreList.add(ssi);
			}
			break;	
		case 3:
			StuScoreInfo maxInfo = stuScoreList.stream()
		    .max(Comparator.comparingDouble(StuScoreInfo::getScoAvg))
		    .orElse(null); //orElse NULL일경우 null출력
			
			System.out.println("번호   국어  수학  영어  평균");
			System.out.println(maxInfo.toString());
			break;	
		case 4:
			System.out.println("종료");
			break;	
		default:
			System.out.println("존재하지 않는 메뉴입니다.");
			break;
		}
	}
}
