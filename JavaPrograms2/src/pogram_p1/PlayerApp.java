package pogram_p1;

public class PlayerApp {

	public static void main(String[] args) {
		Cricketer c=new Cricketer();
		Footballer f=new Footballer();
		
		SportApp s=new SportApp();
		s.accept(c);
		s.accept(f);
	}
}
