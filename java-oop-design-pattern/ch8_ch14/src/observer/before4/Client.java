package observer.before4;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord() ;

		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3) ;
		scoreRecord.addDataSheetView(dataSheetView3) ;
	
		for (int index = 1 ; index <= 3 ; index ++ ) {
			int score = index * 10 ;
			System.out.println("Adding " + score) ;
			scoreRecord.addScore(score) ;
		}	
		
		MainMaxView statisticsView = new MainMaxView(scoreRecord) ;
		scoreRecord.setMinMaxView(statisticsView) ;

		for (int index = 1 ; index <= 2 ; index ++ ) {
			int score = index * 10 ;
			System.out.println("Adding " + score) ;
			scoreRecord.addScore(score) ;
		}

	}
}
