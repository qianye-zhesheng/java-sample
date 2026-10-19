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

}
