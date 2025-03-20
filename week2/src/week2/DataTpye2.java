package week2;

public class DataTpye2 {

	public static void main(String[] args) {
		//char  데이타 타입 => 정수값 저장
		//char => 음수가 없습니다.
		char cData1 = 'A'; // 문자 리터럴 직접 저장
		char cData2 = 65; // 10진수로 저장
		char cData3 = '\u0041'; // 16진수로 저장
		
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);
		
		int cData7 = 'b';
		int cData8 = '하';
		int cData9 = '&';
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		
		int cData10 = cData7 + cData9;
		char cData11 = (char) (cData7 + cData9);
		
		System.out.println("cData10 = " + cData10);
		System.out.println("cData11 = " + cData11);
	}
}
