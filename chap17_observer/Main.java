package chap17_observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberGenerator g = new RandomNumberGenerator();
		Observer o1 = new DigitObserver();
		Observer o2 = new GraphObserver();
		
		g.addObserver(o1);
		g.addObserver(o2);
		g.execute();
	}

}
