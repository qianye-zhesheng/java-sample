package lesson15.q03;

public class Answer03 {

	public static void main(String[] args) {
		
		//100円割引クーポンの適用条件：
		//プレミアム会員で1000円以上お買い上げの場合
		
		String rank = "Normal";
		int amount = 1050;
		int premiumDiscount = 0;

		if (amount >= 1000 && rank.equals("Premium")) {
			premiumDiscount = 100;
		}

		int total = amount - premiumDiscount;

		System.out.println("購入金額：" + amount + "円");
		System.out.println("割引額：" + premiumDiscount + "円");
		System.out.println("支払金額：" + total + "円");
	}

}
