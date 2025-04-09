package week5;

import java.util.Scanner;

public class RandomUpDownGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 100 + 1);
		
		while(true) {
			System.out.print("숫자를 맞혀 보세요. (1~100) >>");
			int number = sc.nextInt();
			
			if(number > 0 && number <= 100) {
				if(number > randomNumber) {
					System.out.println("숫자가 큽니다.");
				} else if(number < randomNumber) {
					System.out.println("숫자가 작습니다.");
				} else {
					System.out.println("정답입니다." + " 랜덤 숫자는" + randomNumber + " 입니다." );
					return;
				}
			} else {
				System.out.println("1 ~ 100 숫자만 입력해 주세요.");
			}
		}
		
		

	}

}
