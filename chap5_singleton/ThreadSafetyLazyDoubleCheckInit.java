package chap5_singleton;

public class ThreadSafetyLazyDoubleCheckInit {
	private static ThreadSafetyLazyDoubleCheckInit instance;
	
	private ThreadSafetyLazyDoubleCheckInit() {
		System.out.println("인스턴스를 생성 하였습니다");
	}
	
	public static ThreadSafetyLazyDoubleCheckInit getInstance() {
		if (instance == null) {
			System.out.println("First Instance is null");
			synchronized (ThreadSafetyLazyDoubleCheckInit.class) {
				if (instance == null) {
					System.out.println("Secondary Instance is null");
					instance = new ThreadSafetyLazyDoubleCheckInit();
				}
			}
		}
		
		return instance;
	}
}
