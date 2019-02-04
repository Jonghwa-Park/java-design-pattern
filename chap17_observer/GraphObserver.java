package chap17_observer;

public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator g) {
		// TODO Auto-generated method stub
		System.out.print("GraphObserver : ");
		int cnt = g.getNumber();
		for (int i = 0; i < cnt; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
