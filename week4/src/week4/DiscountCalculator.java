package week4;

import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 구매 가격 입력 >>");
		int price = sc.nextInt();
		int rate = 0;
		System.out.println("원래 가격 : " + price + "원");
		
		if(price >= 100000) 
			rate = 10;
		else if (price >= 50000)
			rate = 5;
		
		System.out.println("할인율 : " + rate + "%");
		
		int discountAmt = price * rate/ 100;
		int finalPrice = price - discountAmt;
		System.out.println("최종가격 : " + finalPrice + "원");
	}

}
