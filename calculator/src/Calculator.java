
public class Calculator {
	private int value = 0; 
	public Calculator add(int i) {//더하기
		value+=i;
		return this;
	}
	public Calculator subtract(int i) {//빼기
		value -=i;
		return this;
	}
	public int out() {//값 리턴
		return value;
	}
}
