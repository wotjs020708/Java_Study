package week2;

public class DataTpye {

	public static void main(String[] args) {
		//실수 데이 타입
		//실ㅇ수 리털러 저장
		
		float fValue = 3.14f;
		double dValue = 3.14; // 실수 리터럴은 기본값이
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		//실수의 정말도 테스트
		fValue = 0.1234567890123456789f;
		dValue = 0.1234567890123456789;
		
		System.out.println("fValue = " + fValue);
		System.out.println("dValue = " + dValue);
		
		//e 사용하기
		int iData = 4500000;
		float fData = 3.e7f;
		double dData1 = 3.e7;
		double dData2 = 3.e-7;
		
		System.out.println("iData = " + iData);
		System.out.println("fData = " + fData);
		System.out.println("dData1 = " + dData1);
		System.out.println("dData2 = " + dData2);
		
		System.out.println();
		System.out.printf("iData = %d\n", iData);
		System.out.printf("fData = %f\n", fData);
		System.out.printf("dData1 = %f\n", dData1);
		System.out.printf("dData2 = %f\n", dData2);
		System.out.println();
		System.out.printf("fData = %.4f\n", fData);
		System.out.printf("dData1 = %.2f\n", dData1);
		System.out.printf("dData2 = %10.8f\n", dData2);
		
		
		
	}
}
