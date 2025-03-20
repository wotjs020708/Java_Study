package week3;

public class TwoOperand6 {

	public static void main(String[] args) {
		//MARK: 삼항 연산자 => (조건식) ? 참인경우실행 : 거짓인경우실행
		int num1 = 35;
		int num2 = 47;
		
		String result;
		
		result = (num1 > num2)? "num1이 더크다" : "num2이 더크다";
		System.out.println(result);
		
		boolean bResult;
		bResult = (num1 > num2)? true : false;
		System.out.println(bResult);
		
		System.out.println();
		int score = 85;
		String result2;
		
		result2 = (score >= 90)? "우수" : ((score >= 80)? "보통" :"미달");
		System.out.println(result2);
		

	}

}
