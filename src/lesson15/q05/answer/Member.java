package lesson15.q05.answer;

public class Member {

	private String name;
	private String couponCode;

	public Member(String name) {
		this.name = name;
		// クーポンコードが空の場合は、空の文字列を入れておく方法
//		this.couponCode = "";
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
