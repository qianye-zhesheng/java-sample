package lesson10;

public class Sample03 {

	public static void main(String[] args) {
		int[] points = {500, -100, 300};
		
		int total = 0;
		
		for (int point : points) {
		
			if (point > 0) {
				System.out.println("ポイント獲得：" + point);
			} else {
				System.out.println("ポイント使用：" + point);
		    }
			
			total = total + point;
		}
		
		System.out.println("--------------------");
		System.out.println("現在のポイント：" + total);
	}
}
