
public class Main {
	public static void main(String[] args) {
		
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		System.out.println("My name is " + atom.getName());
		System.out.println("My name is " + taekwonV.getName());
		
		taekwonV.setAttack(new Missile());
		taekwonV.setMove(new Walk());
		
		atom.setAttack(new Punch());
		atom.setMove(new Fly());
		
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		atom.move();
		atom.attack();
		
	}
}
