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
				+ "0 0 0 0 0 0 0 0 0 0 0");	//���� �����Ͱ� �ִ� Ŭ���� ��ü ����
		pond.calcMap();	//�ʱ� ������ �����ϴ� �޼ҵ�
		pond.printMap();	//������ ����� ����ϴ� �޼ҵ�
	}

}
