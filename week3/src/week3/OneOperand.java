package week3;

public class OneOperand {

	public static void main(String[] args) {
		// 단항 연산자 : +, -, ++, --, !, ~
		
		int iValue1 = 100;
		int iValue2 = -100;
		double dValue = 3.14;
		double dValue2 = -10.5;
		
		
		int result1 = +iValue1;
		int result2 = -iValue2;
		
		System.out.println("reslut1 =" + result1);
		System.out.println("reslut2 =" + result2);
		
		
		short sValue = 100;
		// int 보다 크기 작은 데이터 타입의 연산은 결과가 int입니다.
//		short sResult = -sValue;
		int sResult = -sValue;
		
		System.out.println("sValue =" + sValue);
		
		byte bValue = -100;
		int bResult = -bValue;
		
		long lValue = 100;
		long lResult = -lValue;
	
		
	}
}
