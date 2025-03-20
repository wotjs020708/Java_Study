package week3;

public class OneOperand2 {

	public static void main(String[] args) {
		//MARK: - 단항 연산자 : ++, -- (증감 연산식)
		//MARK: - ++: 자신의 값에 1을 더한다.
		
		int x = 10;
		int y = 10;
		int z;
		//MAKR: - ++ 기호가 왼쪽(앞)에 있으면 : 명령문을 실행하기 전에 1 증가
		System.out.println("++x = " + (++x));
		//MARK: -  ++ 기호가 오른쪽(뒤)에 있으면 : 명령문을 먼저 실행하고 다음 라인으로 가기 전에 1을 증
		System.out.println("x++ = " + (x++));
		System.out.println("x = " + x);
		
		// x = 12
		//MARK: - -- 기호: 자신의 값을 1감
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		// z = 12, x = 13
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
