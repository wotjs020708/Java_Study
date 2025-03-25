package week3;


public class ProductPrice {
	
	
	public static void main(String[] args) {
		int milkCount = 1;
		int carrotCount = 2;
		int snackCount = 3;
		
		int milkPrice = 4500;
		int carrotPrice = 1000;
		int snackPrice = 1500;
		
		milkPrice *= milkCount;
		carrotPrice *= carrotCount;
		snackPrice *= snackCount;
		
		
		int totalPrice = milkPrice + carrotPrice + snackPrice;
		
		System.out.println("할인 전 상품가격 : " + totalPrice + "원");
		
		
		double discount = totalPrice * 0.1;
		System.out.println("하린 금액 :" + discount + "원");
		
		double finalAmt = totalPrice - discount;
		System.out.println("최종 결제 금액 : " + finalAmt +"원");
		
		

	}

}
