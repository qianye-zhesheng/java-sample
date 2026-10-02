package lesson12;

public class Sample02 {

	public static void main(String[] args) {
		PointAccount account = new PointAccount();

		account.addPoints(100);

		System.out.println(account.getPoints());

		account.usePoints(30);

		System.out.println(account.getPoints());
	}

}
