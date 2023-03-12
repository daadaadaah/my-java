package observer.before2;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {	
	private List<Integer> scores = new ArrayList<Integer>() ;	
	private MinMaxView minMaxView ;

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView ;
	}
	public void addScore(int score) {
		scores.add(score) ;
		
		minMaxView.update() ;
	}
	public List<Integer> getScoreRecord() {
		return scores ;
	}
}
