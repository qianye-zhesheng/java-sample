package lesson13;

import java.util.ArrayList;

public class Sample03 {

	public static void main(String[] args) {

		String[] members = new String[3];

		members[0] = "山田太郎";
		members[1] = "鈴木花子";
		members[2] = "佐藤一郎";
	
		members[1] = members[2];
		members[2] = null;


		System.out.println("--配列のlength: " + members.length);

		for (String member : members) {
			System.out.println(member);
		}

		ArrayList<String> memberList = new ArrayList<>();

		memberList.add("山田太郎");
		memberList.add("鈴木花子");
		memberList.add("佐藤一郎");
		
		memberList.remove("鈴木花子");

		System.out.println("--ArrayListのsize() : " + memberList.size());

		for (String member : memberList) {
			System.out.println(member);
		}

	}

}
