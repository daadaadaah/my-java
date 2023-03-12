package observer.before2;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord() ;
		MinMaxView minMaxView = new MinMaxView(scoreRecord) ;
		
		scoreRecord.setMinMaxView(minMaxView) ;
		
		for (int index = 1 ; index <= 5 ; index ++ ) {
			int score = index * 10 ;
			System.out.println("Adding " + score) ;
			scoreRecord.addScore(score) ;
		}	
	}
}
