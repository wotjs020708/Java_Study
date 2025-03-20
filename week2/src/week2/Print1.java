package week2;

public class Print1 {

	public static void mian(String[] args) {
		// main 메서드 단축기 : main + ctrl + spacbar
		// main 메서드 반드시 필요 => JVM이 main을찾아서 실행 => 프로그램 실행의 시작
		// 출력 단축기 : sysout + ctrl + spacbar
		// 실행 단축기 :  ctrl+F11
		System.out.println("객체지향 프로그래밍");

		/* System.out.println("객체");
		System.out.println("지향"); */
		
		//주석 단축키 : ctrl+/ (토글키)
		System.out.println("/*객체지향*/ 프로그래밍");
		
		//숫자 출력 시중으 사항
		System.out.println(17 + 35);
		System.out.println("17 + 35 =" + (17+35));
		
		//다양한 출력 포맷
		//문자열 포멧(printf)
		//%: 프린트 포멧 기호
		//%s: 문자열 출력 
		//%d: 정수 출력 
		//%f: 실수 출력 
		//%n: 줄바꿈 
		
		System.out.printf("이름 : %s\n", "홍길동");
		System.out.printf("나이 : %d", 25);
		System.out.printf("과목: %s %s %s\n", "객체", "지향", "프로그래밍");

		
	}
}