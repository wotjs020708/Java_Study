package week7;

public class petEx {

	public static void main(String[] args) {
		Pet pet1 = new Pet("바둑이", "강아지", 3);
		
		System.out.printf("이름: %s \n종류: %s \n나이: %d살\n", pet1.name, pet1.type, pet1.age);

	}

}
