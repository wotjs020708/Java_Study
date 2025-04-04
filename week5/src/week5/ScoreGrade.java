package week5;

import java.util.Scanner;

public class ScoreGrade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int score = 0;
		char grade;
		do {
			System.out.print("점수 >>");
			score = sc.nextInt();
			
			if (score >= 90 && score<= 100)
				grade = 'A';
			else if(score >=80 && score <90)
				grade = 'B';
			else if(score >=70 && score < 80)
				grade = 'C';
			else if (score >= 60 && score <70)
				grade = 'D';
			else
				grade ='F';
			if (score > 0) {
				System.out.println("SCORE     GRADE");
				System.out.println("===============");
				System.out.printf("   %d        %c\n",score, grade);				
			}
			
		} while (score > 0);
		System.out.println("프로그램 종료");
		sc.close();

	}

}
