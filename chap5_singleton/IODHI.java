package chap5_singleton;

public class IODHI {
	private IODHI() {
		System.out.println("Called Constructor");
	}
	
	private static class LazyHolder{
		static final IODHI instance = new IODHI();
	}
	
	public static IODHI getInstance() {
		System.out.println("Called getInstance");
		return LazyHolder.instance;
	}
}
