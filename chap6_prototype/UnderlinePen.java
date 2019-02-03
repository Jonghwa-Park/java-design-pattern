package chap6_prototype;

import chap6_prototype.framework.Product;

public class UnderlinePen implements Product {
	private char ulchar;
	
	public UnderlinePen(char c) {
		this.ulchar = c;
	}
	
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print("");
		for (int i = 0; i < length; i++) {
			System.out.print(ulchar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product p = null;
		try {
			p = (Product) clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return p;
	}

}