
public abstract class Robot {
	String name;
	MoveStrategy move;
	AttackStrategy attack;
	
	public Robot(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void attack() {
		attack.attack();
	}
	public void move() {
		move.move();
	}
	
	public void setAttack(AttackStrategy attack) {
		this.attack = attack;
	}
	public void setMove(MoveStrategy move) {
		this.move = move;
	}
	
	
}
