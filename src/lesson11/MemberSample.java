package lesson11;

class Member {
	// 会員がもつデータ
	String name;
	int birthYear;

	// 新しい会員を作るときの処理
	Member(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	// 会員が持つ処理
	int calculateAge() {
		return 2026 - birthYear;
	}
}

public class MemberSample {
	public static void main(String[] args) {

		// 会員を作る
		Member yamada = new Member("山田太郎", 2000);
		Member suzuki = new Member("鈴木花子", 2010);
		Member sato = new Member("佐藤一郎", 1960);
		Member tanaka = new Member("田中美咲", 1990);
		Member honjo = new Member("本庄虎之助", 1970);

		// 会員を配列に入れる
		Member[] members = { yamada, suzuki, sato, tanaka, honjo };

		// 会員を1人ずつ取り出して表示する
		for (Member member : members) {
			System.out.println(
					member.name + "：" + 
					member.calculateAge() + "歳");
		}
	}
}
