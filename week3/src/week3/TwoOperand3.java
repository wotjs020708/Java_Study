package week3;

public class TwoOperand3 {
	public static void main(String[] args) {
		// MARK: - 비트 논리 연산자 : &(and), |(or), ^
		byte num1 = 45;
		byte num2 = 25;
		int result = num1 & num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("result = " + result);
		
		// &(and) 연산자
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(&) = %6s\n", Integer.toBinaryString(result));
		
		// |(or) 연산자
		result = num1 | num2;
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(|) = %6s\n", Integer.toBinaryString(result));
		
		// ^(XOR) 연산자
		result = num1 ^ num2;
		System.out.printf("num1      = %6s\n", Integer.toBinaryString(num1));
		System.out.printf("num2      = %6s\n", Integer.toBinaryString(num2));
		System.out.printf("result(^) = %6s\n", Integer.toBinaryString(result));
		
	}
}
