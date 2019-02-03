package chap9_bridge;

public class StringDisplayImpl extends DisplayImpl {
	private String str;
	private int width;
	
	public StringDisplayImpl(String str) {
		// TODO Auto-generated constructor stub
		this.str = str;
		this.width = str.getBytes().length;
	}
	
	@Override
	protected void rawOpen() {
		// TODO Auto-generated method stub
		printLine();
	}

	private void printLine() {
		// TODO Auto-generated method stub
		System.out.print("+");
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.println("+");

	}

	@Override
	protected void rawPrint() {
		// TODO Auto-generated method stub
		System.out.println("|" + str + "|");
	}

	@Override
	protected void rawClose() {
		// TODO Auto-generated method stub
		printLine();
	}

}
