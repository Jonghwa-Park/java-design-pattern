package chap14_C_O_R;

public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	@Override
	protected boolean resolved(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}

}
