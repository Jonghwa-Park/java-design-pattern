package chap7_builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextBuilder tx1 = new TextBuilder();
		Director dr = new Director(tx1);
		dr.construct();
		String result = tx1.getResult();
		System.out.println(result);
		
		TextBuilder2 tx2 = new TextBuilder2();
		Director dr2 = new Director(tx2);
		dr2.construct();
		result = tx2.getResult();
		System.out.println(result);
	}

}
