package week9;

public class StudentEx {

	public static void main(String[] args) {
		Student student1 = new Student("홍길동", 100, 100, 62);
		
		System.out.printf("%s : 총점 %d점, 평균 %.1f", student1.name, student1.getTotal(), student1.getAve());

	}

}
