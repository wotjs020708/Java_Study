package week9;

public class Student {
	String name;
	int kor, eng, math;

	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return this.kor + this.eng + this.math;
	}
	
	double getAve() {
		return (double)getTotal() / 3;
	}
}
