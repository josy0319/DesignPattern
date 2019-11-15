import java.util.List;

public class DataSheetView implements Observer {
	private int viewCount;
	
	private ScoreRecord scoreRecord;
	public DataSheetView(ScoreRecord scoreRecord,int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	public void displayScores(int viewCount) {
		List<DPScore> scores = scoreRecord.getScoreRecord();
		for(int i=0; i<viewCount && i<scores.size(); i++) {
			System.out.println("name: " + scores.get(i).getName());
			System.out.println("score: " + scores.get(i).getScore());
		}
	}
	public void updateScore() {
		displayScores(viewCount);
		
	}

}
