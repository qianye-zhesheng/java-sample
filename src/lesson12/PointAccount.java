package lesson12;

public class PointAccount {

	private int points = 0;

	public int getPoints() {
		return points;
	}

	public void addPoints(int amount) {
		points = points + amount;
	}

	public void usePoints(int amount) {
		points = points - amount;
	}
}
