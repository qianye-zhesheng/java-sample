package answer20261020;

public class Answer01 {

	public static void main(String[] args) {
		
		//Stringは、イミュータブル（一度作ったインスタンスは変えない）
		
		String a = "あ";
		String b = a; // 参照をコピー
		
		a = "い"; // 「あ」とは別に新しく「い」というインスタンスが作られる
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("a == b : " + (a == b));
		
		
		
		
		//Stringは同じ値があれば再利用する
		
		String c = "う";
		String d = "う";
		
		System.out.println("c == d : " + (c == d));
		
		
		
		
		//強制的に別のインスタンスにすると
		
		String e = new String("え");
		String f = new String("え");
		
		System.out.println("e == f : " + (e == f));
		
		
		
		//Integerなどでもイミュータブル
		
		Integer num1 = 2000;
		Integer num2 = num1;
		
		num1 = 3000;
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		
		
	}

}
