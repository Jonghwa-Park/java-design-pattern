package chap6_prototype;

import chap6_prototype.framework.Manager;
import chap6_prototype.framework.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('~');
		MessageBox mbox = new MessageBox('*');
		manager.register("strong message", upen);
		manager.register("warning box", mbox);
		
		Product p1 = manager.create("strong message");
		p1.use("Hello world");
		
		Product p2 = manager.create("warning box");
		p2.use("Hello world");
	}

}
