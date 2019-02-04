package chap17_observer;

public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator g) {
		// TODO Auto-generated method stub
		System.out.println("DigitObserver : " + g.getNumber());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
