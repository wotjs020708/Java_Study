package week2;

public class ProductPrice {
	public static void main(String[] arge) {
		int number = 7;
		int totalPrice = 5700;
		
		// 단가 = 총 금액 / 개수
		// int/int => 겨로가도 int
		double aPrice = (double) totalPrice / number;
		
		System.out.println("구매 수량: " + number + "개");
		System.out.println("총 구매 금액: " + totalPrice + "원");
		System.out.printf("상품 단가 : %.1f원", aPrice);
		
			
	}
}
