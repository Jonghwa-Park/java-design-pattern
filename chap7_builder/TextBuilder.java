package chap7_builder;

public class TextBuilder extends Builder {
	private StringBuffer buf = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		buf.append("===============");
		buf.append("[" + title + "]");
		buf.append("\n");
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		buf.append("¡Ø " + str + "\n");
		buf.append("\n");
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		for (int i = 0; i < items.length; i++) {
			buf.append(" ." + items[i] + "\n");
			
		}
		buf.append("\n");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		buf.append("===============\n");
	}
	
	public String getResult() {
		return buf.toString();
	}

}
