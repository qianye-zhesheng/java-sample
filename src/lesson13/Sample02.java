package lesson13;

import java.util.ArrayList;

public class Sample02 {

	public static void main(String[] args) {

		String[] members = new String[3];

		members[0] = "山田太郎";
		members[1] = "鈴木花子";
		members[2] = "佐藤一郎";

		// これはエラーになる
//		members[3] = "吉田良子"; 

		System.out.println("--配列の中身--");

		for (String member : members) {
			System.out.println(member);
		}

		ArrayList<String> memberList = new ArrayList<>();

		memberList.add("山田太郎");
		memberList.add("鈴木花子");
		memberList.add("佐藤一郎");
		memberList.add("吉田良子");

		System.out.println("--ArrayListの中身--");

		for (String member : memberList) {
			System.out.println(member);
		}

	}

}
