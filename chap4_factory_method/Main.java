package chap4_factory_method;

import chap4_factory_method.framework.Factory;
import chap4_factory_method.framework.Product;
import chap4_factory_method.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f = new IDCardFactory();
		Product c1 = f.create("홍길동");
		Product c2 = f.create("박종화");
		Product c3 = f.create("강진영");
		
		c1.use();
		c2.use();
		c3.use();
	}

}
