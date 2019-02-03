package chap11_composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
	private String name;
	private ArrayList<Entry> directory = new ArrayList<>();
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry e = it.next();
			size += e.getSize();
		}
		return size;
	}
	
	public Entry add(Entry e) {
		directory.add(e);
		return this;
	}

	@Override
	protected void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + "/" +this);
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()) {
			Entry e = it.next();
			e.printList(prefix + "/" + name);
		}
	}

}
