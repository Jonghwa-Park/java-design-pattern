package chap5_singleton;

public class ThreadSafetyLazyInit {
	private static ThreadSafetyLazyInit instance;
	
	private ThreadSafetyLazyInit() {
		System.out.println("�ν��Ͻ��� ���� �Ͽ����ϴ�");

	}
	
	public synchronized static ThreadSafetyLazyInit getInstance() {
		if (instance == null) {
			instance = new ThreadSafetyLazyInit();
		}
		
		return instance;
	}
}
