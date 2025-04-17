package week7;

public class CarEx {

	public static void main(String[] args) {
		// 객체 생성
		// Car() : 생성
		Car myCar = new Car();

		// 필드 값 읽기
		// 필드값은 반드시 객체명을 통해서 접근
		
		System.out.println("제조회사:" + myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("색 상:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도:" + myCar.speed);
		
		// 필드값 변경
		myCar.speed = 100;
		System.out.println("현재속도:" + myCar.speed);
		
		// 다ㅓ른 객체 생성
		Car yourCar = new Car();
		System.out.println("Yourcar");
		System.out.println("제조회사:" + yourCar.company);
		System.out.println("모델명:" + yourCar.model);
		System.out.println("색 상:" + yourCar.color);
		System.out.println("최고속도:" + yourCar.maxSpeed);
		System.out.println("현재속도:" + yourCar.speed);

		// 매개변수를 이용한 객체 생성
		Car myCar2 = new Car("그랜저","white",200);
		System.out.println("제조회사:" + myCar2.company);
		System.out.println("모델명:" + myCar2.model);
		System.out.println("색 상:" + myCar2.color);
		System.out.println("최고속도:" + myCar2.maxSpeed);
		System.out.println("현재속도:" + myCar2.speed);
		
		Car yourCar2 = new Car("소나타", "black",250);
		System.out.println("제조회사:" + yourCar2.company);
		System.out.println("모델명:" + yourCar2.model);
		System.out.println("색 상:" + yourCar2.color);
		System.out.println("최고속도:" + yourCar2.maxSpeed);
		System.out.println("현재속도:" + yourCar2.speed);
	}

}
