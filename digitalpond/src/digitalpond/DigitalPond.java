package digitalpond;

public class DigitalPond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pond pond = new Pond( "0 0 0 0 0 0 0 0 0 0 0\n"
				+ "0 0 0 0 1 0 0 0 0 0 0\n"
				+ "0 0 0 1 1 1 0 0 0 0 0\n"
				+ "0 1 1 1 1 1 1 0 0 0 0\n"
				+ "0 1 1 1 1 1 1 1 1 0 0\n"
				+ "0 1 1 1 1 1 1 1 1 0 0\n"
				+ "0 0 1 1 1 1 1 1 0 0 0\n"
				+ "0 0 0 1 1 1 1 0 0 0 0\n"
				+ "0 0 0 0 1 0 0 0 0 0 0\n"
				+ "0 0 0 0 0 0 0 0 0 0 0");	//지도 데이터가 있는 클래스 객체 생성
		pond.calcMap();	//초기 지도를 수정하는 메소드
		pond.printMap();	//지도의 결과를 출력하는 메소드
	}

}
