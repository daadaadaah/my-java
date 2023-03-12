package observer.before4;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {	
	private List<Integer> scores = new ArrayList<Integer>() ;	
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>() ;
	private MainMaxView statisticsView ;
	
	public void addScore(int score) {
		scores.add(score) ;
		
		for ( DataSheetView dataSheetView: dataSheetViews )
			dataSheetView.update() ;
		statisticsView.update() ;
	}

	public List<Integer> getScoreRecord() {
		return scores ;
	}

	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView) ;
	}

	public void setMinMaxView(MainMaxView statisticsView) {
		this.statisticsView = statisticsView ;
	}
}
