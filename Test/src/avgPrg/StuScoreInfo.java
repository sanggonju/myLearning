package avgPrg;

public class StuScoreInfo {
	
	private int stuNum; //번호
	 
	private int korScore; // 국어

	private int mathScore; //수학
	
	private int engScore;  //영어
	
	private double scoAvg; //평균
	
	public int getStuNum() {
		return stuNum;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public double getScoAvg() {
		return scoAvg;
	}
	public void setScoAvg(double scoAvg) {
		this.scoAvg = scoAvg;
	}
	@Override
	public String toString() {
		return  stuNum + "     " + korScore + "    " + mathScore + "   " + engScore + "   " + scoAvg;
	}
	
}
