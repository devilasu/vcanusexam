package digitalpond;

import java.util.Arrays;

public class Pond {//맵 데이터를 제어하기 위한 클래스
	int width;
	int height;
	int[][] map;
	public Pond(String tmp) {
		
		String[] tmpArray = tmp.split("\n");
		height = tmpArray.length;				//맵 데이터로부터 width값 할당.
		width = tmpArray[0].split(" ").length;	//맵 데이터로부터 height값 할당.
		map = new int[width][height];			//맵 데이터로부터 얻어온 값으로 heap에 배열 생성.
		for(int i = 0; i < tmpArray.length;i++) {
			//String 지도 정보를 int로 파싱.
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
					if(isDepth(i,j)) {//좌,우,상,하 체크
						changed = true;
						map[i][j] = map[i][j]+ 1;//깊이 +1
					}
				}
			}
		}
	}
	private boolean isDepth(int i, int j) {
		int depth = map[i][j];
		if(i>0 && i<height-1) {	//상,하 체크를 위한 범위 설정
			if(j>0 && j<width-1) {//좌,우 체크를 위한 범위 설정
				if(depth!=0) {//땅이 아닐 경우
					if(map[i-1][j]>=depth) {//상 체크
						if(map[i+1][j]>=depth) {//하 체크
							if(map[i][j-1]>=depth) {//좌 체크
								if(map[i][j+1]>=depth) {//우 체크
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

	public void printMap() {//맵을 출력하는 기능
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
