package chap6_prototype;

import chap6_prototype.framework.Product;

public class MessageBox implements Product {
	
	private char decochar;
	
	public MessageBox(char c){
		this.decochar = c;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		for (int i = 0; i < length+4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + "" + s + "" + decochar);
		for (int i = 0; i < length+4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p = null;
		try {
			p = (Product)clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
