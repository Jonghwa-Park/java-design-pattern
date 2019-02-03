package chap5_singleton;

public class TicketMaker {
	private static TicketMaker t = new TicketMaker();
	private int ticket = 1000;
	
	private TicketMaker() {
		System.out.println("TicketMaker Instance Created");
	}
	
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
	
	public static TicketMaker getInstance() {
		return t;
	}
}
