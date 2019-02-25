package staticExam;

public class Card {
	public static int width = 2;
	public static int height = 6;
	
	private String cardName;

	public Card(String cardName) {
		super();
		this.cardName = cardName;
	}

	@Override
	public String toString() {
		return "Card [width="+this.width+"height="+this.height+"cardName=" + cardName + "]";
	}
	
	
}
