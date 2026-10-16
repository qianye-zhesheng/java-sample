package lesson13;

public class PremiumMember extends Member {
	
	
	public PremiumMember(String name, int birthYear) {
		super(name, birthYear);
	}

	@Override
	public String getName() {
		String name = super.getName();
		return "★特別会員★" + name + "様";
	}
	
}
