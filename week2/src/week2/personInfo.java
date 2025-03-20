package week2;

public class personInfo {

	public static void main(String[] arge) {
		String name = "어재선";
		int age = 24;
		double height = 177; 
		char gender = 'M';
		Boolean isStudent = true;
		
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		System.out.printf("키: %.1fcm\n", height);
		System.out.println("성별: " + gender);
		System.out.println("학생 여부: " + isStudent);	
	}
}
