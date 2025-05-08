package week10;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		// private은 외부에서 접근 불가.
//		myCar.company = "현대자동차";
		
		// setter() 이용
		myCar.setCompany("현대자동차");
		myCar.setModel("그랜저");
		myCar.setColor("white");
		
		//getter() 이용
		
		System.out.println(myCar.getCompany());
		System.out.println(myCar.getModel());
		System.out.println(myCar.getColor());
	}

}
