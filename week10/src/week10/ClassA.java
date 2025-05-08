package week10;

public class ClassA {
	// 오버로딩 된 생성자 이용해서 객체 생성
	ClassA c1 = new ClassA(true);
	ClassA c2 = new ClassA(10);
	ClassA c3 = new ClassA("문자");
	
	
	// 생성자 오버로딩
	ClassA(int data) {
		// 접근제한자가 생략되면 default 적용
		// default: 같은 패키지 내에서만 사용가
	}
	
	public ClassA(boolean data) {
		// public : 모든 패키지에서 접근 가능
	}
	
	private ClassA(String data) {
		// private : 자기 클래스 안에서만 사용 가능
	}
}
