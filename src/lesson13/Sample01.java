package lesson13;

public class Sample01 {

	public static void main(String[] args) {
		Member yamada = new Member("山田太郎", 2000);
		
		System.out.println(yamada.getName());
		System.out.println(yamada.calculateAge() + "歳");
		
		System.out.println("-------------------");
		
		PremiumMember suzuki = new PremiumMember("鈴木花子", 2010);
		
		System.out.println(suzuki.getName());
		System.out.println(suzuki.calculateAge() + "歳");
	}

}
