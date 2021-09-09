package factorial2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(10000000));
	}
	
	public static int factorial(int i) {
		int result = 1;
		
		while(true) {
			if(i<=1) return result;
			result*=i;
			i-=1;
		}
	}

//	자바에서는 허용 안되는 방법.
//	public static int factorial(int i, int result) {
//		if(i==1) return result;
//		return factorial(i-1,result*i);
//	}
//	
//	public static int factorial(int i) {
//		return factorial(i,1);
//	}	
}
