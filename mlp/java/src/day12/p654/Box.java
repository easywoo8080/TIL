package day12.p654;

public class Box<T> {
	T obj;
	public Box() {
		
	}
	public void setBox(T c) {
		obj = c;
	}
	public T getBox(){
		return obj;
	}
}
