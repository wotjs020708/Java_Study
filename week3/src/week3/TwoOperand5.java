package week3;

public class TwoOperand5 {

	public static void main(String[] args) {
		//MARK: - 복합 대입 연산자 : +=, -=, *=, /= .....
		int result = 10;
		
		int result2 = result + 10;
		// 변수의 재활용 
		// result = result + 10;
		result += 10;
		
		
		//result = result -3;
		result -= 3;
		System.out.println(result);
		
		result *= 5;
		System.out.println(result);
		
		result /= 6;
		System.out.println(result);
		
		result %= 4;
		System.out.println(result);

	}
}
