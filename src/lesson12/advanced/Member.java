package lesson12.advanced;

import lesson12.PointAccount;

public class Member {

	private String name;
	private PointAccount pointAccount;

	public Member(String name) {
		this.name = name;
		this.pointAccount = new PointAccount();
	}

	public String getName() {
		return name;
	}

	public PointAccount getPointAccount() {
		return pointAccount;
	}
}
