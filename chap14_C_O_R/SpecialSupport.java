package chap14_C_O_R;

public class SpecialSupport extends Support {
	private int number;
	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}
	@Override
	protected boolean resolved(Trouble trouble) {
		if(trouble.getNumber() == number) {
			return true;
		}else {
			return false;
		}
	}

}
