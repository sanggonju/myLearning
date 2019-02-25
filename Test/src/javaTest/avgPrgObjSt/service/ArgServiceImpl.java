package javaTest.avgPrgObjSt.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javaTest.avgPrgObjSt.model.StudentInfo;
import javaTest.avgPrgObjSt.model.SubjectInfo;

public class ArgServiceImpl implements ArgService{
	
	ArrayList<StudentInfo> stuList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void displayMenu() {
	
		System.out.println("[1]조회 [2]입력 [3]1등 [4]종료");
	}

	@Override
	public void showAllStudentScore() {
		// TODO Auto-generated method stub
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i).toString());	
		}
	}

	@Override
	public void insertStudentInfo(int member) {
		StudentInfo stuInfo;
		for (int i = 1; i <= member; i++) {
			System.out.println(i+"번 학생");
			String[] subArr = {"국어","영어","수학"};
			int tmpScore=0;
			int tmpTotal=0;
			ArrayList<SubjectInfo> subScoreList = new ArrayList<>();
			for (int j = 0; j < subArr.length; j++) {
				SubjectInfo subInfo = new SubjectInfo();
				System.out.print(subArr[j]+" : ");
				tmpScore = sc.nextInt();
				tmpTotal += tmpScore;
				subInfo.setSubject(subArr[j]);
				subInfo.setScore(tmpScore);
				subScoreList.add(subInfo);
			}
			stuInfo = new StudentInfo(i, subScoreList, tmpTotal/3.0);
			stuList.add(stuInfo);
		}
	}

	@Override
	public void getFirstGradeStudentInfo() {
		
		StudentInfo maxInfo = stuList.stream()
								     .max(Comparator.comparingDouble(StudentInfo::getAvgScore))
								     .orElse(null); //orElse NULL일경우 null출력
		
		System.out.println(maxInfo.toString());
	}
	

}
