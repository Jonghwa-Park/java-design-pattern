package chap14_C_O_R;

public class LimitSupport extends Support {
	private int limit;
	public LimitSupport(String name, int limit) {
		super(name);
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	@Override
	protected boolean resolved(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() < limit) {
			return true;
		}else {
			return false;
		}
	}

}
