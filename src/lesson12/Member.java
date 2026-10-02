package lesson12;

public class Member {

	private String name;
	private int birthYear;

	public Member(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public int calculateAge(int currentYear) {
		return currentYear - birthYear;
	}

	public void display(int currentYear) {
		System.out.println("会員名：" + name);
		System.out.println("年齢：" + calculateAge(currentYear) + "歳");
	}
}
