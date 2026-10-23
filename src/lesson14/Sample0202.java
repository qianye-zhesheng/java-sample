package lesson14;

public class Sample0202 {

	public static void main(String[] args) {
		String inputAge = "35a";

		try {
			int age = Integer.parseInt(inputAge);
			System.out.println("年齢:" + age);

		} catch (NumberFormatException error) {
			System.out.println("年齢は整数で入力してください");
		}

	}

}
