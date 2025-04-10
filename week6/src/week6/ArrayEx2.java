package week6;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum=0;
		double ave = 0.0;
		System.out.println("=== 랜덤 생선된 점수 배열 ==");
		// 배열 처리 for 문 이용
		// 반복 횟수는 배열.length
		for(int i=0; i< score.length; i++) {
			int randomNum = (int)(Math.random() * 100);
			score[i] = randomNum;
			System.out.printf("score[%d] = %d\n", i, score[i]);
			sum = sum +score[i];
		}
		
		
		ave = (double)sum / score.length;
		System.out.println();
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + ave);
		
	}

}
