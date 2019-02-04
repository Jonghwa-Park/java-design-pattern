package chap14_C_O_R;

public class OddSupport extends Support {
	public OddSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolved(Trouble trouble) {
		if (trouble.getNumber() % 2 != 0) {
			return true;
		}else {
			return false;
		}
	}

}
