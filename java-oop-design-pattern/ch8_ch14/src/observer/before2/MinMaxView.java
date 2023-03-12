package observer.before2;

import java.util.Collections;
import java.util.List;

public class MinMaxView {
	private ScoreRecord scoreRecord ;
	
	public MinMaxView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord ;
	}
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord() ;
		
		displayStatistics(record);
	}
	private void displayStatistics(List<Integer> record) {
		int min =  Collections.min(record, null) ;
		int max =  Collections.max(record, null) ;	
		System.out.println("Min: " + min + " Max: " + max) ;
	}
}
