package observer.after2;

import java.util.Collections;
import java.util.List;

public class StatisticsView implements Observer {
	private ScoreRecord scoreRecord ;
	
	public StatisticsView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord ;
	}
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord() ;
		
		displayStatistics(record);
	}
	private void displayStatistics(List<Integer> record) {
		int sum =  0 ;	
		for ( int score : record )
			sum += score ;
		float average = (float) sum / record.size() ;
		System.out.println("Sum: " + sum + " Average: " + average) ;
	}
}
