package chap5_singleton;

public class Triple {
	private static Triple[] triples = new Triple[] {
		new Triple(0),
		new Triple(1),
		new Triple(2)
	};
	
	private Triple(int id) {
		System.out.println("created Triple : " + id);
		this.id = id;
	}
	
	private int id;
	
	public static Triple getInstance(int id) {
		return triples[id];
	}
	
	public String toString() {
		return "[Triple id = " + this.id + "]";
	}
}
