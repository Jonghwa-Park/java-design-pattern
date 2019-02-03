package chap4_factory_method;

import chap4_factory_method.framework.Factory;
import chap4_factory_method.framework.Product;
import chap4_factory_method.idcard.IDCardFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f = new IDCardFactory();
		Product c1 = f.create("ȫ�浿");
		Product c2 = f.create("����ȭ");
		Product c3 = f.create("������");
		
		c1.use();
		c2.use();
		c3.use();
	}

}
