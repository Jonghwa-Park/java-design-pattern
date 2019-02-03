package chap5_singleton;

public class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		System.out.println("�ν��Ͻ��� ���� �Ͽ����ϴ�");
	}
	
	public static Singleton getInstance() {
		System.out.println("getInstance");
		return s;
	}
}
