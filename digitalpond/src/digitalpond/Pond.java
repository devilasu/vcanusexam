package digitalpond;

import java.util.Arrays;

public class Pond {//�� �����͸� �����ϱ� ���� Ŭ����
	int width;
	int height;
	int[][] map;
	public Pond(String tmp) {
		
		String[] tmpArray = tmp.split("\n");
		height = tmpArray.length;				//�� �����ͷκ��� width�� �Ҵ�.
		width = tmpArray[0].split(" ").length;	//�� �����ͷκ��� height�� �Ҵ�.
		map = new int[width][height];			//�� �����ͷκ��� ���� ������ heap�� �迭 ����.
		for(int i = 0; i < tmpArray.length;i++) {
			//String ���� ������ int�� �Ľ�.
			map[i]= Arrays.stream(tmpArray[i].split(" ")).mapToInt(Integer::parseInt).toArray();
		}
	}
	public int[][] getMap() {
		return map;
	}
	public void calcMap() {
		boolean changed = true;
		while(changed) {
			changed=false;
			for(int i = 0 ; i<height;i++) {
				for(int j = 0 ; j<width;j++) {
					if(isDepth(i,j)) {//��,��,��,�� üũ
						changed = true;
						map[i][j] = map[i][j]+ 1;//���� +1
					}
				}
			}
		}
	}
	private boolean isDepth(int i, int j) {
		int depth = map[i][j];
		if(i>0 && i<height-1) {	//��,�� üũ�� ���� ���� ����
			if(j>0 && j<width-1) {//��,�� üũ�� ���� ���� ����
				if(depth!=0) {//���� �ƴ� ���
					if(map[i-1][j]>=depth) {//�� üũ
						if(map[i+1][j]>=depth) {//�� üũ
							if(map[i][j-1]>=depth) {//�� üũ
								if(map[i][j+1]>=depth) {//�� üũ
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}

	public void printMap() {//���� ����ϴ� ���
		String txt = "";
		int sum = 0;
		for(int i = 0; i<height;i++) {
			txt = "";
			for(int j = 0 ; j<width;j++) {
				txt += map[i][j]+" ";
				if(map[i][j]!=0)
					sum += map[i][j];
			}
			System.out.println(txt);
		}
		System.out.println("width: "+width+", height: "+height+", sum: "+sum);
	}
	
	
}
