package lesson10;

public class Sample0202 {

	public static void main(String[] args) {
        String name = "田中太郎";
        int age = 18;

        System.out.println("氏名：" + name);
        System.out.println("年齢：" + age);
        
        boolean authenｔicated = true;

        if (age >= 18 && authenｔicated) {
            System.out.println("会員情報を登録しました。");
        } else {
            System.out.println("登録できません");
        }
	}

}
