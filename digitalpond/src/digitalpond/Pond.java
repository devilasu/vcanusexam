package digitalpond;

import java.util.Arrays;

public class Pond {
	int[][] map = new int[10][10];
	public Pond() {
		String tmp = "0 0 0 0 0 0 0 0 0 0\n"
				+ "0 0 0 0 1 0 0 0 0 0\n"
				+ "0 0 0 1 1 1 0 0 0 0\n"
				+ "0 1 1 1 1 1 1 0 0 0\n"
				+ "0 1 1 1 1 1 1 1 1 0\n"
				+ "0 1 1 1 1 1 1 1 1 0\n"
				+ "0 0 1 1 1 1 1 1 0 0\n"
				+ "0 0 0 1 1 1 1 0 0 0\n"
				+ "0 0 0 0 1 0 0 0 0 0\n"
				+ "0 0 0 0 0 0 0 0 0 0";
		String[] tmpArray = tmp.split("\n");
		
		for(int i = 0; i < tmpArray.length;i++) {
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
			for(int i = 0 ; i<map.length;i++) {
				for(int j = 0 ; j<map.length;j++) {
					if(isDepth(i,j)) {
						changed = true;
						map[i][j] = map[i][j]+ 1;
					}
				}
			}
		}
	}
	private boolean isDepth(int i, int j) {
		int depth = map[i][j];
		if(i>0 && i<map.length-1) {
			if(j>0 && j<map[i].length-1) {
				if(depth!=0) {
					if(map[i-1][j]>=depth) {
						if(map[i+1][j]>=depth) {
							if(map[i][j-1]>=depth) {
								if(map[i][j+1]>=depth) {
									return true;
								}
							}
						}
					}
				}
			}
		}
		if(j>=1) {
			
		}
		return false;
	}
	
	public void printMap() {
		String txt = "";
		for(int i = 0; i<map.length;i++) {
			txt = "";
			for(int j = 0 ; j<map[i].length;j++) {
				txt += map[i][j]+" ";
			}
			System.out.println(txt);
		}
	}
	
	
}
