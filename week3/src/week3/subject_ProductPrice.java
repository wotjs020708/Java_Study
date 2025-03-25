package week3;

class Product {
	String name;
	Boolean isVegetable;
	int price;
	int count;
	
	public Product(String name, boolean isVegetable, int price, int count) {
		this.name = name;
		this.isVegetable = isVegetable;
		this.price = price;
		this.count = count;	
	}
	
	public int totalPrice() {
		return this.price * this.count;
	}
}

public class subject_ProductPrice {
	
	public static void main(String[] args) {
		
		Product[] product = new Product[3];
		
		product[0] = new Product("우유", false, 4500, 1);
		product[1] = new Product("당근", true, 1000, 3);
		product[2] = new Product("과자", false, 1500, 2);
		double rate = 25;
		int totalPrice = 0;
		double discount = 0;
		
		// 할인 전 상품 각격 
		for(int i = 0; i < product.length; i++) {
			totalPrice += product[i].totalPrice();
		
		}
		System.out.println("할인 전 상품가격 : " + totalPrice + "원");
		// 할인 가격
		for(int i = 0; i < product.length; i++) {
			if (product[i].isVegetable == false) {
				discount +=  (product[i].totalPrice() / 100) * rate;
			}
		}
		System.out.println("할인 금액 :" + discount + "원");
		
		double finalAmt = totalPrice - discount;
		System.out.println("최종 결제 금액 : " + finalAmt +"원");
		
		
	}
}
