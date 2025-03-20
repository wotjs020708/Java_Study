package week2;

public class Variable {
	public static void main(String[] args) {
		//자바의 기본 데이터 타입 정리
		//직접 값을 주는 초기값 => 리터럴
		
		byte bData = 65; // 1byte
		char cData = 65; // 2byte
		short sData = 65; // 2byte
		int iData  = 65; // 4bute
		long lData = 65; // 8byte
		float fData = 65.12f; // 4byte
		double dData = 65.12; // 8byte
		boolean boolData = true; // 1byte
		
		
		System.out.println("bData = " + bData);
		System.out.println("cData = " + cData);
		System.out.println("sData = " + sData);
		System.out.println("iData = " + iData);
		System.out.println("lData = " + lData);
		System.out.println("fbData = " + fData);
		System.out.println("dbData = " + dData);
		System.out.println("bbData = " + boolData);
	}
}
