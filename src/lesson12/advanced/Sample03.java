package lesson12.advanced;

import lesson12.PointAccount;

public class Sample03 {

	public static void main(String[] args) {

		Member yamada = new Member("山田太郎");
		PointAccount account = yamada.getPointAccount();

		account.addPoints(100);
		account.usePoints(30);

		System.out.println(yamada.getName() + "さんのポイント残高:");
		System.out.println(account.getPoints() + "pt");
	}

}
