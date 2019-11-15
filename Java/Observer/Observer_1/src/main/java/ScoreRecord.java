import java.util.*;

public class ScoreRecord {
	private List<DPScore> scores = new ArrayList<DPScore>();
	private List<Observer> observers = new ArrayList<Observer>();
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void addScore(DPScore score) {
		scores.add(score);
		notifyObservers();
		//중복되는 코드 드래그 우클릭 리펙터 -> 익스트렉트 메소드 리팩토링 기법
	}

	private void notifyObservers() {
		for(Observer o: observers) {
			o.updateScore();
		}
	}
	
	public void rmSocre(String name) {
		for(DPScore score:scores) {
			if(score.getName().equals(name)) {
				scores.remove(score);
				break;
			}
		}
		notifyObservers();
	}
	public List<DPScore> getScoreRecord(){
		return scores;
	}
}
