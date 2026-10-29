package lesson15.q05.question;

public class Question05 {

	public static void main(String[] args) {
		
		//山田太郎さんはクーポンを持っていない

		Member member = new Member("山田太郎");

		System.out.println("会員名：" + member.getName());

		if (member.getCouponCode().equals("WINTER2026")) {
			System.out.println("冬季キャンペーン割引が適用されます");
		} else {
			System.out.println("適用できるクーポンがありません");
		}
	}
}