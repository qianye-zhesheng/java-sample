package lesson12;

public class Sample01 {

	public static void main(String[] args) {

		Member yamada = new Member("山田太郎", 2000);

		int age = yamada.calculateAge();
		System.out.println(age);

		yamada.display();

	}
}
