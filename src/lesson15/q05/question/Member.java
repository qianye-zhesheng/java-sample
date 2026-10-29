package lesson15.q05.question;

public class Member {

	private String name;
	private String couponCode;

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void receiveCoupon(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getCouponCode() {
		return couponCode;
	}
}
