package factorial;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10000));
	}
	
	public static int factorial(int i) {
		return i==1? 1: factorial(i-1)*i;
	}

}
