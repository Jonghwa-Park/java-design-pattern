package chap14_C_O_R;

public class Trouble {
	private int number;

	public Trouble(int number) {
		//super();
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "[Trouble " + number + " ]";
	}
	
	
	
}
