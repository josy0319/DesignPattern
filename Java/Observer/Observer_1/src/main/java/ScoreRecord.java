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
		//�ߺ��Ǵ� �ڵ� �巡�� ��Ŭ�� ������ -> �ͽ�Ʈ��Ʈ �޼ҵ� �����丵 ���
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
