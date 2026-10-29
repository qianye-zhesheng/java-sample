package lesson15.q04.answer;

public class Answer04 {

	public static void main(String[] args) {
		
		//プレミアム会員の割引率は10%
		
        Member member = new PremiumMember();
        
        System.out.println(member.getMemberType());
        System.out.println("割引率:");
        System.out.println(member.getDiscountRate() + "%");
	}

}
