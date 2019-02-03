package chap9_bridge;

public class Display {
	private DisplayImpl impe;
	
	public Display(DisplayImpl imple) {
		this.impe = imple;
	}
	
	public void open() {
		impe.rawOpen();
	}
	
	public void print() {
		impe.rawPrint();
	}
	
	public void close() {
		impe.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}
}
