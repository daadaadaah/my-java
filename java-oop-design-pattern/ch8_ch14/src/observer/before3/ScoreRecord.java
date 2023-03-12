package observer.before3;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {	
	private List<Integer> scores = new ArrayList<Integer>() ;	
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>() ;
	private MainMaxView minMaxView ;
	
	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView) ;
	}

	public void setMinMaxView(MainMaxView minMaxView) {
		this.minMaxView = minMaxView ;
	}
	public void addScore(int score) {
		scores.add(score) ;	
		for ( DataSheetView dataSheetView: dataSheetViews )
			dataSheetView.update() ;
		minMaxView.update() ;
	}
	public List<Integer> getScoreRecord() {
		return scores ;
	}
}
