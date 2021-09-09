
public class Calculator {
	private int value = 0; 
	public Calculator add(int i) {
		value+=i;
		return this;
	}
	public Calculator subtract(int i) {
		value -=i;
		return this;
	}
	public int out() {
		return value;
	}
}
