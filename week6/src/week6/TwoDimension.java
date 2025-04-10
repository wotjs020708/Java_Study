package week6;

public class TwoDimension {

	public static void main(String[] args) {
		// int[행][열]
		int[][] math = new int[2][3];		
		
		// 2차원 배열 => 중첩 for 문
		for(int i=0; i < math.length; i++) {
			// 바깥 for : 행의 반
			for(int j=0; j<math[i].length; j++) {
				// 안쪽 for : 열의 반복
				System.out.printf("math[%d][%d] = %d\n", i, j, math[i][j]);
			}
			
		}
		
		System.out.println();
		int[][] eng = new int[2][];
		eng[0] = new int[2];
		eng[1] = new int[3];
		for(int i=0; i < math.length; i++) {
			// 바깥 for : 행의 반
			for(int j=0; j<eng[i].length; j++) {
				// 안쪽 for : 열의 반복
				System.out.printf("eng[%d][%d] = %d\n", i, j, math[i][j]);
			}
			
		}
	}

}
