package day11.bank;

public class OverdrawnException extends Exception {
	public OverdrawnException() {
		
	}
	public OverdrawnException(String msg) {
		super(msg);
	}
}
