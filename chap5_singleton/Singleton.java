package chap5_singleton;

public class Singleton {
	private static Singleton s = new Singleton();
	
	private Singleton() {
		System.out.println("인스턴스를 생성 하였습니다");
	}
	
	public static Singleton getInstance() {
		System.out.println("getInstance");
		return s;
	}
}
