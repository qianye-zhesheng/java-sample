package lesson15.q04.answer;

public class PremiumMember extends Member {
	
	@Override
	public String getMemberType() {
		return "プレミアム会員";
	}
 	
	@Override
	public int getDiscountRate() {
		return 10;
	}
}