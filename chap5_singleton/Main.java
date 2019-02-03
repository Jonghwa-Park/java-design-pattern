package chap5_singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start.....");
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
				
		for (int i = 0; i < 100; i++) {
			System.out.println(TicketMaker.getInstance().getNextTicketNumber());
		}
		
		
		System.out.println("Start Tripple");
		
		for (int i = 0; i < 12; i++) {
			Triple t = Triple.getInstance(i % 3);
			System.out.println(i + " : " + t);
		}
		
	}

}
