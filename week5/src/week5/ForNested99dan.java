package week5;

public class ForNested99dan {

	public static void main(String[] args) {
		// 2~9 단 출력
		// 바깥쪽 for 문 : 단의 반복
		// 안족 for 문 : 1~9까지의 반복
		
		for(int i=2; i <= 9; i++) {
			System.out.println("=============");
			System.out.printf("구구 단: %d \n",i);
			System.out.println("=============");
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}

	}

}
