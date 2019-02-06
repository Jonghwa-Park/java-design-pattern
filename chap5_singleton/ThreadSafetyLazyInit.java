package chap5_singleton;

public class ThreadSafetyLazyInit {
	private static ThreadSafetyLazyInit instance;
	
	private ThreadSafetyLazyInit() {
		System.out.println("인스턴스를 생성 하였습니다");

	}
	
	public synchronized static ThreadSafetyLazyInit getInstance() {
		if (instance == null) {
			instance = new ThreadSafetyLazyInit();
		}
		
		return instance;
	}
}
