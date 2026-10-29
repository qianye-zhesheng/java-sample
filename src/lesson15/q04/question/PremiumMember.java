package lesson15.q04.question;

public class PremiumMember extends Member {
	
	@Override
	public String getMemberType() {
		return "プレミアム会員";
	}
 	
	public int getDiscountRate(int amount) {
		return 10;
	}
}