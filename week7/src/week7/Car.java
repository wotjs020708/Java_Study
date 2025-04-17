package week7;

public class Car {
	// Car 객체가 가지는 속서을 정의 => 필드
	String company = "핸대자동차";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 생성자가 없으면 컴파일러가 기본 생성자를 자동으로 만들어
	// 생성자가 하나라도 정의되어 있으면 기본 생성자는 안만들어짐
	
	// 생성자가 여러 개 선언 => 생성자 오버로딩(overloading)
	// 초기화를 다양하게 할 수 있도록 제공
	Car() {
		// 기본 생성자
	}
	Car(String model) {
		this.model = model;
		this.color = "black";
		this.maxSpeed = 300;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		this.maxSpeed = 250;
		
	}
	
	// 매개변수가 있는 생성자 정의
	Car(String model, String color, int maxSpeed) {
		// 생성자의 기본 역할은 필드값의 초기화를 담당하는 것
		// 매개변수와 필드명이 동일한 경우
		// 객체 자신을 참조하는 this를 사용해야 함
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
