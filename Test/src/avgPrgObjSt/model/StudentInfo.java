package avgPrgObjSt.model;

import java.util.ArrayList;

public class StudentInfo {
	private int stuNo;
	
	private ArrayList<SubjectInfo> stuScoreInfo; 
	
	private double avgScore;

	public StudentInfo(int stuNo, ArrayList<SubjectInfo> stuScoreInfo, double avgScore) {
		this.stuNo = stuNo;
		this.stuScoreInfo = stuScoreInfo;
		this.avgScore = avgScore;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public ArrayList<SubjectInfo> getStuScoreInfo() {
		return stuScoreInfo;
	}

	public void setStuScoreInfo(ArrayList<SubjectInfo> stuScoreInfo) {
		this.stuScoreInfo = stuScoreInfo;
	}

	public double getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String returnStr;
		System.out.println();
		
		sb.append("번호\t국어\t수학\t영어\t평균")
		  .append(System.getProperty("line.separator"))
		  .append(this.stuNo+"\t");
		for (SubjectInfo stuInfo : stuScoreInfo) {
			sb.append(stuInfo.getScore()+"\t");
		}
		
		sb.append(this.avgScore);
		returnStr = sb.toString();
		
		return returnStr;
	}
	
	
	
}
