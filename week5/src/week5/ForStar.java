package week5;


public class ForStar {

	public static void main(String[] args) {
		// 1 ~ 10 사이의 랜덤 숫자 생성
		int num = (int)(Math.random() * 10 + 1);
		
		System.err.println("랜덤 숫자 : " + num);
		// 발표 출력
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
		
	}

}
