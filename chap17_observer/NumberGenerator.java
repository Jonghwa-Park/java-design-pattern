package chap17_observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
	private ArrayList<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while(it.hasNext()) {
			Observer o = it.next();
			o.update(this);
		}
	}
	
	public abstract int getNumber();
	public abstract void execute();
}
