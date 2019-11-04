package javaee.design_patterns.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Observable {
	
	private Set<Observer> observers; 
	
	public Observable() {
		observers = new HashSet<>();
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	protected void notifyObservers() {
		observers.forEach(
				o -> o.update(this)
		);
	}
}
