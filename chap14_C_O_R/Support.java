package chap14_C_O_R;

public abstract class Support {
	private String name;
	private Support next;
	
	public Support(String name) {
		this.name = name;
	}
	
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	public final void support(Trouble trouble) {
		if(resolved(trouble)) {
			done(trouble);
		}else if (next != null) {
			next.support(trouble);
		}else {
			fail(trouble);
		}
	}

	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved");
	}

	protected void done(Trouble trouble) {
		System.out.println(trouble + "is resolved by " + this);
	}

	protected abstract boolean resolved(Trouble trouble);

	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	
}
