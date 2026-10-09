package lesson12;

public class Member {

	private String name;
	private int birthYear;

	public Member(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public int calculateAge() {
		return 2026 - birthYear;
	}

	public void display() {
		System.out.println("会員名：" + name);
		System.out.println("生まれた年:" + birthYear);
	}
}
