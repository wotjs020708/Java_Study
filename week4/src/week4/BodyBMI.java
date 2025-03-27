package week4;

import java.util.Scanner;

public class BodyBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		
		System.out.print("키(cm)를 입력하세요 :");
		int height = sc.nextInt();
		
		System.out.print("몸무게(kg)를 입력하세요 :");
		int weight = sc.nextInt();
		
		double bmi = weight / ((height * 0.01) * (height * 0.01));
		String level;
		System.out.println(name + "님의 키는 " + height + "cm, 몸무게는 " + weight +"kg");
		if (bmi >= 30) {
			level = "고도비만";
		} else if (bmi< 30 && bmi >= 25) {
			level = "비만";
		} else if (bmi <25 && bmi >= 23) {
			level = "과체중";
		} else if (bmi < 23 && bmi >= 18.5) {
			level = "정상";
		} else {
			level = "저체중";
		}
		System.out.printf("BMI 지수는 %.2f아고 %s입니다.",bmi, level);
		
		sc.close();
	}
}
