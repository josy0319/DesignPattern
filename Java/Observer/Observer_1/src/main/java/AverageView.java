import java.util.List;

public class AverageView implements Observer{
	private ScoreRecord scoreRecord;
	
	public AverageView(ScoreRecord scoreRecord) {
		this.scoreRecord = scoreRecord;
	}
	
	public void displayScores() {
		List<DPScore> scores = scoreRecord.getScoreRecord();
		int tot = 0;
		
		for(int i=0; i<scores.size(); i++) {
			tot += scores.get(i).getScore();			
		}
		System.out.println("average score: " + tot/scores.size());
	}
	public void updateScore() {
		displayScores();
		
	}

	
	
}
