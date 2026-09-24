package lesson10;

public class Sample0201 {

	public static void main(String[] args) {
        String name = "田中太郎";
        int age = 25;

        System.out.println("氏名：" + name);
        System.out.println("年齢：" + age);
        
        int birthYear = 2026 - age;
        System.out.println("生まれた年：" + birthYear);
        
        boolean existing = true;

        if (existing) {
            System.out.println("会員情報を更新しました。");
        } else {
            System.out.println("会員情報を登録しました。");
        }
	}

}
