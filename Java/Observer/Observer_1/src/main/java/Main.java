
public class Main {
	public static void main(String[] args) {
		ScoreRecord record = new ScoreRecord();
		DataSheetView view = new DataSheetView(record,2);
		record.addObserver(view);
		MinMaxView minMaxView = new MinMaxView(record);
		record.addObserver(minMaxView);
		AverageView averageView = new AverageView(record);
		record.addObserver(averageView);
		//실행결과 어떻게 나오는지 알기
		
		DPScore score1 = new DPScore();
		score1.setName("name1");
		score1.setScore(100);
		DPScore score2 = new DPScore();
		score2.setName("name2");
		score2.setScore(90);
		DPScore score3 = new DPScore();
		score3.setName("name3");
		score3.setScore(80);
		DPScore score4 = new DPScore();
		score4.setName("name4");
		score4.setScore(70);
		DPScore score5 = new DPScore();
		score5.setName("name5");
		score5.setScore(60);
	
		record.addScore(score1);
		record.addScore(score2);
		record.addScore(score3);
		record.addScore(score4);
		record.addScore(score5);
		
		//DataSheetView view = new DataSheetView(record,5);
		//view.displaySocres(7);
		
		DPScore score6 = new DPScore();
		score6.setName("name6");
		score6.setScore(50);
	}
}
