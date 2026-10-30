package lesson15.q03;

import java.util.ArrayList;

public class Answer02 {

	public static void main(String[] args) {
		ArrayList<Integer> pointHistory = new ArrayList<>();

		pointHistory.add(120);
		pointHistory.add(-50);
		pointHistory.add(80);

		int total = 0;

		for (int i = 0; i < pointHistory.size(); i++) {
			total += pointHistory.get(i);
		}

		System.out.println("現在のポイント残高：" + total);
	}

}
