package chap14_C_O_R;

public class Main {

	public static void main(String[] args) {
		Support a = new NoSupport("a");
		Support b = new LimitSupport("b", 100);
		Support c = new SpecialSupport("c", 429);
		Support d = new NoSupport("d");
		Support e = new LimitSupport("e", 200);
		Support f = new SpecialSupport("f", 234);
		Support g = new OddSupport("g");
		
		a.setNext(b).setNext(c).setNext(d).setNext(e).setNext(f).setNext(g);
		
		for (int i = 0; i < 500; i++) {
			a.support(new Trouble(i));
		}
	}

}
