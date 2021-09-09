package factorial;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10));
	}
	
	public static int factorial(int i) {
		if(i==1)return 1;
		return factorial(i-1)*i;
	}

}
